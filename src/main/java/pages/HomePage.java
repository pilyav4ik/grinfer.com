package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public SelenideElement avatarButton = $(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[4]/div[5]/div[1]/div[1]"));

}
