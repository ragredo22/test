package co.com.yourcompany.certification.nameproject.tasks;


import co.com.yourcompany.certification.nameproject.exceptions.EndavaChallenge;
import co.com.yourcompany.certification.nameproject.util.challengeEnvironment.EndavaFrontQA;
import co.com.yourcompany.certification.nameproject.util.properties.Endavaproperties;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Task {

    private String qa;


    public OpenBrowser(String qa) {
        this.qa = qa;
    }

    public OpenBrowser() {
    }

    public static OpenBrowser theEndavaChallengeSite() {
        return Tasks.instrumented(OpenBrowser.class);
    }

    public static OpenBrowser theEndavaChallengeSite(String qa) {

        return Tasks.instrumented(OpenBrowser.class, qa);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String strUrlQA;
        try {
            String url;
            if (qa != null) {
                strUrlQA = qa;
                url = Endavaproperties.getUrlFront().replace("$$", strUrlQA.toLowerCase());
                actor.attemptsTo(Open.url(url));
            } else {
                actor.attemptsTo(Open.url(EndavaFrontQA.enterEndavaChallenge()));
            }
        } catch (Exception e) {
            throw new EndavaChallenge(e);

        }

    }


}
