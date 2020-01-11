package university.exceptions;

public class NullStudentException extends Exception {
    public NullStudentException() {
    }

    public NullStudentException(String message) {
        super(message);
    }

    public NullStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullStudentException(Throwable cause) {
        super(cause);
    }
}
