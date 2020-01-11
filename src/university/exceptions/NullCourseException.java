package university.exceptions;

public class NullCourseException extends Exception {
    public NullCourseException() {
    }

    public NullCourseException(String message) {
        super(message);
    }

    public NullCourseException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullCourseException(Throwable cause) {
        super(cause);
    }
}
