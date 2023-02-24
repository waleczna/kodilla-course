package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class CrudAppTestSuite {

    private static final String BASE_URL = "https://interceptor2048.github.io";
    private WebDriver driver;
    private Random generator;

    @BeforeEach
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @AfterEach
    public void cleanUpAfterTest() {
        driver.close();
    }

//    @Test
//    public void shouldCreateTrelloCard() {
//        final String XPATH_TASK_NAME = "/html/body/main/section[1]/form/fieldset[1]/input";
//        final String XPATH_TASK_CONTENT = "";
//        final String XPATH_ADD_BUTTON = "";
//    }

// Klasa stanowiącą zestaw testów, o nazwie CrudAppTestSuite.
// Metoda initTests(), która będzie odpowiedzialna za utworzenie obiektu klasy WebDriver
// i otwarcie strony startowej projektu CRUD App na stronach GitHub Pages.
// Adres strony odczytywany będzie ze stałej o nazwie BASE_URL – wstaw do tej stałej adres Twojej własnej strony GitHub Pages.
// Metoda cleanUpAfterTest, będzie wykonywana po każdym teście.
// Jej kod będzie wywoływał metodę close() WebDrivera, która powoduje zamknięcie okna przeglądarki.
// Wygenerowane wyrażenie XPath ze schowka możesz wkleić w IntelliJ do stałej XPATH_TASK_NAME,
// która będzie przechowywała wyrażenie XPath identyfikujące pole Task name na stronie WWW:



// Analizując kod strony WWW, możesz zauważyć, że pole Task name znajduje się wewnątrz tagu form,
// którego atrybut action zawiera ciąg znaków "createTask". Jest to jedyny element strony,
// który posiada tak zdefiniowaną akcję, stanowi więc dobre miejsce,
// by rozpocząć pisanie relacyjne wyrażenia XPath-Relative. Nasze wyrażenie po zmianie będzie wyglądało w ten sposób:

//    @Test
//    public void shouldCreateTrelloCard() {
//        final String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
//        final String XPATH_TASK_CONTENT = "";
//        final String XPATH_ADD_BUTTON = "";
//    }



// W analogiczny sposób przygotujmy wyrażenia XPath-Relative dla pozostałych stałych:

//    @Test
//    public void shouldCreateTrelloCard() {
//        final String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
//        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
//        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";
//    }


    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";
        String taskName = "Task number " + generator.nextInt(100000);            // [1]
        String taskContent = taskName + " content";                              // [2]

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);                                                 // [3]

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);                                           // [4]

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));   // [5]
        addButton.click();                                                       // [6]
        Thread.sleep(2000);                                                // [7]
    }

// W liniach [1]-[2] tworzymy dwie zmienne typu String, przechowujące wylosowaną nazwę oraz treść zadania.
// W linii [3] wpisujemy nazwę zadania do pola Task name.
// W linii [4] wpisujemy treść zadania do pola Task content.
// Linie [5]-[6] służą odnalezieniu na stronie przycisku Add a task oraz kliknięciu w ten przycisk.
// Niestety (dla osób testujących program CRUD App) wywołanie usług naszej aplikacji backendowej
// (konkretnie usługi dodania zadania) realizowane jest z użyciem technologii AJAX. Skutkuje to tym, że strona
// nie jest przeładowywana. Nie pojawiają się na niej również żadne nowe elementy, na które moglibyśmy zaczekać,
// aby mieć pewność, że zadanie zostało zapisane. Dlatego też w takiej sytuacji zmuszeni jesteśmy do zastosowania
// "sztywnego" timeoutu wynoszącego 2 sekundy. Realizuje to instrukcja w linii [7].

}
