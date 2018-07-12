package pageObjects;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

@FindBy(xpath = "//div[contains(@class, 'main widget')]")
public class MainPage extends HtmlElement {

    @FindBy(xpath = "//input[@class='input__control input__input']")
    public TextInput searchInput;
    @FindBy(xpath = "//button[contains(@class, 'button_theme_websearch')]")
    public Button searchButton;
}
