package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPageObject {

	private WebDriver driver;

	public HeaderPageObject(WebDriver driver) {
		this.driver = driver;
	}

	// elements

	private By search = By.id("inpHeaderSearch");
	private By buscar = By.id("btnHeaderSearch");
	private By tituloResultado = By.className("nm-left-top-search");
	private By notebook = By.id("product_224780400");
	private By adicionarSacola = By.xpath("/html/body/div[3]/div[5]/div[1]/div[4]/div[2]/button[2]/span");
	private By tituloProdutoCarrinho = By.className("header-tip__product-txt");

	// action

	public void pesquisar(String valor) {

		driver.findElement(search).sendKeys(valor);
	}

	public void pesquisarNotebook() {

		driver.findElement(search).sendKeys("notebook");
	}

	public void acionarBuscar() {

		driver.findElement(buscar).click();
	}

	public void tituloDoResultado() {

		WebElement wait = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.className("nm-left-top-search")));

		System.out.println(driver.findElement(tituloResultado).getText());

	}

	public void adicionarNotebok() {

		driver.findElement(notebook).click();
	}

	public void esperarNotebookVisivel() {

		WebElement wait = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.className("nm-left-top-search")));
	}

	public void acionarAdicionarSacola() {

		WebElement wait = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Mais formas de pagamento")));

		driver.findElement(adicionarSacola).click();
	}

	public void tituloProdutoNoCarrinho() {

		WebElement wait = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.className("header-tip__product-txt")));

		System.out.println(driver.findElement(tituloProdutoCarrinho).getText());

	}

}
