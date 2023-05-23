package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags =  "@hmc",//ikisine aynı ismi verip iki scenarioyu da çalıştırabiliriz
        dryRun = false

)

public class Runner {
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
     */
}
