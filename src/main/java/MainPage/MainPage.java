package MainPage;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

@FindBy(xpath = "//div[contains(@class, 'main widget')]")
class MainPage extends HtmlElement {

    @FindBy(xpath = "//input[@class='input__control input__input']")
    TextInput searchInput;
    @FindBy(xpath = "//button[contains(@class, 'button_theme_websearch')]")
    Button searchButton;

}
