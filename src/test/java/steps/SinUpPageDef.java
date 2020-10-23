package steps;

import config.UserConfig;
import cucumber.api.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;
import pages.SignUpPage;

import static context.RunContext.put;

public class SinUpPageDef {

    private SignUpPage signUpPage = new SignUpPage();

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


}
