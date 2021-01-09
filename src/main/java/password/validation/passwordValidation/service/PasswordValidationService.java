package password.validation.passwordValidation.service;

import password.validation.passwordValidation.exception.PasswordValidationException;

public interface PasswordValidationService {

    Boolean validationPassword (String password) throws PasswordValidationException;
}
