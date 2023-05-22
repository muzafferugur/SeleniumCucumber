package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags =  "@java",//ikisine aynı ismi verip iki scenarioyu da çalıştırabiliriz
        dryRun = false

)

public class Runner {
    /*
    Bir framework'de bir tek Runner class'i yeterli olabilir.
    Runner class'inda class body'sinde hiç bir şey olmaz.
    Runner class'imizi önemli yapan 2 tane annotation vardır.

    @RunWith(Cucumber.class) notasyonu Runner class'ina calisma özelliği katar.
    Bu notasyon olduğu için Cucumber framework'ümüzde JUnit kullanmayı tercih ediyoruz.

     */
}
