package steps;

import config.UserConfig;
import cucumber.api.java.en.Then;

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
}
