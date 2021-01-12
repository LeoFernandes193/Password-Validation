package password.validation.passwordvalidation.exception;

public class PasswordValidationException extends RuntimeException {

    private static final long serialVersionUID = -8726041914774673096L;

    public PasswordValidationException(){
        super();
    }

    public PasswordValidationException(String msg, Throwable cause){
        super(msg, cause);
    }

    public PasswordValidationException(String msg){
        super(msg);
    }

    public PasswordValidationException(Throwable cause){
        super(cause.getMessage(), cause);
    }
}
