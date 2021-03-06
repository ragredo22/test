package co.com.yourcompany.certification.nameproject.model;

public class ModelGeneric {

    public ModelGeneric(){}

    private static String lblNameBook;
    private static String tabBook;

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
