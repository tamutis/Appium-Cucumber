package br.com.appium.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\NOTE ASIS-724\\Documents\\eclipse-workspace\\Asis\\appiumtest\\src\\test\\resources\\Feature\\Cadastro.feature",
		glue = "br.com.appium.steps",
		tags = {"@cadastro"},
		plugin = {"pretty","json:target/ClientePage/cucumber.json", "html:target/json/ClientePage/cucumber-pretty"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)


public class CadastroRunnerTest {

}
