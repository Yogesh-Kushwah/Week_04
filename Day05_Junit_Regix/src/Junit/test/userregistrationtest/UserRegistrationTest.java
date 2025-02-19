package test.junit.userregistrationtest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.userregistration.UserRegistration;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    // Creating final instance of the  user registration class named as registration
    private final UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        // Testing weather the given mail is valid or not
        assertTrue(registration.registerUser("YogeshKushwah", "Yogesh@example.com", "Yogesh123"));
    }

    @Test
    void testInvalidEmail() {
        //Testing on Invalid mail and check weather we get the expected exception or not
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("Yash", "invalid-email", "yash123"));
    }

    @Test
    void testShortPassword() {
        //testing weather method works as expected on short password
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("Yogesh", "Yogesh@example.com", "123"));
    }
}
