package creator.builder.builder;

public class MealException extends Exception{
    public MealException() {
        super();
    }

    public MealException(String message) {
        super(message);
    }

    public MealException(String message, Throwable cause) {
        super(message, cause);
    }

    public MealException(Throwable cause) {
        super(cause);
    }

    protected MealException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

