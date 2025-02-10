package APITest.POJO;

import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class SerializationTest {
    public static void main(String[] args) {

        AddPlaceUsingPOJO p = new AddPlaceUsingPOJO();
        p.setAccuracy(50);
        p.setAddress("Hosa Road Electronic city");
        p.setLanguage("Kannada");
        p.setPhoneNumber("8867728615");
        p.setWebsite("https://puttaraja.com");
        p.setName("Puttaraja");
        List<String> myList = new ArrayList<>();
        myList.add("Mobile Shop");
        myList.add("Shoe Shop");
        myList.add("Tea Shop");
        myList.add("coffe Shop");
        p.setTypes(myList);
        Coordinates l = new Coordinates();
        l.setLat(-123232);
        l.setLng(+12345);
        p.setLocation(l);

        RestAssured.baseURI = "https://rahulshettyacademy.com";

        String response = given().log().all().queryParam("key", "qaclick123")
                .body(p)
                .when().post("/maps/api/place/add/json")
                .then().assertThat().statusCode(200).log().all().extract().response().asString();

        System.out.println(response);

    }
}
