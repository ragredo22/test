package co.com.yourcompany.certification.nameproject.model;


import java.util.List;

public class CreateEndavaChallengeEntity {


    private static LookFor lookFor;

    private CreateEndavaChallengeEntity() {
    }


    public static LookFor getLookFor() {
        return lookFor;
    }

    public static void setLookFor(List<String> data) {

        LookFor lookFor = new LookFor();


        lookFor.setSearchABook(data.get(0));
        lookFor.setOptionOne(data.get(1));
        lookFor.setOptionTwo(data.get(2));

        CreateEndavaChallengeEntity.lookFor = lookFor;

    }

}
