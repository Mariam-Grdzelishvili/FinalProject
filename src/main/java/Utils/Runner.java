package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;


public class Runner {

    @BeforeTest
    public static void SetUp() {
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
        open("https://ee.ge/");
    }

    @AfterTest
    public static void teardown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWebDriver();
    }
}
