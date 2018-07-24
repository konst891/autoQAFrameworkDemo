package testUtils;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import MainPage.MainPageSteps;
import utils.WaitActions;
import webDriver.DriverManager;

public class BaseTest {

    private static WebDriver webDriver;
    public static WaitActions waitActions;
    public MainPageSteps mainPageSteps;

    @BeforeAll
    static void setupTest() {
        webDriver = new DriverManager().setupDriver();
        waitActions = new WaitActions(webDriver);
    }

    @BeforeEach
    void setupSteps() {
        initializePages();
    }

    @AfterAll
    static void tearDown() {
        if(webDriver != null) {
            webDriver.quit();
        }
    }

    private void initializePages() {
        mainPageSteps = new MainPageSteps(webDriver);
    }

}
