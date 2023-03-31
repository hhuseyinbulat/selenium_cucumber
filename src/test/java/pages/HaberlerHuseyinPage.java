package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HaberlerHuseyinPage {
    public HaberlerHuseyinPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//img[@src='https://s.hbrcdn.com/static/img/tasarim/haberler-logo.svg']") public WebElement haberlerIcon;
}
