package com.metlife.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pageobjects_a1 {
    public static By hamburger = By.xpath("//li[@class='slideout-toggle menu-item-align-right ']");
    public static By ListOfElements =By.linkText("List of Participants");
    public static By searchBox = By.xpath("//input[@placeholder='Search']");
    public static By tr_count = By.xpath("//*[@id=\"footable_350\"]/tbody/tr");
    public static By retrive =By.xpath("//*[@id='footable_350']/tbody/tr");
    public static By td2=By.xpath("//td[2]");
    public static By td3=By.xpath("//td[3]");
}
