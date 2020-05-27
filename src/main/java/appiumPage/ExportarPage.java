package appiumPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExportarPage {
	public ExportarPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(className = "android.widget.ImageView")
	public WebElement txtMais;

	@AndroidFindBy(xpath  = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement txtexportar;
	
	@AndroidFindBy(id = "br.com.dudstecnologia.cadastrodeclientes:id/btnExportar")
	public WebElement txtexportarExcel;

	public void clickExportar() {
		txtMais.click();
		txtexportar.click();

	}
	
	public void expoExcel() {
		txtexportarExcel.click();
	}
}
