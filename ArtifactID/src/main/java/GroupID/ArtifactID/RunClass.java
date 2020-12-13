package GroupID.ArtifactID;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions 
(features = {"C:\\Users\\ashutoshksingh\\eclipse-oxyworkspace\\ArtifactID\\FeatureFolder\\Feat.feature",
		"C:\\Users\\ashutoshksingh\\eclipse-oxyworkspace\\ArtifactID\\FeatureFolder\\FeatB.feature"},
glue = {"GroupID.ArtifactID"},
plugin= {"pretty"}

)
public class RunClass {

}
