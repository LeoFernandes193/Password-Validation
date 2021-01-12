package password.validation.passwordValidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * Main Class
 * @author leonardo.p.fernandes
 */

@SpringBootApplication
	public class PasswordValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasswordValidationApplication.class, args);
	}

}
