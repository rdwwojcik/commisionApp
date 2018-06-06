package commision.core.exceptions;

public class UserNotFoudException extends RuntimeException {

    public UserNotFoudException() {
        super();
    }

    public UserNotFoudException(String message) {
        super(message);
    }
}
