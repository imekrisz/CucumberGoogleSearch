package pages;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends BaseClass {

	HomePage homepage = new HomePage();


	@Given("google home page")
	public void google_homepage() throws Throwable {
		openURL();
	}

	@When("search for word ducks")
	public void search_word() throws Throwable{
		homepage.searchWord();
	}

	@Then("check for the wikipedia link")
	public void verify_wiki_link() throws Throwable{

		Assert.assertTrue("success", homepage.wikiLinkPresent());
	}

	@Then("click First link from the search")
	public void click_first_link() throws Throwable{

		homepage.clickLink();
	}

	@After
	public void teardown() {
		closeApplication();
	}

}
