package day1;


import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class TestCase2 {
	
	public static void main(String[] args) throws MalformedURLException, URISyntaxException, InterruptedException {
		
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		
		options.setCapability("deviceName","emulator-5554");
		options.setCapability("platformVersion", "13");
		options.setCapability("browserName", "Chrome");
		options.setCapability("chromedriverExecutable", "D:\\FatimaWS\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		options.setAppWaitDuration(Duration.ofSeconds(30));
		options.setAutoGrantPermissions(true);
		options.setCapability("session-override", true);
		options.setCapability("autoAcceptAlerts", true);

		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
	
		
		Thread.sleep(3000);
		
		driver.get("http://www.google.com");
		
		Thread.sleep(10000);
		
		System.out.println("app installed...");
		
	}
	
	

}
