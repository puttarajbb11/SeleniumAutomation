package APITest;

import APITest.POJO.GetCourseUsingPOJO;
import APITest.POJO.WebAutomation;
import APITest.POJO.api;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class OAuthTest {
    public static void main(String[] args) {

        String[] courseTitles = {"Selenium Webdriver Java", "Cypress", "Protractor"};
        String response = given().formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                .formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
                .formParam("grant_type", "client_credentials")
                .formParam("scope", "trust")
                .when().log().all()
                .post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();

        System.out.println(response);
        JsonPath js = new JsonPath(response);
        String access_token = js.get("access_token");
        System.out.println("Access_token ---> " + access_token);


        GetCourseUsingPOJO gc = given().queryParam("access_token", access_token)
                .when().log().all()
                .get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").as(GetCourseUsingPOJO.class);
        System.out.println(gc.getLinkedIn());
        System.out.println(gc.getInstructor());
        System.out.println(gc.getCourses());
        System.out.println(gc.getUrl());
        System.out.println(gc.getExpertise());
        System.out.println(gc.getServices());

        List<api> apiCouses = gc.getCourses().getApi();

        for (int i = 0; i < apiCouses.size(); i++) {
            if (apiCouses.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing")) {
                System.out.println(apiCouses.get(i).getPrice());
                break;
            }
        }

        ArrayList<String> a = new ArrayList<>();
        List<WebAutomation> w = gc.getCourses().getWebAutomation();


        for (int j = 0; j < w.size(); j++) {

            a.add(w.get(j).getCourseTitle());

        }

        List<String> expectedArrayList = Arrays.asList(courseTitles);
        Assert.assertEquals(a, expectedArrayList);
    }
}
