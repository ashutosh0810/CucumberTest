package GroupID.ArtifactID;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:\\Users\\ashutoshksingh\\git\\ArtifactID\\ArtifactID\\FeatureFolder\\Feat.feature" }, glue = {
				"GroupID.ArtifactID" }, plugin = { "pretty" }

)
public class RunClass {

}
