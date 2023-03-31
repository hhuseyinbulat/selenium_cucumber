package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.DataTablesPage;
import utilities.Driver;

public class DataTablesStepDefinitions {
    DataTablesPage dataTablesPage =new DataTablesPage();
    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
    }
    @When("kullanici new butonuna tıklar")
    public void kullanici_new_butonuna_tıklar() {
    dataTablesPage.newButon.click();
    }
    @And("kullanici first name {string} girer")
    public void kullanici_first_name_girer(String string) {
    dataTablesPage.firstName.sendKeys(string);
    }
    @And("kullanici last name {string} girer")
    public void kullanici_last_name_girer(String string) {
    dataTablesPage.lastName.sendKeys(string);
    }
    @And("kullanici positions {string} girer")
    public void kullanici_positions_girer(String string) {
    dataTablesPage.position.sendKeys(string);
    }
    @And("kullanici office {string} girer")
    public void kullanici_office_girer(String string) {
    dataTablesPage.office.sendKeys(string);
    }
    @And("kullanici extension {string} girer")
    public void kullanici_extension_girer(String string) {
    dataTablesPage.extension.sendKeys(string);
    }
    @And("kullanici start_date {string} girer")
    public void kullanici_start_date_girer(String string) {
    dataTablesPage.startDate.sendKeys(string);
    }
    @And("kullanici salary {string} girer")
    public void kullanici_salary_girer(String string) {
    dataTablesPage.salary.sendKeys(string);
    }
    @And("kullanici create butonuna tıklar")
    public void kullanici_create_butonuna_tıklar() {
    dataTablesPage.create.click();
    }
    @When("kullanici firstname ile {string} arar")
    public void kullanici_firstname_ile_arar(String string) {
        dataTablesPage.search.sendKeys(string);
    }
   @Then("firstname {string} in olustugunu test et")
   public void firstname_in_olustugunu_test_et(String string) {
       assert dataTablesPage.name.getText().contains(string);
   }



}
