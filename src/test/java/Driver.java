import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(strict = false, features={"features/MathOperations.feature"}, plugin = {"pretty",  "json:target/cucumber.json"})

public class Driver
{	

}