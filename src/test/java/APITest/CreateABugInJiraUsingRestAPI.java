package APITest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import java.io.File;

import static io.restassured.RestAssured.*;

public class CreateABugInJiraUsingRestAPI {


    public static void main(String[] args) {
        RestAssured.baseURI = "https://puttarajbb11.atlassian.net/";
        String createResponse = given().header("Content-Type", "Application/json")
                .header("Authorization", "Basic cHV0dGFyYWpiYjExQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjBaVS1wQTdySlBZZGVRZy1XSDRNYkR5dlNsX1lKLUNINldWOG43QlRzTUgyWXVTWHFkeHlxbUlERzhTVG9tLVhPSUc0YjJmaGxVelZ0TjhNcDFmZm1wSTh1aEdQV1pTODFjckg1YmlPR1VtY1lJZERHR2JhWG9uaWlYdHFTMHp2a01FaVdUOTlfRkEzdWczNUFLNjhnaVZuVllwcFluNWM3ZkJEMGx5RjB5S0E9QjIyOTRCQjM=")
                .body("{\n" +
                        "    \"fields\": {\n" +
                        "        \"project\": {\n" +
                        "            \"key\": \"SCRUM\"\n" +
                        "        },\n" +
                        "        \"summary\": \"LifeScience Velocity Pack not working in login page of Reltio-Automation\",\n" +
                        "        \"issuetype\": {\n" +
                        "            \"name\": \"Bug\"\n" +
                        "        }\n" +
                        "    }\n" +
                        "}")
                .log().all().post("rest/api/3/issue").then().log().all().assertThat().statusCode(201).contentType("application/json").extract()
                .response().asString();

        JsonPath js = new JsonPath(createResponse);
        String ID = js.get("id");
        System.out.println("ID ---> " + ID);

        given().pathParams("key", ID).
                header("X-Atlassian-Token", "no-check")
                .header("Authorization", "Basic cHV0dGFyYWpiYjExQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjBaVS1wQTdySlBZZGVRZy1XSDRNYkR5dlNsX1lKLUNINldWOG43QlRzTUgyWXVTWHFkeHlxbUlERzhTVG9tLVhPSUc0YjJmaGxVelZ0TjhNcDFmZm1wSTh1aEdQV1pTODFjckg1YmlPR1VtY1lJZERHR2JhWG9uaWlYdHFTMHp2a01FaVdUOTlfRkEzdWczNUFLNjhnaVZuVllwcFluNWM3ZkJEMGx5RjB5S0E9QjIyOTRCQjM=")
                .multiPart("file", new File("C:/Users/123/Downloads/image (2) (2).png")).log().all()
                .post("rest/api/3/issue/{key}/attachments").then().log().all().assertThat().statusCode(200);


        // add assign
        String updateAssignee = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Basic cHV0dGFyYWpiYjExQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjBaVS1wQTdySlBZZGVRZy1XSDRNYkR5dlNsX1lKLUNINldWOG43QlRzTUgyWXVTWHFkeHlxbUlERzhTVG9tLVhPSUc0YjJmaGxVelZ0TjhNcDFmZm1wSTh1aEdQV1pTODFjckg1YmlPR1VtY1lJZERHR2JhWG9uaWlYdHFTMHp2a01FaVdUOTlfRkEzdWczNUFLNjhnaVZuVllwcFluNWM3ZkJEMGx5RjB5S0E9QjIyOTRCQjM=")
                .pathParam("key1", ID)  // Corrected: Use pathParam instead of queryParam
                .body("{\n" +
                        "    \"accountId\": \"63916a1f5fce844d606d4969\"\n" +
                        "}")
                .when()
                .put("https://puttarajbb11.atlassian.net/rest/api/3/issue/{key1}/assignee")  // Ensure {key1} is replaced with ID
                .then()
                .assertThat()
                .statusCode(204)
                .extract()
                .response()
                .asString();



    }


}
