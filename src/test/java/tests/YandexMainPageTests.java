package tests;

import categories.AwesomeTest;
import org.junit.jupiter.api.DisplayName;
import testUtils.BaseTest;

@DisplayName("Yandex main page tests")
class YandexMainPageTests extends BaseTest {

    @AwesomeTest
    @DisplayName("Yandex main page opens")
    void testOpenYandexMainPage() {

        mainPageSteps.openMainPage("https://www.yandex.ru/");
        mainPageSteps.checkMainPageIsOpened();

    }

    @AwesomeTest
    @DisplayName("Yandex search")
    void testYandexSearch() {

        mainPageSteps.openMainPage("https://www.yandex.ru/");
        mainPageSteps.inputSearchText("Space 307");

    }

}
