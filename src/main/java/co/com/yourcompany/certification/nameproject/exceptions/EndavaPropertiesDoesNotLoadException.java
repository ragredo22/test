package co.com.yourcompany.certification.nameproject.exceptions;

public class EndavaPropertiesDoesNotLoadException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public EndavaPropertiesDoesNotLoadException(Exception e) {
        super(e);
    }
}
