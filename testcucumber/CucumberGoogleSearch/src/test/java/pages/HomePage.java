package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass{
	//First Test. This title should be verified in LandingPageTest class
	public String getTitle() {
		return driver.getTitle();
	}

	public HomePage searchWord() {

		//Enter text ducks in the search text box
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("ducks");

		//press enter
		search.sendKeys(Keys.ENTER);

		//Product search page is displayed
		return new HomePage();

	}

	public boolean wikiLinkPresent() {
		WebElement link = driver.findElement(By.className("yuRUbf"));
		boolean result = link.isEnabled();
		return result;
	}

	public void clickLink() {
		WebElement link = driver.findElement(By.className("yuRUbf"));
		link.click();
	}

}
