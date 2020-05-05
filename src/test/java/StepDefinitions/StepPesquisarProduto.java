package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObject.HeaderPageObject;
import PageObject.MainPageObject;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class StepPesquisarProduto {

	private WebDriver driver;

	MainPageObject main;
	HeaderPageObject header;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();

		main = new MainPageObject(driver);
		header = new HeaderPageObject(driver);
	}

	@Dado("que o usuario esteja no site da magazine luiza")
	public void que_o_usuario_esteja_no_site_da_magazine_luiza() {
		main.acessPage();
	}

	@Dado("digitou {string} no campo de busca")
	public void digitou_no_campo_de_busca(String string) {

		header.pesquisar(string);
	}

	@Quando("acionar buscar")
	public void acionar_buscar() {

		header.acionarBuscar();
	}

	@Entao("os notebook serao exibidos no resultado")
	public void os_notebook_serao_exibidos_no_resultado() {

		header.tituloDoResultado();

	}

}
