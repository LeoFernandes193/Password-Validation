package password.validation.passwordValidation.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import password.validation.passwordValidation.exception.PasswordValidationException;
import password.validation.passwordValidation.service.impl.PasswordValidationServiceImpl;
import password.validation.passwordValidation.util.PasswordValidationMockBuilder;

@SpringBootTest
public class PasswordValidationServiceImplTest {

    @Mock
    private PasswordValidationServiceImpl passwordValidationService;

    @Test
    @DisplayName("Should return a valid password")
    public void should_returnValidPassword(){
        Mockito.when(passwordValidationService.validationPassword(PasswordValidationMockBuilder.PASSWORD_VALID)).thenReturn(Boolean.TRUE);
    }

//    @Test(expected = PasswordValidationException.class)
//    public void teste(){
//
//        Mockito.when(passwordValidationService.validationPassword(PasswordValidationServiceImpl.))
//    }
}
