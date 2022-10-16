package tarefa_exceptions;

public class SmallStringException extends Exception {
    public SmallStringException(String message){
        super(message);
    }

    public SmallStringException(String message, Throwable cause) {
        super(message, cause);
    }
}
