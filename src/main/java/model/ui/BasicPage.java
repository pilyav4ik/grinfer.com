package model.ui;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    public void clickButton(String text){
        $(By.xpath("//div[contains(text(),'"+ text + "')]")).click();
    }

    public void clickButtonSpan(String text){
        $(By.xpath("//span[text()='"+ text +"']/..")).click();
    }

    public void clickButtonLi(String text){
        $(By.xpath("//li[contains(text(),'"+ text +"')]")).click();
    }

    public void clickDivSpan(String text){
        $(By.xpath("//span[contains(text(),'"+ text +"')]")).click();
    }
    public void contentIsVisible(String text) {
        $(By.xpath("//*[contains(text(),'"+text+"')]")).shouldBe(Condition.visible);
    }

    public void contentInInputIsVisible(String text) {
        $(By.xpath("//input[@value='"+ text +"')]")).shouldBe(Condition.visible);
    }

    public void clickSpan(String text) {
        $(By.xpath("//span[contains(text(),'"+ text +"')]")).click();
    }
}
