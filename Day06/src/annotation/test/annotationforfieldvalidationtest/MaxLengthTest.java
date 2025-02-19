package test.annoations.annotationforfieldvalidationtest;


import org.example.com.annotations.annotationforfieldvalidation.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxLengthTest {

    @Test
    void testValidUsername() {
        // Should create a user without exceptions
        assertDoesNotThrow(() -> new User("Yogesh"));
    }

    @Test
    void testInvalidUsername() {
        // Should throw IllegalArgumentException due to exceeding max length
        Exception exception = assertThrows(IllegalArgumentException.class, 
            () -> new User("Yogeshkushw9770"));
        
        assertEquals("Username exceeds max length of 10 characters", exception.getMessage());
    }
}
