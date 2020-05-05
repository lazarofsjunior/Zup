package PageObject;

import org.openqa.selenium.WebDriver;

public class MainPageObject {

	private WebDriver driver;
	private String pageurl = "https://www.magazineluiza.com.br/";

	public MainPageObject(WebDriver driver) {
		this.driver = driver;

	}

	public MainPageObject acessPage() {
		driver.get(this.pageurl);
		return this;
	}

}
