package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class N11HomePage {
    public N11HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='https://www.n11.com/markalar']") public WebElement markalarButton;
    @FindBy(id="searchData") public WebElement searchBox;
}
