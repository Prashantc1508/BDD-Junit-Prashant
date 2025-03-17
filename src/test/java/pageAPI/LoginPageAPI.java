package pageAPI;

import io.restassured.RestAssured;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import utility.CommonAPI;

import static io.restassured.RestAssured.*;

public class LoginPageAPI {

    CommonAPI commonAPI = new CommonAPI();

    public void getResponseBookingID() {
        String response = commonAPI.get("/booking/1",200);
        JSONObject jsonObject = new JSONObject(response);
        String firstName = jsonObject.getString("firstname");
        String checkIn = jsonObject.getJSONObject("bookingdates").getString("checkin");
        //Assert.assertEquals("","Eric",firstName);
    }

    public void postResponseBookingID() {
        String body = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        String response = commonAPI.post("",body,201);
        JSONObject jsonObject = new JSONObject(response);
        String firstName = jsonObject.getString("firstname");
        String checkIn = jsonObject.getJSONObject("bookingdates").getString("checkin");
        Assert.assertEquals("","Eric",firstName);
    }




}
