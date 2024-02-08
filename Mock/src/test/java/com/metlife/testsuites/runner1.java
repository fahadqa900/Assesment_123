package com.metlife.testsuites;


import com.metlife.utils.WebdriverUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class runner1 extends WebdriverUtils {


    @BeforeClass
    public void LaunchBroowser(){
        initialize("chrome");
    }
    @BeforeMethod
    public void LaunchPage(){
        WebdriverUtils.launchBrowser("https://mockexam1cpsat.agiletestingalliance.org/");
    }

    @AfterClass
    public void TearDown(){
        driver.quit();
    }
    @Test(priority=-1)
    public void assess1a() throws InterruptedException {
        testsuite1 t2 = new testsuite1();
        t2.SearchParticipantName("ch");

    }
    @Test(priority = 0)
    public void assess1b() throws InterruptedException {
        testsuite1 t1 = new testsuite1();
        t1.SearchParticipantDesignation("ch");
    }




}
