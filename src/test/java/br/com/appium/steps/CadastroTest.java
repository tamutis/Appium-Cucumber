package br.com.appium.steps;

import static org.junit.Assert.assertEquals;

import java.net.URL;

import org.junit.Test;
import org.omg.CORBA.portable.Delegate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import appiumPage.ClientePage;
import appiumPage.DeletePage;
import appiumPage.ExportarPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class CadastroTest {

	AppiumDriver driver;

	public ClientePage clientePage;
	public ExportarPage exportarPage;
	public DeletePage deletePage;

	@Before()
	public void inicializa() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Pixel 2");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("app", "C:\\tools\\apk\\cadastro_clientes_teste.apk");
		cap.setCapability("appActivity", "br.com.dudstecnologia.cadastrodeclientes.MainClientes");
		cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		clientePage = new ClientePage(driver);
		exportarPage = new ExportarPage(driver);
		deletePage = new DeletePage(driver);
		
		
	}

	@Test
	@Dado("clicar em cadastro novo")
	public void clicarEmCadastroNovo() throws InterruptedException {

		
		clientePage.clickCadastro();
	}

	@Quando("informar os dados do cliente")
	public void informarOsDadosDoCliente() throws InterruptedException {
		clientePage.cadastro("André Luiz", "463152785", "36816530896", "04121989", "Rua Marfim", "463152785",
				"Cidade das Flores", "06184290", "Osasco", "11989951307", "1136081464", "tamutisf@gmail.com");
	}

	@Então("salvo")
	public void salvo() throws InterruptedException {

		clientePage.btnSalvar();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

		Thread.sleep(1000);
		driver.navigate().back();
	}

	@Então("validado se o cliete foi salvo corretamente")
	public void validadoSeOClieteFoiSalvoCorretamente() throws InterruptedException {
		Thread.sleep(2000);
		String txtusuario = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]"))
				.getText();

		assertEquals("André Luiz", txtusuario);
	}

	@Dado("clicar em exportar dados")
	public void clicarEmExportarDados() {

		
		exportarPage.clickExportar();
		

	}

	@Quando("exporto em Excel")
	public void exportoEmExcel() throws InterruptedException {
		Thread.sleep(1000);
		exportarPage.expoExcel();
		

	}

	@Então("valida a mensagem de arquivo salvo")
	public void validaAMensagemDeArquivoSalvo() throws InterruptedException {

		Thread.sleep(1000);
		String txtexportar = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"))
				.getText();

		assertEquals("Perfeito", txtexportar);

		Thread.sleep(1000);
		driver.switchTo().alert().accept();

		Thread.sleep(1000);
		driver.navigate().back();

	}

	// Delete

	@Dado("clico em pesquisa")
	public void clicoEmPesquisa() throws InterruptedException {
		clientePage.clickCadastro();
		clientePage.cadastro2("Luiz Freitas");
		clientePage.btnSalvar();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		Thread.sleep(1000);
		driver.navigate().back();

	}

	@Quando("localizar o Cliente")
	public void localizarOCliente() throws InterruptedException {
		deletePage.pesquisa();

	}

	@Então("excluir")
	public void excluir() throws InterruptedException {

		deletePage.btnExcluir();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

		Thread.sleep(1000);
		driver.navigate().back();

	}

	@After

	public void finaliza() {
		driver.quit();
	}

}
