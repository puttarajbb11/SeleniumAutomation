package GitPractices;

public class GitPractices {

    public static void main(String[] args) {
        GitPractices gitPractices = new GitPractices();
        gitPractices.personalDetailsName();
        gitPractices.personalDetailsContactDetails();
    }

    public void personalDetailsName() {
        System.out.println("Name is Puttaraja");
    }

    public void personalDetailsContactDetails() {
        long number = 8867788615L;
        System.out.println("Contact details is " + number);
    }
}