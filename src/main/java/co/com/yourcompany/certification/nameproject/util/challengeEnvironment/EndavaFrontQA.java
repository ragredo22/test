package co.com.yourcompany.certification.nameproject.util.challengeEnvironment;

import co.com.yourcompany.certification.nameproject.util.constant.EndavaConstantManager;
import co.com.yourcompany.certification.nameproject.util.properties.Endavaproperties;

import java.util.HashMap;
import java.util.Map;

public class EndavaFrontQA {

    private EndavaFrontQA() {
    }

    public static String enterEndavaChallenge() {

        String strUrl = Endavaproperties.getUrlFront();

        Map<String, String> map = new HashMap<>();
        map.put("CH", EndavaConstantManager.CH);
        String qa = map.get(strUrl);
        if (qa == null) {
            throw new NullPointerException(EndavaConstantManager.QA_NO_EXISTE);
        } else {
            return qa;
        }

    }
}
