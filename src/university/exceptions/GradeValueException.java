package university.exceptions;

public class GradeValueException extends Exception {
    public GradeValueException() {
    }

    public GradeValueException(String message) {
        super(message);
    }

    public GradeValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public GradeValueException(Throwable cause) {
        super(cause);
    }
}
