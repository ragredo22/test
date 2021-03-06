package co.com.yourcompany.certification.nameproject.userinterface.objects;

import co.com.yourcompany.certification.nameproject.util.constant.EndavaChallengeConstant;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class EndavaChallengeObj {


    public static final Target IMAGE = Target.the("Image logo").located(By.id("nav-logo-sprites"));
    public static final Target LOOKFOR = Target.the("LOOKFOR").located(By.id("twotabsearchtextbox"));
    public static final Target BTN_LOOKFOR = Target.the("Look for button").locatedBy("//input[@value='Go']");
    public static final Target BOOK = Target.the("Book").locatedBy("//div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col sg-col-4-of-20']");

    public static final Target TITLE_NAME_BOOK = Target.the("Book Name").locatedBy("//*[@class='a-size-extra-large']");
    public static final Target TAB_INF_BOOK = Target.the("TAB midle book").locatedBy("//*[@id=\"mediaTab_heading_2\"]");


    private EndavaChallengeObj() {
        throw new IllegalStateException(EndavaChallengeConstant.UI_CLASS);
    }
}
