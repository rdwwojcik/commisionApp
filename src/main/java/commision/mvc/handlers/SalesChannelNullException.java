package commision.mvc.handlers;

public class SalesChannelNullException extends RuntimeException {

    public SalesChannelNullException() {
        this("SalesChanel can not be empty");
    }

    public SalesChannelNullException(String message) {
        super(message);
    }
}
