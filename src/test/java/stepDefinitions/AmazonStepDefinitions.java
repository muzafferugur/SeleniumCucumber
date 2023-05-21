package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici Nutella için arama yapar")
    public void kullanici_nutella_için_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("sonuclarin Nutella içerdiğini test eder")
    public void sonuclarin_nutella_içerdiğini_test_eder() {
        String arananKelime = "Nutella";
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        String arananKelime = "Java";
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @And("kullanici iphone için arama yapar")
    public void kullaniciIphoneIçinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);
    }

    @Then("sonuclarin iphone içerdiğini test eder")
    public void sonuclarinIphoneIçerdiğiniTestEder() {
        String arananKelime = "iphone";
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }
}
