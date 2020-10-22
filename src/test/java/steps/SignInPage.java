package steps;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    private SelenideElement emailInput = $(By.xpath("//input[@id='email']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@id='password']"));

    public void setEmailInput(String text){
        this.emailInput.val(text);
    }

    public void setPasswordInput(String text){
        this.passwordInput.val(text);
    }
}
