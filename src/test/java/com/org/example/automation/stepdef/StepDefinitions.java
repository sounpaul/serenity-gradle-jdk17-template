package com.org.example.automation.stepdef;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class StepDefinitions {

    private int num1, num2, result;

    @Given("two number {int} and {int}")
    public void two_number_and(Integer int1, Integer int2) {
        this.num1 = int1;
        this.num2 = int2;
    }

    @When("add operation is performed")
    public void add_operation_is_performed() {
        this.result = num1 + num2;

    }

    @Then("the output should be {int}")
    public void the_output_should_be(int result) {
        Assert.assertEquals(this.result, result);
    }

}
