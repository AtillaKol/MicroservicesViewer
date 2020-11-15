package ch.microserviceviewerbackend.util;

import ch.microserviceviewerbackend.utils.PasswordUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilTest {

    @Test
    public void encodePasswordAndCompareEqualsTrue() {
        String encodedPassword = PasswordUtil.encodePassword("hallo");
        assertNotNull(encodedPassword);
        assertTrue(PasswordUtil.comparePassword("hallo", encodedPassword));
    }

    @Test
    public void encodePasswordAndCompareEqualsFalse() {
        String encodedPassword = PasswordUtil.encodePassword("hallo");
        assertNotNull(encodedPassword);
        assertFalse(PasswordUtil.comparePassword("NotTheSamePassword", encodedPassword));
    }

}
