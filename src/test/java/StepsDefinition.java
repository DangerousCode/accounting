import com.ust.calc.calculadora.CalculadoraApplicationTests;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


public class StepsDefinition extends CalculadoraApplicationTests {
    
    @Then("^I get an OK response$")
    public void iGetAnOKResponse() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        contextLoads();
        System.out.print("ok");
    }

    @When("^I request a post to \"([^\"]*)\"$")
    public void iRequestAPostTo(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        contextLoads();

        System.out.print("ok");
    }

    @And("^the resource has details:$")
    public void theResourceHasDetails(String x) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.print("ok");
        contextLoads(x);

    }
}
