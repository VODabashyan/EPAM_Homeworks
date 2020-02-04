package university.exceptions;

public class NullFacultyException extends Exception {
    public NullFacultyException() {
    }

    public NullFacultyException(String message) {
        super(message);
    }

    public NullFacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullFacultyException(Throwable cause) {
        super(cause);
    }
}
