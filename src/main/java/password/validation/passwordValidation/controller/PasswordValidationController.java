package password.validation.passwordValidation.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import password.validation.passwordValidation.service.impl.PasswordValidationServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping
public class PasswordValidationController {

    @Autowired
    private PasswordValidationServiceImpl passwordValidationService;

    @PostMapping(value = "/password-validate")
    public Boolean passwordValidation(
            @RequestHeader(value = "password") String password) throws Exception {

        return this.passwordValidationService.validationPassword(password);
    }
}
