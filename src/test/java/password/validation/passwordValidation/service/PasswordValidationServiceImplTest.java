package password.validation.passwordValidation.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import password.validation.passwordValidation.service.impl.PasswordValidationServiceImpl;
import password.validation.passwordValidation.util.PasswordValidationMockBuilder;

/**
 * Main classe
 * @author leonardo.p.fernandes
 */

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class PasswordValidationServiceImplTest {

    @Mock
    private PasswordValidationServiceImpl passwordValidationService;


    @Test
    public void teste2(){
        Mockito.when(passwordValidationService.validationPassword(PasswordValidationServiceImpl.VALID_CHARACTERS)).thenReturn(Boolean.TRUE);
        Assert.assertNotNull(passwordValidationService.validationPassword(PasswordValidationMockBuilder.PASSWORD_VALID));
    }

}
