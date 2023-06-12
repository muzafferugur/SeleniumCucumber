package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;

public class Driver {
    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    ChromeOptions options=new ChromeOptions();
                    options.addArguments("--incognito");//gizli modda çalıştırır
                    options.addArguments("--ignore-certificate-errors");
                    options.addArguments("--allow-insecure-localhost");
                    options.addArguments("--acceptInsecureCerts");
                    options.addArguments("--disable-blink-features=AutomationControlled");
                    options.addArguments("--disable-blink-features");
                    options.addArguments("--start-maximized");
                    options.addArguments("--disable-extensions");
                    options.addArguments("--remote-allow-origins=*"); //403 forbidden hatasını engellemek için
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(options);
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;

                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();

            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}