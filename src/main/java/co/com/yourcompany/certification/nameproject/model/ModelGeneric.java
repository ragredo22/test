package co.com.yourcompany.certification.nameproject.model;

public class ModelGeneric {

    public ModelGeneric(){}

    private static String lblNameBook;
    private static String tabBook;
    private static String assertOneAuthor;
    private static String assertTwoSoldBy;
    private static String assertThreeCart;

    public static String getAssertOneAuthor() {
        return assertOneAuthor;
    }

    public static void setAssertOneAuthor(String assertOneAuthor) {
        ModelGeneric.assertOneAuthor = assertOneAuthor;
    }

    public static String getAssertTwoSoldBy() {
        return assertTwoSoldBy;
    }

    public static void setAssertTwoSoldBy(String assertTwoSoldBy) {
        ModelGeneric.assertTwoSoldBy = assertTwoSoldBy;
    }

    public static String getAssertThreeCart() {
        return assertThreeCart;
    }

    public static void setAssertThreeCart(String assertThreeCart) {
        ModelGeneric.assertThreeCart = assertThreeCart;
    }



    public static String getTabBook() {
        return tabBook;
    }

    public static void setTabBook(String tabBook) {
        ModelGeneric.tabBook = tabBook;
    }

    public static String getLblNameBook() {
        return lblNameBook;
    }

    public static void setLblNameBook(String lblNameBook) {
        ModelGeneric.lblNameBook = lblNameBook;
    }
}
