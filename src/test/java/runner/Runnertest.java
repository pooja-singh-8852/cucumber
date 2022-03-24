package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,

		features= {"./FF/FBFeature.feature"},
		glue= {"step_definition"},
		tags= "@tag1"
		
		)
public class Runnertest {

}
