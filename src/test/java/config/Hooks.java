package config;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Properties;

public class Hooks {
    public static WebDriver driver;
    private static final Logger LOG = LoggerFactory.getLogger(Hooks.class);

    public static WebDriver getWebDriver() {
        if (driver == null) {
            String browser=getBrowser();

            if (browser.equals("chrome"))
                try {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                } catch (Exception e) {
                    LOG.error("Error encountered while fetching latest driver version");

                    WebDriverManager.chromedriver().version("73.0.3683.68").setup();

                    driver = new ChromeDriver();
                }
            else {
                try {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                } catch (Exception e) {
                    LOG.error("Error encountered while fetching latest driver version");
                }
            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        }
        return driver;
    }

    public static String getBrowser(){
        try{
            Properties prop = new Properties();

            FileInputStream ip = new FileInputStream("src/test/java/config/config.properties");

            prop.load(ip);

            String browser = prop.getProperty("browser");
            return browser;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    @Before
    public void beforeScenario(Scenario scenario) {
        DateFormat completeDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        driver = getWebDriver();
        Date date = new Date();

        LOG.info("Running: {}", scenario.getName());
        LOG.info("Start Time: {}", completeDateFormat.format(date));
    }

    @After
    public void tearDown(Scenario scenario) throws Throwable {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LOG.info("End Time: {}", localDateTime.format(formatter));

        if (scenario.isFailed()) {
            LOG.info("**************** TEST FAILED ****************");
            LOG.info("Last URL: " + driver.getCurrentUrl());

            String lastUrl = "Last URL: " + "<a href=\"" + driver.getCurrentUrl() + "\">" + driver.getCurrentUrl() + "</a>";
            scenario.embed(lastUrl.getBytes(), "text/html");

        } else {
            LOG.info("Last URL: {}", driver.getCurrentUrl());
        }

        driver.close();
        driver.quit();
        driver = null;
    }
}
