package RestAssured;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class LoginFromCookie extends BaseTest {

    @Test
    public void loginWithCookie() {
        String www = getAdminCookie();
        driver.get("https://a1.avto.pro/images/avtopro-logo-plain.svg");
        driver.manage().addCookie(new Cookie(
                "_BpanelUser", www, ".avto.pro", "/", null));
        driver.get("https://avto.pro/");
        String id = driver.findElement(By.cssSelector(".user-summary__head__info__param"))
                .getText();
        assertEquals(id, "ID: 660932");
    }

    public static String getAdminCookie() {
        String cookieForLogin = given()
                .param("userAuthorizationLogin", "m.evlantiev@adm.pro")
                .param("userAuthorizationPassword", "TT7DwG47gG4Eexe")
                .param("userAuthorizationRememberMe", "true")
                .when()
                .post("https://avto.pro/system/account/signin/.aspx")
                .then()
                .extract().response().getCookie("_BpanelUser");
        return cookieForLogin;
    }
}
