package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.GoogleHuseyinPage;
import pages.HaberlerHuseyinPage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleHuseyinStepDefinitions {
GoogleHuseyinPage googleHuseyinPage;
HaberlerHuseyinPage haberlerHuseyinPage;
    @Given("Kullanici google a gider")
    public void kullanici_google_a_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }
    @When("Kullanici arama kutusuna {string} yazar ve arama yapar")
    public void kullanici_arama_kutusuna_yazar(String string) {
        googleHuseyinPage=new GoogleHuseyinPage();
        googleHuseyinPage.searchBox.sendKeys(string, Keys.ENTER);
    }
    @When("Kullanici ilk seçeneğe tıklar")
    public void kullanici_ilk_seçeneğe_tıklar() {
        googleHuseyinPage=new GoogleHuseyinPage();
        googleHuseyinPage.haberler.click();
    }
    @Then("Kullanici {string} sayfasında olduğunu doğrular")
    public void kullanici_sayfasında_olduğunu_doğrular(String string) {
        haberlerHuseyinPage=new HaberlerHuseyinPage();
        assert haberlerHuseyinPage.haberlerIcon.isDisplayed();
    }
}
