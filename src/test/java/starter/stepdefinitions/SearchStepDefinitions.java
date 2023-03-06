package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.By;
import starter.navigation.NavigateTo;

public class SearchStepDefinitions extends UIInteractionSteps {
    private final By inputSearchNetFlix = By.name("email");
    private final By inputSearchNetAmazon = By.name("field-keywords");

    @Given("{actor} is researching things on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
    }

    @When("he looks up {string}")
    public void searchesForNetflix(String term) {
        for (int i = 0; i <= 7; i++) {
//            Selenium implementation
            $(inputSearchNetFlix).clear();
            $(inputSearchNetFlix).sendKeys(term);
//            Serenity Implementation
//            $(inputSearchNetFlix).type(term);
        }
    }

//    @When("he looks up {string}")
//    public void searchesForAmazon(String term) {
//        for (int i = 0; i <= 7; i++) {
////            Selenium implementation
//            $(inputSearchNetAmazon).clear();
//            $(inputSearchNetAmazon).sendKeys(term);
////            Serenity Implementation
////            $(inputSearchNetAmazon).type(term);
//        }
//    }
}
