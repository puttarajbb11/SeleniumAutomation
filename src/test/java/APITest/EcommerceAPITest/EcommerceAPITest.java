package APITest.EcommerceAPITest;

import APITest.EcommerceAPITest.POJOClasses.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.testng.Assert;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;

public class EcommerceAPITest {

    public static void main(String[] args) {
        RequestSpecification request = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                .setContentType(ContentType.JSON).build();

        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUserEmail("reltio@gmail.com");
        loginRequest.setUserPassword("Puttu@615");

        RequestSpecification reqLogin = given().log().all().spec(request).body(loginRequest);
        LoginResponsePlayLoad loginResponse = reqLogin.when().post("/api/ecom/auth/login")
                .then().log().all().extract().response().as(LoginResponsePlayLoad.class);
        String token = loginResponse.getToken();
        String userId = loginResponse.getUserId();
        System.out.println("Token ---> " + token);
        System.out.println("UserId ---> " + userId);

        // add Product
        RequestSpecification addProductBaseRequest = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                .addHeader("Authorization", token)
                .build();
        RequestSpecification reqAddProduct = given().log().all().spec(addProductBaseRequest)
                .params("productName", "Laptop")
                .params("productAddedBy", userId)
                .params("productCategory", "Electric")
                .params("productSubCategory", "Laptop")
                .params("productPrice", "45000")
                .params("productDescription", "Laptop with screen touch")
                .params("productFor", "All")
                .multiPart("productImage", new File("C:/Users/123/Downloads/image (2) (2).png"));

        AddProductPoJo addProductResponse = reqAddProduct.when().post("/api/ecom/product/add-product").
                then().log().all().extract().response().as(AddProductPoJo.class);

        String productId = addProductResponse.getProductId();
        String productMessage = addProductResponse.getMessage();
        System.out.println(productId);
        System.out.println(productMessage);

        // place order
        RequestSpecification placeProductBaseRequest = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                .addHeader("Authorization", token).setContentType(ContentType.JSON)
                .build();

        OrderDetailsPoJO orderDetailsPoJO = new OrderDetailsPoJO();
        orderDetailsPoJO.setCountry("India");
        orderDetailsPoJO.setProductOrderedId(productId);

        List<OrderDetailsPoJO> list = new ArrayList<>();
        list.add(orderDetailsPoJO);
        PlaceOrderPOJO placeOrderPOJO = new PlaceOrderPOJO();
        placeOrderPOJO.setOrders(list);

        RequestSpecification placeLogin = given().log().all().spec(placeProductBaseRequest).body(placeOrderPOJO);

        String placeOrderResponse = placeLogin.when().post("/api/ecom/order/create-order")
                .then().log().all().extract().response().asString();
        System.out.println("placeOrderResponse ---> " + placeOrderResponse);

        // delete order
        RequestSpecification deleteProductBaseRequest = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                .addHeader("Authorization", token).setContentType(ContentType.JSON)
                .build();

        RequestSpecification deleteReq = given().log().all().spec(deleteProductBaseRequest).pathParam("productId", productId);

        String deleteResponse = deleteReq.when().delete("/api/ecom/product/delete-product/{productId}").then().log().all()
                .extract().response().asString();
        JsonPath js1=new JsonPath(deleteResponse);
        Assert.assertEquals("Product Deleted Successfully",js1.get("message"));
    }
}
