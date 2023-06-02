package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public abstract class HerokuappStepDefinitons {

    HerokuappPage herokuappPage = new HerokuappPage();

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addElementButton.click();
    }

    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void deleteButonuGorunurOluncayaKadarBekler() {
/**
 * Delete butonu gorunur oluncaya kadar bekleme sürecini biz selenium-javada yer alan
 * Expilicitly Wait:=>Çoğunlukla belirli öğeler için belirli koşul(expected condition) için kullanılır.(şartlı bekleme) kullanıyoruz.
 * Bu durumu gerçekleştirmek açısından yeni bir wait tanımlanarak ExpectedConditions.visibilityOf() methodu ile şartlı beklemeyi sağlamış bulunmaktayız.
 */
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(herokuappPage.deleteButton));
    }

    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());
    }

    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {
        herokuappPage.deleteButton.click();
    }


}
