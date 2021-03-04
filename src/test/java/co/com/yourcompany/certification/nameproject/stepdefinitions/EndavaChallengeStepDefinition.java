package co.com.yourcompany.certification.nameproject.stepdefinitions;

import co.com.yourcompany.certification.nameproject.tasks.SearchABook;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static co.com.yourcompany.certification.nameproject.tasks.OpenBrowser.theEndavaChallengeSite;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EndavaChallengeStepDefinition {


    @Given("^(.*) visit the page amazon$")
    public void iVisitThePageAmazon(String actorName) {
        theActorCalled(actorName).wasAbleTo(theEndavaChallengeSite());

    }

    @When("^I'm looking for a book$")
    public void iMLookingForABook(List<String> data){

        theActorInTheSpotlight().attemptsTo(SearchABook.withTheFollowinData(data));


    }

    @Then("^I see two interesting books$")
    public void iSeeTwoInterestingBooks(DataTable arg1){

    }




}
