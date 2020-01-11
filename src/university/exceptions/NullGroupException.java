package university.exceptions;

public class NullGroupException extends Exception {
    public NullGroupException() {
    }

    public NullGroupException(String message) {
        super(message);
    }

    public NullGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullGroupException(Throwable cause) {
        super(cause);
    }
}
