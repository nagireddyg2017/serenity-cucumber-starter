package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "C:\\Users\\gvnre\\Desktop\\Serenity\\serenity-cucumber-starter\\src\\test\\resources\\features\\search\\search_by_keyword.feature"
)
public class CucumberTestSuite {}
