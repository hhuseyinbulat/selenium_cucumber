package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleHuseyinPage {
    public GoogleHuseyinPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@name='q']") public WebElement searchBox;
    @FindBy(xpath = "//a[@href='https://www.haberler.com/']") public WebElement haberler;
}
