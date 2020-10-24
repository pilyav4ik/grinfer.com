package steps;

import config.UserConfig;
import cucumber.api.java.en.Then;
import model.api.User;
import model.ui.SignUpPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import service.AuthService;

import static context.RunContext.put;

public class SinUpPageDef {

    private SignUpPage signUpPage = new SignUpPage();
    private AuthService authService = new AuthService();

    @Then("Input user Email")
    public void inputUserEmail() {
        String email = "auto." + RandomStringUtils.randomAlphabetic(5) + "@gmail.com";
        signUpPage.enterEmail(email);
        put("email", email);
    }

    @Then("Input user First name")
    public void inputName() {
        String firstName = UserConfig.USER_FIRST_NAME;
        signUpPage.enterFirstName(firstName);
        put("fistName", firstName);
    }

    @Then("Input user Last name")
    public void inputLastName() {
        String lastName = UserConfig.USER_LAST_NAME;
        signUpPage.enterLastName(lastName);
        put("lastName", lastName);
    }

    @Then("Input user password")
    public void inputUserPassword() {
        String password = UserConfig.USER_PASSWORD;
        signUpPage.enterPassword(password);
    }


    @Then("Create user by API")
    public void createUserByAPI() {
        User newUser = User.builder()
                .affiliateId("")
                .email("auto_" + RandomStringUtils.randomAlphabetic(5).toLowerCase() + "@mail.com")
                .externalAuthToken("")
                .externalAuthType("")
                .fast(true)
                .firstName("TestFirstName")
                .grantType("")
                .lastName("TestLastName")
                .password(UserConfig.USER_PASSWORD)
                .rememberMe(true)
                .timezone("")
                .build();
        put("user", newUser);

        User createdUser = authService.createUser(newUser);
        Assert.assertNotNull(createdUser);
        Assert.assertEquals(newUser.getEmail().toLowerCase(), createdUser.getEmail().toLowerCase());
        Assert.assertNotNull(createdUser.getId());
        Assert.assertNotNull(createdUser.getActive());
    }
}
