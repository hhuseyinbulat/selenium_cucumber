package stepdefinitions;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.BlueRentalHomePage;
import pages.BlueRentalLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;
public class ExcelStepDefinitions {
    //Page Objelerini Olustur
    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;
    ExcelUtils excelUtils;
    List<Map<String,String>> excelData;
    @Given("kullanici {string} bilgileri ile giris yapar")
    public void kullanici_bilgileri_ile_giris_yapar(String string) throws IOException {
        String path="./src/test/resources/testdata/mysmoketestdata.xlsx";
        excelUtils= new ExcelUtils(path,string);
        excelData=excelUtils.getDataList();
//        NOTE Loop kodunu tamamla
        for(Map<String,String> data : excelData){
//            Ana sayfaya git
            Driver.getDriver().get(ConfigReader.getProperty("app_url"));
            blueRentalHomePage = new BlueRentalHomePage();
            blueRentalLoginPage = new BlueRentalLoginPage();
//            ana sayfa login butonuna tikla
            blueRentalHomePage.firstLogin.click();
            ReusableMethods.waitFor(3);
//            emaili gonder
            blueRentalLoginPage.email.sendKeys(data.get("username"));
            ReusableMethods.waitFor(3);
//            sifre gonder
            blueRentalLoginPage.password.sendKeys(data.get("password"));
            ReusableMethods.waitFor(3);
//            login butonuna tikla
            blueRentalLoginPage.login.click();
            ReusableMethods.waitFor(3);
//            GIRIS YAPILDI.GIRIS YAPILDIGINI VERIFY EDELIM.
//            ID gorunur ise giris basarilidir
            Assert.assertTrue(blueRentalHomePage.userID.isDisplayed());
            ReusableMethods.getScreenshot("Login_Goruntusu");
//            LOG OUT YAPALIM
            blueRentalHomePage.userID.click();
            ReusableMethods.waitFor(1);
            blueRentalHomePage.logOutLink.click();
            ReusableMethods.waitFor(1);
            blueRentalHomePage.OK.click();
            ReusableMethods.waitFor(1);

        }
        Driver.closeDriver();
    }
}