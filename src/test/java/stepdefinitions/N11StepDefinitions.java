package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.N11HomePage;
import pages.N11MarkalarPage;
import pages.N11SearchPage;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N11StepDefinitions {
    N11HomePage n11HomePage;
    N11MarkalarPage n11MarkalarPage;
    N11SearchPage n11SearchPage;

    @Given("Kulanici {string} sayfasina gider")
    public void kulanici_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
    }

    @When("Kullanici magazalar butonuna tiklar")
    public void kullanici_magazalar_butonuna_tiklar() {
        n11HomePage = new N11HomePage();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(n11HomePage.markalarButton).click(n11HomePage.markalarButton).build().perform();
    }

    @When("Kullanici A butonuna basar")
    public void kullanici_a_butonuna_basar() {
        n11MarkalarPage = new N11MarkalarPage();
        n11MarkalarPage.AButton.click();
    }

    @When("Kullanici A harfiyle baslayan bütün magaza ismlerini excel dosyasına yazdırır")
    public void kullanici_a_harfiyle_baslayan_bütün_magaza_ismlerini_excel_dosyasına_yazdırır() throws IOException {

        n11MarkalarPage = new N11MarkalarPage();
        System.out.println("Marka Sayısı: " + n11MarkalarPage.AliMarkalar.size());

        //   String path="./src/test/resources/testdata/Kitap.xlsx";
        //   String sheetName="Sayfa1";
        //   ExcelUtils excelUtils=new ExcelUtils(path,sheetName);

        //   int columNumber=0;

        //or (int i=0; i<n11MarkalarPage.AliMarkalar.size(); i++){

        //   if ((i>0)&&(i%101==0)){
        //       columNumber++;
        //   }
        //   excelUtils.setCellData(n11MarkalarPage.AliMarkalar.get(i).getText(),i,columNumber);
        //

    }

    @Then("Kullanici dataların excel dosyasına yazdirildigini dogrular")
    public void kullanici_dataların_excel_dosyasına_yazdirildigini_dogrular() {

    }


    //2.CASE
    @When("Kullanici Kulaklık arar")
    public void kullanici_kulaklık_arar() {
        n11HomePage = new N11HomePage();
        n11HomePage.searchBox.sendKeys("kulaklık", Keys.ENTER);
    }

    @When("Kullanici sonuclari yorum sayisina göre sıralar")
    public void kullanici_sonuclari_yorum_sayisina_göre_sıralar() {
        n11SearchPage = new N11SearchPage();
        // Select select= new Select( n11SearchPage.selectMenu);

        n11SearchPage.dahaSonraButton.click();

        n11SearchPage.selectMenu.click();

        ReusableMethods.clickElementByJS(n11SearchPage.selectMenuYorumSayisi);


    }

    @When("Kullanici ücretsiz kargolari listeler")
    public void kullanici_ücretsiz_kargolari_listeler() {
        n11SearchPage = new N11SearchPage();
        //Actions actions=new Actions(Driver.getDriver());
        //actions.moveToElement(n11SearchPage.kargo).click(n11SearchPage.kargo).build().perform();
        ReusableMethods.scrollIntoViewJS(n11SearchPage.kargo);
        ReusableMethods.clickElementByJS(n11SearchPage.kargo);
        ReusableMethods.scrollIntoViewJS(n11SearchPage.ucretsizKargo);
        ReusableMethods.clickElementByJS(n11SearchPage.ucretsizKargo);
    }

    @When("Kullanici ilk sayfadan ilk ve son ürünü sepete ekler")
    public void kullanici_ilk_sayfadan_ilk_ve_son_ürünü_sepete_ekler() {

        ReusableMethods.scrollIntoViewJS(n11SearchPage.urunler.get(0));
        ReusableMethods.clickElementByJS(n11SearchPage.urunler.get(0));
        ReusableMethods.clickElementByJS(n11SearchPage.kirmiziRenk);
        ReusableMethods.waitFor(2);
//ReusableMethods.clickElementByJS(n11SearchPage.dahaSonraButton);
//        ReusableMethods.waitFor(2);

        ReusableMethods.clickElementByJS(n11SearchPage.sepeteEkle);
        ReusableMethods.waitFor(4);
        ReusableMethods.scrollIntoViewJS(n11SearchPage.urunler.get(n11SearchPage.urunler.size() - 1));
        ReusableMethods.waitFor(2);
        ReusableMethods.clickElementByJS(n11SearchPage.urunler.get(n11SearchPage.urunler.size() - 1));
        ReusableMethods.waitFor(2);
        // ReusableMethods.clickElementByJS(n11SearchPage.beyazRenk);
        //ReusableMethods.waitFor(2);
        //ReusableMethods.clickElementByJS(n11SearchPage.sepeteEkle);

    }

    @When("Kullanici sepet butonuna tıklar")
    public void kullanici_sepet_butonuna_tıklar() {
        n11SearchPage = new N11SearchPage();
        n11SearchPage.sepetButton.click();
        ReusableMethods.waitFor(2);
        try {
            ReusableMethods.clickElementByJS(n11SearchPage.dahaSonraButton);
            ReusableMethods.clickElementByJS(n11SearchPage.xButton);
        } catch (Exception e) {
            ReusableMethods.clickElementByJS(n11SearchPage.xButton);
        }

    }
    @When("Kullanici sepette bulunan en ucuz ürünün adetini iki olarak secer")
    public void kullanici_sepette_bulunan_en_ucuz_ürünün_adetini_iki_olarak_secer() {
        n11SearchPage = new N11SearchPage();
        ReusableMethods.clickElementByJS(n11SearchPage.artiButton);
    }





    @When("Kullanici satın al butonuna tıklar")
    public void kullanici_satın_al_butonuna_tıklar() {
        n11SearchPage = new N11SearchPage();
        ReusableMethods.clickElementByJS(n11SearchPage.satinAl);


    }

    @When("Kullanici üye olmadan devam et linkine tıklar")
    public void kullanici_üye_olmadan_devam_et_linkine_tıklar() {
        n11SearchPage = new N11SearchPage();
        ReusableMethods.scrollIntoViewJS(n11SearchPage.misafir);
        ReusableMethods.waitFor(1);
        ReusableMethods.clickElementByJS(n11SearchPage.misafir);
    }

    @Then("Kullanici misafir kullanıcı olarak ödeme sayfasında bulundugunu dogrular")
    public void kullanici_misafir_kullanıcı_olarak_ödeme_sayfasında_bulundugunu_dogrular() {
        n11SearchPage = new N11SearchPage();
        assert Driver.getDriver().getCurrentUrl().contains("misafir");

    }

}
