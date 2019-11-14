package javaBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentTitle {

	public static void main(String[] args) {
System.setProperty("WebDriver.ChromeDriver"," C:\\Users\\dba\\Downloads\\chromedriver_win64\\chromedriver.exe");
WebDriver Driver = new ChromeDriver();
Driver.get("https://www.google.com/");
Driver.navigate().to("");
Driver.getCurrentUrl();
//System.out.println(Driver.getCurrentUrl());// one Approach to get the Title or current url
String pageTitle = Driver.getTitle();// Second Approach
System.out.println(pageTitle);

	}

}
