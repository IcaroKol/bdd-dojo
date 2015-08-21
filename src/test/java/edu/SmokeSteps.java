package edu;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class SmokeSteps {
    
    static WebDriver driver;

    {
        System.setProperty("webdriver.chrome.driver", "/Users/SPOSMEN/projects/velocity/education/bdd-dojo/chromedriver");
        driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);
    }

    @Dado("^ingreso al juego$")
    public void ingreso_al_juego() throws Throwable {
        Selenide.open("http://localhost:4567/");
    }

    @Entonces("^veo el mensaje \"([^\"]*)\"$")
    public void veo_el_mensaje(String message) throws Throwable {
        $(By.id("welcome")).shouldHave(text(message));
    }

    @Entonces("^veo segundo mensaje \"([^\"]*)\"$")
    public void veo_segundo_mensaje(String message) throws Throwable {
        $(By.id("startMessage")).shouldHave(text(message));
    }

    @Cuando("^presiono Start$")
    public void presiono_Start() throws Throwable {
        $(By.id("startMessage")).click();
    }


    @Entonces("^el juego muestra la pantalla de ingreso de jugadores con el mensaje \"([^\"]*)\"$")
    public void el_juego_muestra_la_pantalla_de_ingreso_de_jugadores_con_el_mensaje(String message) throws Throwable {
        // Express the Regexp above with the code you wish you had
        $(By.id("figth")).shouldHave(text(message));
    }


    @After
    public void tearDown(){
        driver.close();
    }
}
