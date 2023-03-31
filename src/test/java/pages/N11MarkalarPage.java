package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class N11MarkalarPage {
    public N11MarkalarPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='https://www.n11.com/markalar?brand=A']") public WebElement AButton;

    @FindBy(xpath = "//li[@class='item']//a//strong") public List<WebElement> AliMarkalar;
}
