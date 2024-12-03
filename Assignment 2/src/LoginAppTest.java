import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LoginAppTest {


    @Test
    void ValidEmail_ValidPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("johndoe@example.com","password123");
        assertEquals("John Doe", result);
    }

    @Test
    void ValidEmail_InvalidPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("johndoe@example.com","password456");
        assertNull(result);
    }

    @Test
    void InvalidEmail_ValidPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("invalid@example.com","password123");
        assertNull(result);
    }

    @Test
    void InvalidEmail_InvalidPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("invalid@example.com","password");
        assertNull(result);
    }

    @Test
    void EmptyEmail_ValidPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("","password123");
        assertNull(result);
    }

    @Test
    void ValidEmail_EmptyPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("johndoe@example.com","");
        assertNull(result);
    }

    @Test
    void NullEmailPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser(null,null);
        assertNull(result);
    }

    @Test
    void EmptyEmailPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("","");
        assertNull(result);
    }
}

