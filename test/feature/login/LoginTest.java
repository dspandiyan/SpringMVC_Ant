package test.feature.login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources",
		format = {"pretty", "json:test/login_test.json"}
)
public class LoginTest {

}
