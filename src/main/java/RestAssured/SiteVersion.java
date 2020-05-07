package RestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

public class SiteVersion {

    @Test
    public void getSiteVersion() {
        String response = given()
                .contentType("application/json")
                .get("https://avto.pro//api/v1/site/version")
                .then()
                .statusCode(200)
                .extract().response().asString();
        System.out.println(response);

        assertTrue(response.contains("ProductVersion"));
    }

}
