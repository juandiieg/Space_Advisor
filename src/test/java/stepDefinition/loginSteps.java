package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.EnterCredentials;
import userInterface.HomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.hasValue;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userInterface.HomePage.BTN_LOGIN;
import static userInterface.HomePage.BTN_USER;

public class loginSteps {

    @Managed(driver = "chrome")
    private WebDriver browser;
    private Actor actor = Actor.named("Juan");
    private HomePage homePage = new HomePage();

    @Given("^That a user accesses the SpaceAdvisor website in the login page$")
    public void thatAUserAccessesTheSpaceAdvisorWebsiteInTheLoginPage() {
        actor.can(BrowseTheWeb.with(browser));
        browser.manage().window().maximize();
        actor.wasAbleTo(Open.browserOn(homePage));
        actor.wasAbleTo(Click.on(BTN_LOGIN));
    }

    @When("^Enter my credentials username (.*), (.*) admin$")
    public void enterMyCredentials(String userName, String passWord) {
        actor.attemptsTo(
                EnterCredentials.fillCredentials(userName, passWord)
        );
    }

    @Then("^Validate the login$")
    public void validateTheLogin() {
        actor.should(
                seeThat(the(BTN_USER), containsText("HELLO, JOHN"))
        );
    }

}
