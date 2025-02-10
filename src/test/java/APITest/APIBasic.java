package APITest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class APIBasic {
    public static void main(String[] args) throws IOException {

        // Validate if add place API is working as expected

        // given - all input details
        // when - submit the API - resource, http method
        // Then - validate the response

        // Add place --> Update place with new Address---> Get place to validate if new address is present in response
        // content of the file to string-> content of file can convert into Byte -> Byte data to String

        //    POST Add place API
        RestAssured.baseURI = "https://rahulshettyacademy.com/";
        String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
                .body(new String(Files.readAllBytes(Path.of("C://Users//123//OneDrive//Documents//addPlace.json")))).when().post("maps/api/place/add/json").then().assertThat().statusCode(200)
                .body("scope", equalTo("APP"))
                .header("server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();

        // Printing the respose
        System.out.println(response);
        //   Creating object for JsonPath class to get all the methods
        JsonPath jsonPath = new JsonPath(response);
        String placeID = jsonPath.getString("place_id");
        String scope = jsonPath.getString("scope");
        String status = jsonPath.getString("status");
        System.out.println("Place ID --> " + placeID);
        System.out.println("Scope ---> " + scope);
        System.out.println("status code is " + status);

        //  PUT API to update address

        String newAddress = "old Hubli, Kamadolli";
        given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"place_id\": \"" + placeID + "\",\n" +
                        "    \"address\": \"" + newAddress + "\",\n" +
                        "    \"key\": \"qaclick123\"\n" +
                        "}").
                when().put("maps/api/place/update/json").then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));

//       GET to verify the address updated with new

        String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeID)
                .when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract().response().asString();

        JsonPath jsonPath2 = ReusableMethods.rawToJson(getPlaceResponse);
        String actualAddress = jsonPath2.getString("address");
        System.out.println("Expected Address  --->" + newAddress);
        System.out.println("Actual address    ---> " + actualAddress);
        Assert.assertEquals(newAddress, actualAddress);
    }
}