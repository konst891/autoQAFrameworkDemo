package MainPage;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class MainPageSteps {

    private WebDriver webDriver;
    private MainPage mainPage;

    public MainPageSteps(WebDriver webDriver) {
        init(webDriver);
        this.webDriver = webDriver;
    }

    private void init(WebDriver webDriver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(webDriver)), this);
    }

    public void openMainPage(String url) {
        if(!webDriver.getCurrentUrl().equals(url)) {
            webDriver.get(url);
        }
    }

    @Step("Открытие главной страницы")
    public void checkMainPageIsOpened() {
        assertThat(mainPage.isDisplayed()).as("Main page was not opened").isTrue();
    }

    public void inputSearchText(String searchText) {
        mainPage.searchInput.sendKeys(searchText);
        mainPage.searchButton.click();
    }


}
