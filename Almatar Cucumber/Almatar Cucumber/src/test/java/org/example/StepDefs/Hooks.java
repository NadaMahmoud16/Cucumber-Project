package org.example.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static String url="https://almatar.com/en/";

    @Before
    public static void beforeTest(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://almatar.com/en/");
    }

    @After
    public static void afterTest() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
