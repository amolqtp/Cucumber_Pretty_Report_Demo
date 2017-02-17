
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinations
{

	public int num1, num2, result;
	@Given("^I have first (\\d+) and second (\\d+) number$")
	public void i_have_first_and_second_number(int arg1, int arg2)
	{
		num1 = arg1;
		num2 = arg2;		
	}

	@When("^I perform addition operation$")
	public void i_perform_addition_operation()
	{
		result = num1 + num2;
	}

	@Then("^I should get correct (\\d+) result$")
	public void i_should_get_correct_result(int arg1)
	{
		org.junit.Assert.assertTrue(result == arg1);		
	}
	

}
