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

        ModelGeneric.setLblNameBook(TITLE_NAME_BOOK.resolveFor(theActor).getText().trim());
        ModelGeneric.setTabBook((TAB_INF_BOOK.resolveFor(theActor).getText().trim()));



    }


}
