package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookTestingApp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[1]"));
        element.click();

        Thread.sleep(1000);
        element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
        element.click();

        Thread.sleep(1000);
        element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input"));
        element.sendKeys("Majka");

        Thread.sleep(1000);
        element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));
        element.sendKeys("Waleczna");

        Thread.sleep(1000);
        element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
        element.sendKeys(("mjkdar@gmail.com"));

        Thread.sleep(1000);
        element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[3]/div/div/div[1]/input"));
        element.sendKeys(("mjkdar@gmail.com"));

        Thread.sleep(1000);
        element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input"));
        element.sendKeys(("strzalkaWskazujaca"));

        Thread.sleep(1000);
        element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]"));
        element.click();
        Thread.sleep(1000);
        element.sendKeys(Keys.HOME);
        Thread.sleep(1000);
        element.sendKeys("3");
        element.click();

        Thread.sleep(1000);
        element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]"));
        element.click();
        Thread.sleep(1000);
        element.sendKeys("maj");
        element.click();

        Thread.sleep(1000);
        element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]"));
        element.click();
        Thread.sleep(1000);
        element.sendKeys("2000");
        element.click();

        Thread.sleep(1000);
        element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input"));
        element.click();

        Thread.sleep(1000);
        element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button"));
        element.click();

//        Thread.sleep(1000);
//        WebElement searchField = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button"));
//        searchField.sendKeys("Zarejestruj się");
//        searchField.click();

    }
}
