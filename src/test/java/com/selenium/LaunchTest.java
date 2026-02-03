package com.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LaunchTest {

    @Test
    void launchChromeHeadlessAndOpenGoogle() {
        ChromeOptions options = new ChromeOptions();

        // CI-friendly flags
        options.addArguments("--headless=new");        // Headless mode
        options.addArguments("--no-sandbox");          // Needed in many CI environments
        options.addArguments("--disable-dev-shm-usage");// Prevents /dev/shm issues
        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get("https://www.google.com");
            String title = driver.getTitle();
            System.out.println("Page title is: " + title);

            // simple assertion so it becomes a real test
            assertTrue(title.toLowerCase().contains("google"));
        } finally {
            driver.quit();
        }
    }
}
