package br.com.appium.steps;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import appiumPage.ClientePage;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class Hooks {
	
	private static AppiumDriver<MobileElement> driver;
	private ClientePage cliente;
	
	@Before
	public void inicializa() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Pixel");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("app", "C:\\tools\\apk\\cadastro_clientes_teste.apk");
		cap.setCapability("appActivity", "br.com.dudstecnologia.cadastrodeclientes.MainClientes");
		cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		cliente = new ClientePage(driver);

	}
	
	

	public static Object getDriver() {
		// TODO Auto-generated method stub
		return null;
	}

}
