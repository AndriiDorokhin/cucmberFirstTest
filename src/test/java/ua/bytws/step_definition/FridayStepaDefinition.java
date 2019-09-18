package ua.bytws.step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}

public class FridayStepaDefinition {

    private String today;
    private String actualAnswer;

    @Given("^today is Sunday$")
    public void todayIsSunday() {
        today = "Sunday";
    }

    @When("^I ask whether it's Friday yet$")
    public void iAskWhetherItSFridayYet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void iShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Given("^today is Friday$")
    public void today_is_Friday() {
        this.today = "Friday";
    }

    // for is_friday_yet_with_table.feature
    @Given("^today is \"([^\"]*)\"$")
    public void todayIs(String today) {
        this.today = today;
    }
}
