package password.passwordValidator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertEquals(true, validator.isValid("Java1234"));
    }

    @Test
    void testShortPassword() {
        assertEquals(false, validator.isValid("abc"));
    }

    @Test
    void testEmptyPassword() {
        assertEquals(false, validator.isValid(""));
    }

    @Test
    void testNullPassword() {
        assertEquals(false, validator.isValid(null));
    }

    @Test
    void testAnotherValidPassword() {
        assertEquals(true, validator.isValid("SpringBoot"));
    }
}    
    
    