package com.metlife.testsuites;

import com.metlife.data.data;

import com.metlife.utils.WebdriverUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static com.metlife.pageobjects.pageobjects_a2.*;


public class runner2 extends WebdriverUtils{
    @BeforeClass
    public void LaunchBroowser(){
        initialize("chrome");
    }
    @BeforeMethod
    public void LaunchPage(){
        WebdriverUtils.launchBrowser(" https://mockexam2cpsat.agiletestingalliance.org/ ");
    }

    @AfterClass
    public void TearDown(){
        driver.quit();
    }
    @Test(dataProviderClass = data.class,dataProvider = "validateData")
    public void listOfCandidates(String Test,String CityActual,String YearActual, String candidatesActual, String Expected) throws InterruptedException {
        click(about);
        scroll(driver.findElement(ListOfCandidates));SoftAssert softAssert = new SoftAssert();
        List<WebElement> l1 = driver.findElements(tr_table);
        for (int i = 1; i <= l1.size(); i++) {
            WebElement cityExpected = (driver.findElement(By.xpath("//*[@id=\"footable_483\"]/tbody/tr[" + i + "]/td[1]")));
            WebElement yearExpected = (driver.findElement(By.xpath("//*[@id=\"footable_483\"]/tbody/tr[" + i + "]/td[2]")));
            WebElement noCandidatesExpected = (driver.findElement(By.xpath("//*[@id=\"footable_483\"]/tbody/tr[" + i + "]/td[3]")));
                softAssert.assertEquals(CityActual,cityExpected,"Matched");
                softAssert.assertEquals(YearActual,yearExpected,"Matched");
                softAssert.assertEquals(candidatesActual,noCandidatesExpected,"Matched");
            System.out.println(cityExpected.getText()+"\t"+yearExpected.getText()+"\t"+noCandidatesExpected.getText());
        }
    }
}