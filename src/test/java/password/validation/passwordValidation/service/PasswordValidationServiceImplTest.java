package password.validation.passwordValidation.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import password.validation.passwordValidation.service.impl.PasswordValidationServiceImpl;

@SpringBootTest
public class PasswordValidationServiceImplTest {

    @InjectMocks
    private PasswordValidationServiceImpl passwordValidationService;

    @Test
    @DisplayName("")
    public void test(){
        Mockito.when(passwordValidationService.validationPassword("Teste")).thenReturn(Boolean.TRUE);
    }
}
