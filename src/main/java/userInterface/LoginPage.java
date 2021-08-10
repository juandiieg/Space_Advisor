package userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target INP_USERNAME = Target.the("Input user name").
            located(By.xpath("//body/div[@id='app']/div[1]/section[3]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
    public static final Target INP_PASSWORD = Target.the("Input password").
            located(By.xpath("//body/div[@id='app']/div[1]/section[3]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]"));
    public static final Target BTN_LOGIN = Target.the("Input password").
            located(By.xpath("//body/div[@id='app']/div[1]/section[3]/div[1]/div[2]/div[1]/nav[1]/button[2]"));
}
