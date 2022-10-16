package tarefa_exceptions;

public class SmallException extends Throwable {
    public SmallException(String message){
        super(message);
    }

    public SmallException(String message, Throwable cause) {
        super(message, cause);
    }
}
