import org.junit.Test;
import static org.junit.Assert.*;

class UserTest {

    @Test
    void testUserWithParameters() {
        User user = new User("test_login", "test@email.com");
        assertEquals("test_login", user.getLogin());
        assertEquals("test@email.com", user.getEmail());
    }

    @Test
    void testUserWithoutParameters() {
        User user = new User();
        assertNull(user.getLogin());
        assertNull(user.getEmail());
    }

    @Test
    void testValidEmail() {
        User user = new User();
        user.setEmail("valid@email.com");
        assertTrue(user.getEmail().contains("@") && user.getEmail().contains("."));
    }

    @Test
    void testInvalidEmail() {
        User user = new User();
        user.setEmail("invalidemail");
        assertFalse(user.getEmail().contains("@") && user.getEmail().contains("."));
    }

    @Test
    void testLoginNotEqualToEmail() {
        User user = new User("test_login", "test@email.com");
        assertNotEquals(user.getLogin(), user.getEmail());
    }
}
