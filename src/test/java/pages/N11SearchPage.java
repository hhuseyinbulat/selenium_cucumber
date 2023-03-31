package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class N11SearchPage {
    public N11SearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='selectedText']") public WebElement selectMenu;
    @FindBy(xpath = "//*[@data-value='REVIEWS']") public WebElement selectMenuYorumSayisi;
    @FindBy(xpath = "(//button[@class='dn-slide-deny-btn'])[1]") public WebElement dahaSonraButton;
    @FindBy(xpath = "//efilli-layout-n11[@class='efilli-layout-n11']") public WebElement cookie;
    @FindBy(xpath = "//h2[text()='Kargo Seçenekleri']") public WebElement kargo;
    @FindBy(id="freeShipmentOption") public WebElement ucretsizKargo;
    @FindBy(xpath = "//span[text()='+']") public List<WebElement> urunler;
    @FindBy(xpath = "(//span[@class='btnBasket'][normalize-space()='+'])[1]") public WebElement urun1;
    @FindBy(xpath = "(//span[@class='btnBasket'][normalize-space()='+'])[11]") public WebElement urun2;
    @FindBy(xpath = "//*[text()='Kırmızı']") public WebElement kirmiziRenk;
    @FindBy(id = "//*[text()='Beyaz']") public WebElement beyazRenk;
    @FindBy(xpath = "//*[@class='btn baseBtn-green']") public WebElement sepeteEkle;
    @FindBy(xpath = "//*[@class='iconsBasketWhite']") public WebElement sepetButton;
    @FindBy(xpath = "//*[text()='Tamam']") public WebElement tamamButton;
    @FindBy(xpath = "(//*[.='+'])[14]") public WebElement artiButton;
    @FindBy(xpath = "(//*[@class='closeBtn'])[5]") public WebElement xButton;
    @FindBy(id = "js-buyBtn") public  WebElement satinAl;
    @FindBy(xpath = "//a[@title='Üye Olmadan Devam Et']") public WebElement misafir;
    @FindBy(xpath = "//*[text()='Girdiğin telefon numarasını doğrulamanı isteyeceğiz.']") public WebElement sonYazi;


}