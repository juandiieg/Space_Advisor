package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("http://demo.testim.io/")
public class HomePage extends PageObject {
    public static final Target BTN_LOGIN = Target.the("Login button").
            locatedBy("//button[contains(text(),'Log in')]");
    public static final Target BTN_USER = Target.the("info user button").
            locatedBy("//header/div[1]/div[2]/ul[1]/div[1]/button[1]/span[1]");

}
