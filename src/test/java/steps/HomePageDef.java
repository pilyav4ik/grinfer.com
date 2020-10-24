package steps;

import cucumber.api.java.en.Then;
import model.ui.HomePage;

public class HomePageDef {

    HomePage homePage = new HomePage();

    @Then("Click avatar button")
    public void clickAvatarButton(){
        homePage.avatarButton.click();
    }
}