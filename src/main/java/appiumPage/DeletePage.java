package appiumPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DeletePage {

	AppiumDriver driver;

	public DeletePage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.EditText")
	public WebElement txtpesquisa;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]")
	public WebElement txtclick;

	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/btnExcluir")
	public WebElement btnExcluir;

	public void pesquisa() throws InterruptedException {
		txtpesquisa.sendKeys("Luiz Freitas");
		txtclick.click();

	}

	public void btnExcluir() throws InterruptedException {
		btnExcluir.click();
		

	}
}