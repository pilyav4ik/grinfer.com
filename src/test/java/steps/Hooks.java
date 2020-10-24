package steps;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    //@Before
    public void openUrl(){
        open("https://grinfer.com/");
    }
}
