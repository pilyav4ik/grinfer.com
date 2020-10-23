package steps;

import config.UserConfig;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.SignInPage;

public class SignInPageDef {

    private SignInPage signInPage = new SignInPage();


    @Then("Input email")
    public void inputEmail(){
        signInPage.setEmailInput(UserConfig.USER_EMAIL);
    }

    @Then("Input password")
    public void inputPassword(){
        signInPage.setPasswordInput(UserConfig.USER_PASSWORD);
    }

    @Then("Click {string} div")
    public void clickDiv(String arg0) {
        signInPage.clickUserButton();
    }

    @Then("Check First Name")
    public void checkFirstName() {
        String expectValue = UserConfig.USER_FIRST_NAME;
        String actual = signInPage.getFirstName();
        Assert.assertEquals(expectValue, actual);
    }

    @Then("Check Last Name")
    public void checkLastName() {
        String expectValue = UserConfig.USER_LAST_NAME;
        String actual = signInPage.getLastName();
        Assert.assertEquals(expectValue, actual);
    }
}
