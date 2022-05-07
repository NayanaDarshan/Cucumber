package Testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;
import io.cucumber.junit.platform.engine.Cucumber;


@RunWith(Cucumber.class)
@Cucumber(
	
		features = {"C:\\Users\\nayana.raghu\\eclipse-workspace\\Cucumber\\src\\test\\resources\\AppFeatures"},
		glue= {"Step"},
		plugin= {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml"},
		monochrome=false
		
		)
public class AmazonTest {

}
	`				