package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//raporlarin daha okunaklı olmasi icin
                "html:target/default-cucumber-reports2.html",//raporlama  için gerekli plugin
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml",

        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags =  "@pr2",//ikisine aynı ismi verip iki scenarioyu da çalıştırabiliriz
        dryRun = false

)
public class TestRunner2 {
}
