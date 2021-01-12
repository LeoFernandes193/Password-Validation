package password.validation.passwordValidation.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import password.validation.passwordValidation.service.impl.PasswordValidationServiceImpl;

/**
 * Controller class for method to password validation
 * @author leonardo.p.fernandes
 */

@RestController
@CrossOrigin(origins = "*")
@RequestMapping
public class PasswordValidationController {

    @Autowired
    private PasswordValidationServiceImpl passwordValidationService;

    private static final Logger log = LoggerFactory.getLogger(PasswordValidationController.class);

    @PostMapping(value = "/password-validate")
    public Boolean passwordValidation(
            @RequestHeader(value = "password") String password) throws Exception {

        log.info("Starting password validation...");

        return this.passwordValidationService.validationPassword(password);
    }

}
