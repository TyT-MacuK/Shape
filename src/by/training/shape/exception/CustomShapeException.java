package by.training.shape.exception;

public class CustomShapeException extends Exception {

    public CustomShapeException() {
    }

    public CustomShapeException(String message) {
        super(message);
    }

    public CustomShapeException(Throwable cause) {
        super(cause);
    }

    public CustomShapeException(String massage, Throwable cause) {
        super(massage, cause);
    }
}
