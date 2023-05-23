package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.hmcPage;
import utilities.ConfigReader;

public class hmcStepDefinitions {
    hmcPage hmcPage=new hmcPage();
    @Then("Log in  yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        hmcPage.loginButonu.click();
    }
    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        hmcPage.usernameKutusu.sendKeys(ConfigReader.getProperties("hmcValidUsername"));
    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperties("hmcValidPassword"));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmcPage.loginButonu2.click();
    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(hmcPage.hotelManagement.isDisplayed());
    }

}
