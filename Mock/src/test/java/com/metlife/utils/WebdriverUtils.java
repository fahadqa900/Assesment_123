package com.metlife.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class WebdriverUtils {
    public static WebDriver driver;
   public static WebDriverWait wait;

        public static void initialize(String browser){
            switch (browser){
                case "ff": case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "gc": case  "chrome":
                    driver = new ChromeDriver();
                    break;
                default:
                    driver = new ChromeDriver();
                    break;
            }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public static void launchBrowser(String URL){
        driver.get(URL);
    }
    public static void type(By locator, String value){
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        driver.findElement(locator).sendKeys(value);
//        we.clear();

    }
    public static void click(By locator) throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        driver.findElement(locator).click();
        Thread.sleep(3000);
    }
    public static void assertion(String ErrorValue, String ActualValue){
        Assert.assertEquals(ErrorValue,ActualValue);
    }
    public static String gettext(By locator){
        String text= driver.findElement(locator).getText();
        return  text;
    }
    public static void scroll(WebElement element){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);",element);

    }




}
