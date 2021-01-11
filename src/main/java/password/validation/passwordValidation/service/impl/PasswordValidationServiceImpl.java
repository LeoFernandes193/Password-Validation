package password.validation.passwordValidation.service.impl;

import org.springframework.stereotype.Service;
import password.validation.passwordValidation.service.PasswordValidationService;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class PasswordValidationServiceImpl implements PasswordValidationService {

    private Pattern pattern;

    private Matcher matcher;

    public static final String VALID_CHARACTERS = "^(?:([A-Za-z0-9!@#$%^&*()\\-+])(?!.*\\1)){9,}$";

    public PasswordValidationServiceImpl() {
        this.pattern = Pattern.compile(VALID_CHARACTERS);
    }

    @Override
    public Boolean validationPassword(String password){
        Optional.ofNullable(password).orElseThrow(() -> new RuntimeException("Password cannot be null"));

        this.matcher = pattern.matcher(password);

            return this.matcher.matches();

    }

}
