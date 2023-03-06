package starter.stepdefinitions;

import com.microsoft.playwright.BrowserType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.abilities.BrowseTheWebWithPlaywright;
import net.serenitybdd.screenplay.playwright.interactions.Enter;
import net.serenitybdd.screenplay.playwright.interactions.Open;
import org.openqa.selenium.By;
import starter.navigation.NavigateTo;
import starter.search.WikipediaArticle;

public class SearchStepDefinitions extends UIInteractionSteps {
    private final By inputSearch = By.name("email");

    @Given("{actor} is researching things on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
    }

    @When("he looks up {string}")
    public void searchesFor(String term) {
        for (int i = 0; i <= 7; i++) {
//            Selenium implementation
            $(inputSearch).clear();
            $(inputSearch).sendKeys(term);
//            Serenity Implementation
//            $(inputSearch).type(term);
        }
    }
}
