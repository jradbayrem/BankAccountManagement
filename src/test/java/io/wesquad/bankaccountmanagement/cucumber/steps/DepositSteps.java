package io.wesquad.bankaccountmanagement.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.wesquad.bankaccountmanagement.config.SpringBootIntegrationTest;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DepositSteps extends SpringBootIntegrationTest {

    @Given("The bank Account ID")
    public void The_bank_Account_ID(){

        System.out.println("hola");
    }

    @When("account exists")
    public void account_exists(){

    }

    @Then("create and save deposit transaction")
    public void create_and_save_deposit_transaction(){
        assertThat(1,is(2));
    }
}
