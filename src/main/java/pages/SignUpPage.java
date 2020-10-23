package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class SignUpPage {

    private WebElement eMail = $(new By.ByCssSelector("#email"));
    private WebElement firstName  = $(new By.ByCssSelector("#firstName"));
    private WebElement lastName = $(new By.ByCssSelector("#lastName"));
    private WebElement password = $(new By.ByCssSelector("#password"));

    public SignUpPage() {

    }

    public boolean isInitialized() {
        return firstName.isDisplayed();
    }

    public void enterEmail(String eMailAddress){
        eMail.clear();
        eMail.sendKeys(eMailAddress);
    }

    public void enterFirstName(String firstName){
        this.firstName.clear();
        this.firstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        this.lastName.clear();
        this.lastName.sendKeys(lastName);
    }

    public void enterPassword(String password){
        this.password.clear();
        this.password.sendKeys(password);
    }
}