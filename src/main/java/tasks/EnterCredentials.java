package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterface.LoginPage.*;

public class EnterCredentials implements Task {

    private String userName;
    private String passWord;

    public EnterCredentials(String userName, String passWord){
        this.userName = userName;
        this.passWord = passWord;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userName).into(INP_USERNAME),
                Enter.theValue(userName).into(INP_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static EnterCredentials fillCredentials(String userName, String passWord){
        return instrumented(EnterCredentials.class, userName, passWord);
    }


}
