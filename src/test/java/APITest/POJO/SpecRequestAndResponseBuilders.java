package APITest.POJO;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.openqa.selenium.json.Json;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class SpecRequestAndResponseBuilders {
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

        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123")
                .setContentType(ContentType.JSON).build();

        RequestSpecification request = given().spec(req).body(p);
        ResponseSpecification responseSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
        Response response = request.when().post("/maps/api/place/add/json")
                .then().spec(responseSpec).extract().response();

        String reponseString = response.asString();
        System.out.println(reponseString);


    }
}
