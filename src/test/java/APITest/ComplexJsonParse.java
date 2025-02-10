package APITest;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class ComplexJsonParse {
    public static void main(String[] args) {
        JsonPath js = new JsonPath(Playload.coursePrice());

        // Print No of courses returned by API
        int numberOfCourses = js.getInt("courses.size()");
        System.out.println("Number of courses --> " + numberOfCourses);

        // Print Purchase Amount
        int getPurchaseAmount = js.getInt("dashboard.purchaseAmount");
        System.out.println("Purchase Amount is ----> " + getPurchaseAmount);

//        Print Title of the first course
        String firstCourse = js.getString("courses[0].title");
        System.out.println("First course ---> " + firstCourse);

//        Print All course titles and their respective Prices
        for (int i = 0; i < numberOfCourses; i++) {
            String courseTitle = js.get("courses[" + i + "].title");
            int coursesPrice = js.get("courses[" + i + "].price");
            System.out.println("Courses Title --> " + courseTitle + " And Courses price --> " + coursesPrice);
        }

//       Print no of copies sold by RPA Course
        System.out.println("Print no of copies sold by RPA Course");
        String title = "Appium";
        for (int i = 0; i < numberOfCourses; i++) {
            String courseTitle = js.get("courses[" + i + "].title");
            if (courseTitle.equalsIgnoreCase(title)) {
                int copiesCount = js.get("courses[" + i + "].copies");
                System.out.println("No of copies sold by " + title + " --> " + copiesCount);
                break;
            }

        }

//         Verify if Sum of all Course prices matches with Purchase Amount

        int total = 0;
        for (int i = 0; i < numberOfCourses; i++) {
            int price = js.get("courses[" + i + "].price");
            int numberOfCopies = js.get("courses[" + i + "].copies");
            total = total + price * numberOfCopies;

        }
        System.out.println("Sum of all Course prices matches with Purchase Amount --> " + total);

        int purchaseAmount = js.getInt("dashboard.purchaseAmount");
        Assert.assertEquals(purchaseAmount, total);
    }
}
