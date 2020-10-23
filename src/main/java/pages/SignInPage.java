package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    private SelenideElement emailInput = $(By.xpath("//input[@id='email']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@id='password']"));
    private SelenideElement firstName = $(By.xpath("//input[@id='form_firstName']"));
    private SelenideElement lastName = $(By.xpath("//input[@id='form_lastName']"));
    private SelenideElement userButton = $(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[4]/div[4]"));

    public void setEmailInput(String text){
        this.emailInput.val(text);
    }

    public void setPasswordInput(String text){
        this.passwordInput.val(text);
    }

    public String getFirstName(){
        return firstName.getValue();
    }

    public String getLastName(){
        return lastName.getValue();
    }

    public void clickUserButton(){
        userButton.click();
    }
}
