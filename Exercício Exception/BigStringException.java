package tarefa_exceptions;

public class BigStringException extends Exception {
    public BigStringException(String message){
        super(message);
    }

    public BigStringException(String message, Throwable cause) {
        super(message, cause);
    }
}
