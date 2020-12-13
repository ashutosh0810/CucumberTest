package GroupID.ArtifactID;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Def {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	   System.out.println("first");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("second 2nd");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("3");
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println("4");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("5");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("6");
	}


}
