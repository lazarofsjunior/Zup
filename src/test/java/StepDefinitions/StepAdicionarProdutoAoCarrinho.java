package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.HeaderPageObject;
import PageObject.MainPageObject;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepAdicionarProdutoAoCarrinho {
	
	private WebDriver driver;
	
	HeaderPageObject header;
	MainPageObject main;
	
	
	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();

		main = new MainPageObject(driver);
		header = new HeaderPageObject(driver);
	}
	
	@Dado("que o usuario escolheu o produto")
	public void que_o_usuario_escolheu_o_produto() {
	    
		main.acessPage();
		header.pesquisarNotebook();
		header.acionarBuscar();
		header.esperarNotebookVisivel();
		header.adicionarNotebok();
	}

	@Quando("acionar Adicionar a sacola")
	public void acionar_Adicionar_a_sacola() {
	    header.acionarAdicionarSacola();
	}

	@Entao("O nome do produto escolhido sera exibido para visualizacao")
	public void o_nome_do_produto_escolhido_sera_exibido_para_visualizacao() {
	    header.tituloProdutoNoCarrinho();
	}

}
