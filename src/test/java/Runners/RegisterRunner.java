package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Registro.feature",
        glue = "stepsDefinition",
        tags = "",
        snippets = SnippetType.CAMELCASE
)
public class RegisterRunner {
}