package appiumPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ClientePage {

	private AppiumDriver driver;
	
	public ClientePage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(className = "android.widget.ImageView")
	public WebElement txtMais;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
	public WebElement cadastraNome;

	// CADASTRO DE CLIENTE

	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editNome")
	public WebElement txtnome;

	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editRg")
	public WebElement txtrg;

	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editCpf")
	public WebElement txtcpf;

	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editData")
	public WebElement txtdataNasc;

	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editEndereco")
	public WebElement txtendereco;

	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editNumero")
	public WebElement txtnumeroEndereco;

	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editBairro")
	public WebElement txtbairro;

	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editCep")
	public WebElement txtcep;

	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editCidade")
	public WebElement txtcidade;

	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editTelefone1")
	public WebElement txttelefone;

	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editTelefone2")
	public WebElement txttelefone2;

	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/editEmail")
	public WebElement txtemail;
	//BTN Salvar
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/btnSalvar")
	public WebElement btnSalvar;
	

	public void clickCadastro() {
		txtMais.click();
		cadastraNome.click();

	}

	public void cadastro(String nome, String rg, String cpf, String dataNasc, String endereco, String numeroEndereco,
			String bairro, String cep, String cidade, String telefone, String telefone2, String email) {
		txtnome.sendKeys(nome);
		txtrg.sendKeys(rg);
		txtcpf.sendKeys(cpf);
		txtdataNasc.sendKeys(dataNasc);
		txtendereco.sendKeys(endereco);
		txtnumeroEndereco.sendKeys(numeroEndereco);
		txtbairro.sendKeys(bairro);
		txtcep.sendKeys(cep);
		txtcidade.sendKeys(cidade);
		txttelefone.sendKeys(telefone);
		txttelefone2.sendKeys(telefone2);
		txtemail.sendKeys(email);
	}
	
	public void btnSalvar() throws InterruptedException {
		btnSalvar.click();
	
		
	}
	
	public void cadastro2(String nome2) {
		txtnome.sendKeys(nome2);
	}

}
