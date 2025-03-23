package AutoEmailForJob;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailPuttarajaToRequiter {

    public static String getLatestPdfFromFolder(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".pdf")); // Filter PDF files

        if (files == null || files.length == 0) {
            System.out.println("No PDF files found in the folder: " + folderPath);
            return null; // No PDF found
        }

        // Sort files by last modified date (latest first)
        Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());

        return files[0].getAbsolutePath(); // Return the latest PDF file path
    }

    // Method to extract email addresses from a PDF file
    public static Set<String> extractEmailsFromPDF(String pdfPath) {
        Set<String> emailSet = new HashSet<>();
        try (PDDocument document = PDDocument.load(new File(pdfPath))) {
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String text = pdfStripper.getText(document);

            // Regex pattern for email extraction
            Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
            Matcher matcher = emailPattern.matcher(text);

            while (matcher.find()) {
                emailSet.add(matcher.group());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return emailSet;
    }

    // Method to send email with a different PDF attachment
    public static void sendEmailWithAttachment(String toEmail, String subject, String body,
                                               final String senderEmail, final String senderPassword,
                                               String attachmentPdfPath) {
        // SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

//        Properties properties = new Properties();
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.ssl.enable", "true");  // Enable SSL
//        properties.put("mail.smtp.host", "smtp.gmail.com"); // Gmail SMTP
//        properties.put("mail.smtp.port", "465"); // SSL port

        // Authenticate sender
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create a new email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(subject);

            // Create the email body part
            MimeBodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setText(body);

            // Create the attachment part (Different PDF)
            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(new File(attachmentPdfPath));

            // Combine both parts
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(textBodyPart);
            multipart.addBodyPart(attachmentPart);

            // Set content
            message.setContent(multipart);

            // Send the email
            Transport.send(message);
            System.out.println("Email sent successfully with attachment to: " + toEmail);
        } catch (Exception e) {
            System.out.println("Failed to send email to " + toEmail + ": " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String folderPath = "C:/Users/123/OneDrive/Desktop/Puttaraja"; // Change this to your folder path
        String latestPdfPath = getLatestPdfFromFolder(folderPath);

        if (latestPdfPath != null) {
            System.out.println("Latest PDF File: " + latestPdfPath);
        }

        // Set the path to the different PDF that needs to be attached
        String attachmentPdfPath = "C:/Users/123/OneDrive/Desktop/Puttaraja/Resume/Puttaraja_Automation Testing_Bangalore.pdf"; // Change this to the actual attachment PDF path

        // Extract emails from the first PDF
        Set<String> emailList = extractEmailsFromPDF(latestPdfPath);

        // Sender's email credentials
        final String senderEmail = "puttarajbb11@gmail.com"; // Change this
        final String senderPassword = "octjpdelxwasjxat"; // Use an App Password for security

        // Email subject and body
        String subject = "Senior Automation Test Engineer | Bangalore Location | 6+ Yrs | Java - Selenium - Appium";
        String body = "Hi Team,\n" +
                "\n" +
                "I came across your job opening and wanted to let you know that I'm interested in the Test Automation Engineer position. Below are my details:\n" +
                "\n" +
                "Current Role: Senior Automation Engineer\n" +
                "Location: Bangalore\n" +
                "Experience: 6+ years\n" +
                "Skills: Selenium, Appium, Java, TestNG, Cucumber.\n" +
                "Tools: IntelliJ, Jenkins, Git, Jira, Maven, Appium Inspector\n" +
                "Current CTC: 12 LPA\n" +
                "Notice Period: Immediate \n" +
                "Expected CTC: 18 LPA (Fixed)\n" +
                "I would love to discuss how my expertise aligns with your team’s needs. Please let me know if we can connect.\n" +
                "\n" +
                "I'm looking forward to hearing back from you.\n" +
                "\n" +
                "Thanks & Regards,\n" +
                "Puttaraja\n" +
                "8867728615";

        // Send an email with a different PDF attachment to each extracted address
        for (String email : emailList) {
            sendEmailWithAttachment(email, subject, body, senderEmail, senderPassword, attachmentPdfPath);
        }
    }
}