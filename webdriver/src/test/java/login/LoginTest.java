package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureLoginPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin () {
        LoginPage login = homePage.clickFormAuthentication();
        login.setUsername("tomsmith");
        login.setPassword("SuperSecretPassword!");
        SecureLoginPage secureLoginPage = login.clickloginButton();
        assertTrue(secureLoginPage.getAlertText()
                        .contains("You logged into a secure area!"),
                "Alert text incorrect");
    }
}
