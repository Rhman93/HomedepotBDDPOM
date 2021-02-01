package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/ahmedshuily/eclipse-workspace"
		+ "/homwDepotBDD/src/main/java/features",
		glue="step_defination",
		plugin={"pretty","html:target/HomeDepot-Report"},
		monochrome = true)

public class TestRunner {

}
