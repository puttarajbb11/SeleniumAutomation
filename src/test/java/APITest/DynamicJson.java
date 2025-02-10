package APITest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DynamicJson {

    @Test(dataProvider = "BooksData")
    public void addBook(String isbn, String aisle) {
        RestAssured.baseURI = "http://216.10.245.166";
        String response = given().header("Content-Type", "application/json").body(Playload.addBook(isbn, aisle)).
                when().post("Library/Addbook.php").then().assertThat().statusCode(200).extract().response().asString();
        JsonPath js = ReusableMethods.rawToJson(response);
        String id = js.get("ID");
        System.out.println("ID ---> " + id);
    }

    @DataProvider(name = "BooksData")
    public static Object[][] getData() {
        // array is a collection of elements
        // Multidimensional array= collection of array
        return new Object[][]{{"asfde", "1234"}, {"cewq", "12345"}, {"asea", "4321"}};
    }
}
