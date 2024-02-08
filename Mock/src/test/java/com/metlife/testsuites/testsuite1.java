package com.metlife.testsuites;

import com.metlife.pageobjects.pageobjects_a1;
import com.metlife.utils.WebdriverUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static com.metlife.pageobjects.pageobjects_a1.*;
import static org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm.get;


public  class testsuite1 extends WebdriverUtils
    {
        public static WebDriverWait w1;

        public void  SearchParticipantName(String Name) throws InterruptedException {
            PageFactory.initElements(driver, pageobjects_a1.class);
            WebdriverUtils.click(hamburger);
//                    scroll(ListOfElements);
            WebdriverUtils.click(ListOfElements);
            w1 = new WebDriverWait(WebdriverUtils.driver, Duration.ofSeconds(30));
            w1.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
            WebdriverUtils.type(searchBox, Name);
            List<WebElement> l1 = WebdriverUtils.driver.findElements(tr_count);
            System.out.println(l1.size());
            for (int i = 1; i <= l1.size(); i++) {
                Thread.sleep(5000);
                System.out.println(WebdriverUtils.driver.findElement(By.xpath("//*[@id='footable_350']/tbody/tr[" + i + "]/td[2]")));
            }
        }
        public void  SearchParticipantDesignation(String Name) throws InterruptedException {
            WebdriverUtils.click(hamburger);
            //        scroll(ListOfElements);
            WebdriverUtils.click(ListOfElements);
            WebdriverUtils.type(searchBox, "ch");
            List<WebElement> l2 = WebdriverUtils.driver.findElements(tr_count);
            System.out.println(l2.size());
            for (int i = 0; i < l2.size(); i++) {
                Thread.sleep(5000);
                System.out.println(driver.findElement(By.xpath("//*[@id='footable_350']/tbody/tr[" + i + "]/td[3]")).getText());

            }

        }
}
