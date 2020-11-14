package ch.microserviceviewerbackend.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public abstract class PasswordUtil {

    private static final BCryptPasswordEncoder password = new BCryptPasswordEncoder();

    public static String encodePassword(String plainTextPassword) {
        return password.encode(plainTextPassword);
    }

    public static boolean comparePassword(String plainTextPassword, String encodedPassword) {
        return password.matches(plainTextPassword, encodedPassword);
    }

}
