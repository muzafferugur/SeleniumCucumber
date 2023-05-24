package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guruPage = new GuruPage();

    @Given("cookies sorulursa kabul eder")
    public void cookies_sorulursa_kabul_eder() {
        Driver.getDriver().switchTo().frame(guruPage.cookiesIFrame);
        guruPage.acceptAll.click();
    }

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenSutun) {
        List<WebElement> tabloBaslikList = guruPage.baslikListesi;
/*
listemiz web elementlerden oluşuyor dolayısıyla bu web elementlerden
hangisi istenen sutun başlığını taşıyor bilemeyiz
 */
        int istenenBaslikIndexi=-3;
        for (int i = 0; i < tabloBaslikList.size(); i++) {
            if (tabloBaslikList.get(i).getText().equals(istenenSutun)) {
                istenenBaslikIndexi=i+1;
                break;
            }
/*
forloop ile tum sutun başlıklarını bana verilen istenenSutun değeri ile karşılaştırdım
loop bittiğinde başlığın bulunup bulunmadığını kontrol etmek ve bulundu ise yoluna
devam etmek istiyorum
 */
        }
        if (istenenBaslikIndexi !=3){//başlık bulundu

            List<WebElement> istenenSutundakiElementler=
                    Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi+"]"));

            for (WebElement each:istenenSutundakiElementler) {
                System.out.println(each.getText());
            }
        }else {//başlık bulunamadı
            System.out.println("istenen başlık bulunamadı");
        }
    }
}
