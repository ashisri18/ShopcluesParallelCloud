package com.shopclues.library;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.saucelabs.common.SauceOnDemandAuthentication;
import com.saucelabs.common.SauceOnDemandSessionIdProvider;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseLib implements SauceOnDemandSessionIdProvider{
	public static AndroidDriver driver;
	public DesiredCapabilities capabilities;
	
	static public String sDirPath=System.getProperty("user.dir");
	public static String sConfigFile = sDirPath + "\\Capabilities.Properties";
//	public static String sTestDataFile = sDirPath + "\\TestData.xlsx";
//	public static String sAppPath = sDirPath + "\\Shopclues.apk";
//	String[] sData=null;
	
	final private String USERNAME = System.getenv("SAUCE_USERNAME");
	final private String ACCESS_KEY = System.getenv("SAUCE_ACCESS_KEY");
	private SauceOnDemandAuthentication authentication = new SauceOnDemandAuthentication(USERNAME,ACCESS_KEY);
	public String sessionId;
	
	//@Parameters({"deviceName","version","data"})
	@BeforeTest()
	public void setCapability() throws MalformedURLException
	{	
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("platformVersion","5.1" );		
		capabilities.setCapability("deviceType","phone");
		capabilities.setCapability("platformName", GenericLib.getCongigValue(sConfigFile, "PLATFORMNAME"));
		capabilities.setCapability("app", GenericLib.getCongigValue(sConfigFile, "APP"));
		capabilities.setCapability("appiumVersion", GenericLib.getCongigValue(sConfigFile, "APPIUMVERSION"));
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("name","Shopclues Parallel Test Run on Sauce Cloud.");
		capabilities.setCapability("newCommandTimeout", 75);			
//		driver = new AndroidDriver( new URL("http://" + authentication.getUsername() + ":"+ authentication.getAccessKey() + "@ondemand.saucelabs.com:80/wd/hub"), capabilities);
		driver = new AndroidDriver( new URL("http://Srinivas49:21222c75-451d-4a32-96b7-7e7dbeaf1a8e@ondemand.saucelabs.com:80/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		sessionId = driver.getSessionId().toString();
	}

	@AfterTest
	public void tearDown(){
		driver.quit();
	}
		
	public String getSessionId() {
		return sessionId;
	}	
}
