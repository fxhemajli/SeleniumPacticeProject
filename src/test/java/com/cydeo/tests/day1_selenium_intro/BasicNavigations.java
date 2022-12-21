package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tesla.com");
        String currentTitle1 = driver.getTitle();
        System.out.println(currentTitle1);

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();



        // use selenium to navigate forward
        driver.navigate().forward();



        // use selenium to navigate refresh
        driver.navigate().refresh();



        //use navigate.to();
        driver.navigate().to("https://www.google.com");

        //get the title of the page
        currentTitle1 = driver.getTitle();
        System.out.println("currentTitle1 = " + currentTitle1);
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


    }
}
