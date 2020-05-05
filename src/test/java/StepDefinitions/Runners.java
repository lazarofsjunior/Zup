package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features"}, glue = {"StepDefinitions"}, tags = {"@PesquisarProduto", "@AdicionarProdutoAoCarrinho"})

public class Runners {

}
