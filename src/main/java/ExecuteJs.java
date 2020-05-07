import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ExecuteJs extends BaseTest {

    private static final String CONSOLE_LOG = "var test = 'I am text'; console.log(test)";
    private static final String RETURN_TEXT = "return 'text'";

    @Test
    public void testTest() {
        driver.get("https://avto.pro/");
        Object willBeNull = ((JavascriptExecutor) driver).executeScript(CONSOLE_LOG);
        String string = (String) ((JavascriptExecutor) driver).executeScript(RETURN_TEXT);
    }
}
