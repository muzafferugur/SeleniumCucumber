package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
     Cucumber'da stepDefinitions package'i içerisinde @Before, @After gibi notasyon varsa
     extends testBase dememize gerek kalmadan her scenario'dan önce veya sonra bu methodlar
     çalışacaktır.

     Bu da bizim isteyebileceğimiz bir durum değildir.

     Cucumber'da @Before, @After kullanma ihtiyacımız olursa bunu stepDefinitions
     package'i altında oluşturacağımız Hooks class'ına koyarız.

     Biz her scenariodan sonra test sonucunu kontrol edip failed olan scenariolar
     için screenshot alması amacıyla @After methodu kullanacağız.

Hooks ve Screen Shot Ekleme
        ***Cucumber hooks, senaryolardan önce veya sonra çalışan kod bloklarına sahip olan bir classtır.(Daha once
        kullandigimiz TestBase gibi)

        **@Before ve @After annotation’ları kullanılarak kodları projemizde ve step definitionlarda kullanabiliriz.

        *Cucumber hooks, kod çalışma akışını daha iyi yönetmemizi kolaylaştırır ve kod fazlalığını
        azaltmamıza yardımcı olur.
     */

    /*
    @Before
    public void setUpScenarios() {
        System.out.println("Before Methodu");
    }

     */
    @After
    public void tearDownScenarios(Scenario scenario) {

        //Eger bir Scenario FAIL ederse, ekran görüntüsünü al ve rapora ekle
        final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            //ekran görüntüsü,          dosya tipi,          ekran görüntüsünün ismi
            scenario.attach(failedScreenshot, "image/png", "screenshots" + scenario.getName());
            Driver.closeDriver();
        }
    }
}
