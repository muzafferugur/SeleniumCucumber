package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.Driver;

import java.time.Duration;

public abstract class HerokuappStepDefinitons {

    HerokuappPage herokuappPage = new HerokuappPage();

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addElementButton.click();
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
