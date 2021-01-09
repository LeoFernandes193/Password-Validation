package password.validation.passwordValidation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import password.validation.passwordValidation.exception.PasswordValidationException;
import password.validation.passwordValidation.service.PasswordValidationService;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class PasswordValidationServiceImpl implements PasswordValidationService {

    private Pattern pattern;

    private Matcher matcher;

    public static final String VALID_CHARACTERS = "((?=.*[a-z])(?=.*\\\\d)(?=.*[A-Z])(?=.*[@#$%!]))";

    @Override
    public Boolean validationPassword(String password) throws PasswordValidationException {
        Optional.ofNullable(password).orElseThrow(()-> new RuntimeException("Password cannot be null"));

        this.pattern = Pattern.compile(VALID_CHARACTERS);
        this.matcher = pattern.matcher(password);

        if (matcher.matches()){

            return matcher.matches();
        } else {
            throw new PasswordValidationException("Password not valid");
        }
    }
}
