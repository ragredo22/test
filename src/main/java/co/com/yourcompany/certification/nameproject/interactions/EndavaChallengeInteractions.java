package co.com.yourcompany.certification.nameproject.interactions;

import co.com.yourcompany.certification.nameproject.model.CreateEndavaChallengeEntity;
import co.com.yourcompany.certification.nameproject.model.ModelGeneric;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.yourcompany.certification.nameproject.userinterface.objects.EndavaChallengeObj.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EndavaChallengeInteractions implements Interaction {


    public static Interaction endavaChallenge() {
        return instrumented(EndavaChallengeInteractions.class);
    }


    @Override
    public <T extends Actor> void performAs(T theActor) {

        String nameBook = CreateEndavaChallengeEntity.getLookFor().getSearchABook();

        theActor.attemptsTo(Check.whether(IMAGE.resolveFor(theActor).isVisible()).andIfSo(
                Enter.theValue(nameBook).into(LOOKFOR),
                Click.on(BTN_LOOKFOR)));


        theActor.attemptsTo(
                Click.on(BOOK.of(CreateEndavaChallengeEntity.getLookFor().getOptionOne())));
        theActor.attemptsTo(Wait.elementIsVisible(1));

        ModelGeneric.setAssertOneAuthor(ASSERT_ONE_AUTHOR.resolveFor(theActor).getText().trim());
        ModelGeneric.setLblNameBook(TITLE_NAME_BOOK.resolveFor(theActor).getText().trim());
        ModelGeneric.setTabBook((TAB_INF_BOOK.resolveFor(theActor).getText().trim()));

        theActor.attemptsTo(Click.on(RADIO_BTN), Wait.elementIsVisible(5));

        ModelGeneric.setAssertTwoSoldBy(ASSERT_TWO_SOLD_BY.resolveFor(theActor).getText().trim());
        ModelGeneric.setAssertThreeCart(ASSERT_THREE_CART.resolveFor(theActor).getText().trim());


    }


}
