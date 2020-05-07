import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchForElementInsideElement extends BaseTest {

    @Test
    public void test1() {


        MainPage mainPage = new MainPage(driver);
        WebElement element = driver.findElement(By.id("auth-form-container"))
                .findElement(By.cssSelector(".auth__link"));
        assertEquals(element.getText(), "Восстановить пароль");
    }
}
