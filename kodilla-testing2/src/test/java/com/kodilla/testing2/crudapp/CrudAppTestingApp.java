package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CrudAppTestingApp {

//    public static final String XPATH_INPUT = "//html/body/main/section/form/fieldset/input"; // [1]
//
//    public static void main(String[] args) {
//        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
//        driver.get("https://interceptor2048.github.io/");                                    // [2]
//
//        WebElement searchField = driver.findElement(By.xpath(XPATH_INPUT));                  // [3]
//        searchField.sendKeys("New robotic task");                                            // [4]
//    }

// W linii [1] utworzyliśmy stałą zawierającą zbudowane przed chwilą wyrażenie XPath.
// W linii [2] otwieramy stronę internetową z Twoim projektem aplikacji "CRUD App" na serwerach GitHub Pages.
// Pamiętaj, aby zastąpić adres pokazany w snippecie powyżej Twoim własnym adresem aplikacji!
// W linii [3] wyszukujemy pole input przy pomocy metody By.xpath(String xpath).
// W ten właśnie sposób możemy podać wyrażenie XPath, przy pomocy którego Selenium WebDriver ma zlokalizować żądany element na stronie.
// Wreszcie, w linii [4] wstawiamy do odnalezionej kontrolki tekst "New robotic task".



//    public static final String XPATH_INPUT = "//html/body/main/section/form/fieldset/input";
//    public static final String XPATH_TEXTAREA = "//html/body/main/section/form/fieldset[2]/textarea"; // [1]
//
//    public static void main(String[] args) {
//        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
//        driver.get("https://interceptor2048.github.io/");
//
//        WebElement searchField = driver.findElement(By.xpath(XPATH_INPUT));
//        searchField.sendKeys("New robotic task");
//
//        WebElement textareaField = driver.findElement(By.xpath(XPATH_TEXTAREA));  // [2]
//        textareaField.sendKeys("The robotic content");                            // [3]
//    }

// W linii[1] zdefiniowaliśmy kolejną stałą tekstową zawierającą wyrażenie XPath identyfikujące kontrolkę textarea na stronie programu CRUD App.
// W liniach [2]-[3] odnajdujemy ten element na stronie WWW i wpisujemy do niego przykładowy tekst.



//    public static final String XPATH_INPUT = "//html/body/main/section/form/fieldset/input";
//    public static final String XPATH_TEXTAREA = "//html/body/main/section/form/fieldset[2]/textarea";
//    public static final String XPATH_SELECT = "//select[1]";                     // [1]
//
//    public static void main(String[] args) {
//        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
//        driver.get("https://interceptor2048.github.io/");                           //zmiana adresu
//
//        WebElement searchField = driver.findElement(By.xpath(XPATH_INPUT));
//        searchField.sendKeys("New robotic task");
//
//        WebElement textareaField = driver.findElement(By.xpath(XPATH_TEXTAREA));
//        textareaField.sendKeys("The robotic content");
//
//        while (!driver.findElement(By.xpath(XPATH_SELECT).isDisplayed());
//
//        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT));      // [2]
//        Select selectBoard = new Select(selectCombo);                             // [3]
//        selectBoard.selectByIndex(1);                                             // [4]
//    }

// W linii [1] definiujemy kolejną stałą tekstową, zawierającą wyrażenie XPath identyfikujące interesujący nas komponent typu select.
// W linii [2] tworzymy obiekt typu WebElement w sposób, który był stosowany przez nas dotychczas.
// W linii [3] używamy stworzonego obiektu klasy WebElement do utworzenia obiektu klasy Select. Obiekt ten umożliwi nam operowanie na dostępnych do wyboru opcjach.
// Linia [4] to poinstruowanie obiektu klasy Select, aby wybrał z listy rozwijalnej pozycję pod indeksem 1 (indeksy numerowane są od zera).



// Zmodyfikujemy teraz kod naszej aplikacji tak, aby stał się odporny na dodawanie pól typu select
// w pierwszej części formularza – przed wynikami pobranymi z aplikacji:

    public static final String XPATH_INPUT = "//html/body/main/section/form/fieldset/input";
    public static final String XPATH_TEXTAREA = "//html/body/main/section/form/fieldset[2]/textarea";
    public static final String XPATH_WAIT_FOR = "//select[1]";
    public static final String XPATH_SELECT = "//div[contains(@class, \"task-container\")]/form/div/fieldset/select[1]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://interceptor2048.github.io/");

        WebElement searchField = driver.findElement(By.xpath(XPATH_INPUT));
        searchField.sendKeys("New robotic task");

        WebElement textareaField = driver.findElement(By.xpath(XPATH_TEXTAREA));
        textareaField.sendKeys("The robotic content");

      Thread.sleep(5000);

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(1);
    }
}
