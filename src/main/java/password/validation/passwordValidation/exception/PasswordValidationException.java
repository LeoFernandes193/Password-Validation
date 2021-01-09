package password.validation.passwordValidation.exception;

public class PasswordValidationException extends RuntimeException {

    private static final long serialVersionUID = -8726041914774673096L;

    public PasswordValidationException(String msg){
        super(msg);
    }

    public PasswordValidationException(String msg, Throwable cause){
        super(msg, cause);
    }
}
