package co.com.yourcompany.certification.nameproject.questions;

import co.com.yourcompany.certification.nameproject.model.CreateEndavaChallengeEntity;
import co.com.yourcompany.certification.nameproject.model.ModelGeneric;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.junit.Assert;

public class LookForTheBook implements Question<Boolean> {

    public LookForTheBook(){}
    @Override
    public Boolean answeredBy(Actor actor) {

        boolean resulted = false;
        String ansTitleFront = ModelGeneric.getLblNameBook().toUpperCase();
        String msgExpectedOptOne = CreateEndavaChallengeEntity.getLookFor().getOptionOne().toUpperCase();

        Assert.assertEquals(ansTitleFront, msgExpectedOptOne);
        String ansTabFront = ModelGeneric.getTabBook().substring(0,9).toUpperCase();
        String msgExpected = CreateEndavaChallengeEntity.getLookFor().getOptionTwo().toUpperCase();

      Assert.assertTrue("Messages doesn't match", msgExpected.contains(ansTabFront));

        Assert.assertEquals(CreateEndavaChallengeEntity.getLookFor().getAssertOneAuthor(),ModelGeneric.getAssertOneAuthor());
        Assert.assertEquals(CreateEndavaChallengeEntity.getLookFor().getAssertTwoSoldBy(),ModelGeneric.getAssertTwoSoldBy());
        Assert.assertEquals(CreateEndavaChallengeEntity.getLookFor().getAssertThreeCart(),ModelGeneric.getAssertThreeCart());

        if(msgExpected.contains(ansTabFront)){
            resulted = true;
        }

        return resulted;
    }
        public static LookForTheBook wasSuccessful() {
            return new LookForTheBook();
        }
    }

