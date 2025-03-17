package utility;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class CommonAPI {



    public String get(String resourceURI, int statusCode){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        String response = given().header("ContentType","application/json").log().all()
                .when().get(resourceURI)
                .then().log().all().assertThat().statusCode(statusCode).extract().response().asString();

        return response;
    }

    public String post(String resourceURI,String body, int statusCode){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        String response = given().header("ContentType","application/json")
                .header("Accept","application/json").log().all()
                .body(body)
                .when().post(resourceURI)
                .then().log().all().assertThat().statusCode(statusCode).extract().response().asString();

        return response;
    }

    public String put(String resourceURI,String body, int statusCode){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        String response = given().header("ContentType","application/json")
                .header("Accept","application/json").log().all()
                .body(body)
                .when().put(resourceURI)
                .then().log().all().assertThat().statusCode(statusCode).extract().response().asString();

        return response;
    }

    public String delete(String resourceURI,String body, int statusCode){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        String response = given().header("ContentType","application/json")
                .header("Accept","application/json").log().all()
                .body(body)
                .when().delete(resourceURI)
                .then().log().all().assertThat().statusCode(statusCode).extract().response().asString();

        return response;
    }
}
