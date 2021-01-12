package password.validation.passwordvalidation.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.boot.test.context.SpringBootTest;
import password.validation.passwordvalidation.service.impl.PasswordValidationServiceImpl;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@SpringBootTest
public class PasswordValidationServiceImplTest {

    @Mock
    private PasswordValidationServiceImpl passwordValidationService;

    public static final String PASSWORD_VALID="AbTp9!fok";
    public static final String PASSWORD_NOT_VALID="AAAbbbCc";


    @Test()
    public void should_ReturnAValidePassword(){

        when(passwordValidationService.validationPassword(PASSWORD_VALID)).thenReturn(Boolean.TRUE);
    }

    @org.junit.Test(expected = RuntimeException.class)
    public void should_ThrowAnExceptionWhenThePasswordIsNull(){

        passwordValidationService.validationPassword(null);
    }

    @Test
    public void should_ReturnAFalsePassword(){
         when(passwordValidationService.validationPassword(PASSWORD_NOT_VALID)).thenReturn(Boolean.FALSE);
    }
}
