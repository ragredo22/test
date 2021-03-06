package co.com.yourcompany.certification.nameproject.stepdefinitions;

import co.com.yourcompany.certification.nameproject.exceptions.ValidateException;
import co.com.yourcompany.certification.nameproject.model.CreateEndavaChallengeEntity;
import co.com.yourcompany.certification.nameproject.questions.LookForTheBook;
import co.com.yourcompany.certification.nameproject.tasks.SearchABook;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static co.com.yourcompany.certification.nameproject.exceptions.ValidateException.LOOK_FOR_A_BOOK;
import static co.com.yourcompany.certification.nameproject.tasks.OpenBrowser.theEndavaChallengeSite;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EndavaChallengeStepDefinition {


    @Given("^(.*) visit the page amazon$")
    public void iVisitThePageAmazon(String actorName) {
        theActorCalled(actorName).wasAbleTo(theEndavaChallengeSite());

    }

    @When("^I'm looking for a book$")
    public void iMLookingForABook(List<String> data){
        CreateEndavaChallengeEntity.setLookFor(data);
        theActorInTheSpotlight().attemptsTo(SearchABook.withTheFollowinData());


    }

    @Then("^I see two interesting books$")
    public void iSeeTwoInterestingBooks(){

        theActorInTheSpotlight().should(seeThat(LookForTheBook.wasSuccessful()).orComplainWith(ValidateException.class, LOOK_FOR_A_BOOK));
    }




}
