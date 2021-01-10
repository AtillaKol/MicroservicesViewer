package ch.microservicesviewer.microservicesviewerbackend.configuration.beans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Beinhaltet Tests fuer die jeweiligen Beans
 */
@SpringBootTest
public class BeansTest {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    private static String encodedPassword;


    @Test
    public void testEncodeAndDecodePassword() {
        String encodedPassword = bCryptPasswordEncoder.encode("HalloWelt");
        assertNotNull(encodedPassword);
        assertTrue(bCryptPasswordEncoder.matches("HalloWelt", encodedPassword));
    }

}
