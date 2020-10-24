package steps;


import config.EnvironmentConfig;
import cucumber.api.java.en.Then;
import model.ui.BasicPage;

import static com.codeborne.selenide.Selenide.open;

public class BasicPageDef {
    private BasicPage basicPage = new BasicPage();


    @Then("Click {string} button")
    public void clickButton(String arg0) throws InterruptedException {
        basicPage.clickButton(arg0);
        Thread.sleep(3000);
    }

    @Then("Click {string} button span")
    public void clickButtonSpan(String arg0) {
        basicPage.clickButtonSpan(arg0);
    }

    @Then("Content with {string} visible")
    public void contentWithVisible(String arg0) {
        basicPage.contentIsVisible(arg0);
    }

    @Then("Input text with {string} visible")
    public void contentInInputIsVisible(String arg0) {
        basicPage.contentInInputIsVisible(arg0);
    }

    @Then("Open {string} page")
    public void openPage(String arg0) {
        open(EnvironmentConfig.URI_LOGIN + arg0);
    }

    @Then("Click {string} button li")
    public void clickLi(String arg0) {
        basicPage.clickButtonLi(arg0);
    }

    @Then("Click {string} div span")
    public void clickDivSpan(String arg0) {
            basicPage.clickDivSpan(arg0);
    }
}
