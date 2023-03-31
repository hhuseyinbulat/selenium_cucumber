package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import pages.BlueRentalLoginPage;

import java.util.List;
import java.util.Map;

public class BlueRentalLoginStepDefinitions {
    BlueRentalLoginPage blueRentalLoginPage;
    @When("kullanici emaili ve sifresini girer")
    public void kullanici_emaili_ve_sifresini_girer(DataTable dataTable) {
        blueRentalLoginPage=new BlueRentalLoginPage();

        // 1. List<String> olarak datalari depolayabiliriz
     //  List<String> musteriBilgisi=dataTable.row(1);
     //  System.out.println(musteriBilgisi.get(0));
     //  System.out.println(musteriBilgisi.get(1));
     //  blueRentalLoginPage.email.sendKeys(musteriBilgisi.get(0));
     //  blueRentalLoginPage.password.sendKeys(musteriBilgisi.get(1));
     //  blueRentalLoginPage.login.click();
        //2.   Datatable da datalari List<Map<String,String>> de depolayabiliriz
        List<Map<String,String>> musteriBilgisi2 = dataTable.asMaps(String.class,String.class);
        System.out.println(musteriBilgisi2);
        for (Map<String ,String > musteri : musteriBilgisi2){
            blueRentalLoginPage.email.sendKeys(musteri.get("email"));
            blueRentalLoginPage.password.sendKeys(musteri.get("sifre"));
            blueRentalLoginPage.login.click();
        }
    }

}
