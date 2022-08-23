package io.cucumber.skeleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class StepDefinitions {

    private Calculator calculator;
    @Given("a calculator just got turned on")
    public void I_have_cukes_in_my_belly() {
        calculator = new Calculator();
        calculator.clear();
    }

    @When("I add {int} and {int}")
    public void I_add_2_numbers(int number_1, int number_2) {
        calculator.add(number_1);
        calculator.add(number_2);
    }

    @When("I multiply with {int}")
    public void I_multiply_two_numbers(int number) {
        calculator.multiply_by(number);
    }

    @Then("the result is {int}")
    public void the_result_is(int expected) {
        assertEquals(expected, calculator.getValue());

    }
}
