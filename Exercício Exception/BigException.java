package tarefa_exceptions;

public class BigException extends Exception{
    public BigException(String message){
        super(message);
    }

    public BigException(String message, Throwable cause) {
        super(message, cause);
    }
}
