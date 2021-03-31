package pages;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue= {"pages"},
monochrome = true,
plugin={"pretty", "html:target/HTMLReports"})
public class TestGoogleSearch {

}
