package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.GuruPage;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guruPage = new GuruPage();

    @Given("cookies sorulursa kabul eder")
    public void cookies_sorulursa_kabul_eder() {
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
                istenenBaslikIndexi=i;
                break;
            }
/*
forloop ile tum sutun başlıklarını bana verilen istenenSutun değeri ile karşılaştırdım
loop bittiğinde başlığın bulunup bulunmadığını kontrol etmek ve bulundu ise yoluna
devam etmek istiyorum
 */
        }
        if (istenenBaslikIndexi !=3){//başlık bulundu



        }else {//başlık bulunamadı
            System.out.println("istenen başlık bulunamadı");
        }
    }
}
