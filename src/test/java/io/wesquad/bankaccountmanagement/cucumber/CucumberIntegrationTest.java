package io.wesquad.bankaccountmanagement.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.wesquad.bankaccountmanagement.config.SpringBootIntegrationTest;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features")
public class CucumberIntegrationTest extends SpringBootIntegrationTest {
}
