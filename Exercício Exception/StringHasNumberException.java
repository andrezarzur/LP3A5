package tarefa_exceptions;

public class StringHasNumberException extends Throwable{
    public StringHasNumberException(String message){
        super(message);
    }

    public StringHasNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
