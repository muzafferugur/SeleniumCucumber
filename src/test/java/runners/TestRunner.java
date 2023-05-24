package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//raporlarin daha okunaklı olmasi icin
                "html:target/default-cucumber-reports.html",//raporlama  için gerekli plugin
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags =  "@pr1",//ikisine aynı ismi verip iki scenarioyu da çalıştırabiliriz
        dryRun = false

)

public class TestRunner {
    /*
    Bir framework'de bir tek Runner class'i yeterli olabilir.
    Runner class'inda class body'sinde hiç bir şey olmaz.
    Runner class'imizi önemli yapan 2 tane annotation vardır.

    @RunWith(Cucumber.class) notasyonu Runner class'ina calisma özelliği katar.
    Bu notasyon olduğu için Cucumber framework'ümüzde JUnit kullanmayı tercih ediyoruz.

    features: Runner dosyasının feature dosyalarını nereden bulacağını tarif eder.
    glue: step definitions dosyalarını nereden bulacağını tarif eder.
    tags: o an hangi tag'ı çalıştırmak istiyorsak onu belli eder.
    dryRun: iki seçenek var.
    ı.dryRun=true => yazdığımızda Testimizi çalıştırmadan sadece eksik adımları bize verir./sadeece kontrol eder eksik adım var mı yok mu, hiç bir şeyi çalıştırmaz
    ıı.dryRun=false => yazdığımızda Testlerimizi çalıştırır.

Html Rapor Ekleme
        ***Cucumber raporları, şirketlerin Cucumber kullanmasının ana nedenlerinden biridir.

        **Html rapor almak icin runner classına eklenti(plugin) ekl ememiz yeterlidir.

Yeni Raporlar Ekleme
        ***Plugin ekleyerek yeni raporlar da olusturabiliriz

        **Tester’lar icin onemli olan rapor Html olsa da json ve xml formatinda da rapor almak
        mumkundur.

        *Ayrica maven cucumber reporting plugin yuklemek istersek pom.xml’e plugin
        ekleyebiliriz

     */
}
