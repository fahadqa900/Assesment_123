package com.metlife.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.metlife.utils.WebdriverUtils.driver;

public class pageobjects_a2 {
    public static By about = By.xpath("(//a[contains(text(),'About')])[2]");
    public static By ListOfCandidates = By.xpath("//*[contains(text(),'List of Candidates')]");
//    WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'List of Candidates')]"));
    public static By tr_table = By.xpath("//*[@id=\"footable_483\"]/tbody/tr");
//    @FindBy(xpath = "//*[@id=\\\"footable_483\\\"]/tbody/tr[" + i + "]/td[1]")
//    WebElement
}
