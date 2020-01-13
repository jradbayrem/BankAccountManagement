package io.wesquad.bankaccountmanagement.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import io.wesquad.bankaccountmanagement.config.SpringBootIntegrationTest;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"classpath:features/"},
        plugin = {"pretty"},
        monochrome = true, snippets = SnippetType.CAMELCASE)
public class RunCucumberTest {
}
