package tarefa_exceptions;

public class StringException extends Throwable{
    public StringException(String message){
        super(message);
    }

    public StringException(String message, Throwable cause) {
        super(message, cause);
    }
}
