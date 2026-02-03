package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTest {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com");
    System.out.println("Page title is: " + driver.getTitle());
    driver.quit();
  }
}
