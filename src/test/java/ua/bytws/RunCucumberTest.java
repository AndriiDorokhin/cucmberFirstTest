package ua.bytws;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        features = "src/test/resources/cucumber",
        glue = "ua.bytws.step_definition",
        tags = "@second",
//        dryRun = false,
//        strict = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RunCucumberTest {
}
