package com.shopclues.library;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
 
//public class BaseLib implements SauceOnDemandSessionIdProvider{
public class BaseLib5 {
	static public String sDirPath=System.getProperty("user.dir");
	public static String sTestDataFile = sDirPath + "\\TestData.xlsx";
	public static String sConfigFile = sDirPath + "//Capabilities.Properties";
	public static String sAppPath = sDirPath + "//Shopclues.apk";
	public DesiredCapabilities capabilities;

	public static AndroidDriver driver;
	/*final private String USERNAME = System.getenv("SAUCE_USERNAME");
	final private String ACCESS_KEY = System.getenv("SAUCE_ACCESS_KEY");
	private SauceOnDemandAuthentication authentication = new SauceOnDemandAuthentication(USERNAME,ACCESS_KEY);

	public String sessionId;*/
	
	@BeforeSuite
	public void serverStart() throws ExecuteException, IOException, InterruptedException{
		setServerCommand(GenericLib.getCongigValue(sConfigFile, "PORTNUM_1"));
		setServerCommand(GenericLib.getCongigValue(sConfigFile, "PORTNUM_2"));
	}
	
	@AfterSuite
	public void serverStop() throws ExecuteException, IOException, InterruptedException{
		CommandLine command = new CommandLine("cmd");
		command.addArgument("/c");
		command.addArgument("taskkill");
		command.addArgument("/F");
		command.addArgument("/IM");
		command.addArgument("node.exe");
		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		executor.execute(command, resultHandler);
		
		Thread.sleep(10000);
		System.out.println("Server stops programmtically.");
	}
	
	@Parameters("deviceId")
	@BeforeTest()
	public void driverSetup(String deviceId) throws MalformedURLException, InterruptedException{
		System.out.println("Path = "+sConfigFile);
		if(deviceId.equalsIgnoreCase("1837ec59")){
		setCapabilities(GenericLib.getCongigValue(sConfigFile, "PLATFORMNAME_1"),
				GenericLib.getCongigValue(sConfigFile, "PLATFORMVERSION_1"),
				GenericLib.getCongigValue(sConfigFile, "DEVICENAME_1"),
				GenericLib.getCongigValue(sConfigFile, "PORTNUM_1"));
		System.out.println("deive_1 has launched");
		}
		if(deviceId.equalsIgnoreCase("FZ1015JA087074")){
		setCapabilities(GenericLib.getCongigValue(sConfigFile, "PLATFORMNAME_2"),
				GenericLib.getCongigValue(sConfigFile, "PLATFORMVERSION_2"),
				GenericLib.getCongigValue(sConfigFile, "DEVICENAME_2"),
				GenericLib.getCongigValue(sConfigFile, "PORTNUM_2"));
		System.out.println("deive_2 has launched");
		}
		
	}

	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	/*@BeforeMethod
	public void launchApp()
	{
		
		//driver.launchApp();
	}

	@AfterMethod
	public void closeApp()
	{
		//driver.closeApp();
	}*/
	
	public void setServerCommand(String portNum) throws ExecuteException, IOException, InterruptedException{
		CommandLine command = new CommandLine("cmd");
		command.addArgument("/c");

		command.addArgument("appium");
		command.addArgument("--address");
		command.addArgument("0.0.0.0");
		command.addArgument("--port");
		command.addArgument(portNum);
		command.addArgument("--no-reset");
		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		executor.execute(command, resultHandler);
		
		Thread.sleep(10000);
		System.out.println("Server starts programmtically.");
	}

	public AndroidDriver setCapabilities(String platformName,String platformVersion,String deviceName,String portNum) throws MalformedURLException, InterruptedException{
		File app = new File(sAppPath);
		
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", platformName);
		capabilities.setCapability("platformVersion", platformVersion);		
		capabilities.setCapability("deviceName", deviceName);
		capabilities.setCapability("deviceType","phone");
//		capabilities.setCapability("app", GenericLib.getCongigValue(sConfigFile, "APP"));
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appiumVersion", GenericLib.getCongigValue(sConfigFile, "APPIUMVERSION"));
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("name","Shopclues Parallel Test Run");
		capabilities.setCapability("newCommandTimeout", 75);
//	    URL sauceUrl = new URL("http://" + authentication.getUsername() + ":"+ authentication.getAccessKey() + "@ondemand.saucelabs.com:80/wd/hub");
//	    URL sauceUrl = new URL("http://raghukiran92:1a47a022-74f9-40d1-bcfb-ce7f12989370@ondemand.saucelabs.com:80/wd/hub");
		URL localUrl = new URL("http://0.0.0.0:"+portNum+"/wd/hub");
		driver = new AndroidDriver(localUrl, capabilities);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//		sessionId = driver.getSessionId().toString();
		return driver;
	}
		
//	public String getSessionId() {
//		return sessionId;
//	}	
}
