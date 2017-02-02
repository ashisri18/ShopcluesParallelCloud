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
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
 
//public class BaseLib implements SauceOnDemandSessionIdProvider{


public class BaseLib2 {
	static public String sDirPath=System.getProperty("user.dir");
	public static String sTestDataFile = null;
	public static String sConfigFile = sDirPath + "\\Capabilities.Properties";
	public static String sAppPath = sDirPath + "\\Shopclues.apk";
	public DesiredCapabilities capabilities;
	public static AndroidDriver driver;
	String[] sData=null;
	public static URL localUrl;
	
	
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
	

	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	
	public void setServerCommand(String portNum) throws ExecuteException, IOException, InterruptedException{
		CommandLine command = new CommandLine("cmd");
		command.addArgument("/c");

		command.addArgument("appium");
		command.addArgument("--address");
		command.addArgument("127.0.0.1");
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

	
		
//	public String getSessionId() {
//		return sessionId;
//	}	
	
	@Parameters({"deviceId","data"})
	@BeforeTest()
	public void setCapability(String deviceId, String data) throws MalformedURLException
	{
		sTestDataFile = sDirPath+"\\"+data;
		System.out.println(sTestDataFile);
		sData =  GenericLib.toReadExcelData(deviceId, sTestDataFile);
		System.out.println(Arrays.toString(sData));
		
		System.out.println("inside setCapabilities for " +sData[2]);
		File app = new File(sAppPath);
		
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion",sData[1] );		
		capabilities.setCapability("deviceName", deviceId);
		capabilities.setCapability("deviceType","phone");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appiumVersion", GenericLib.getCongigValue(sConfigFile, "APPIUMVERSION"));
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("name","Shopclues Parallel Test Run");
		capabilities.setCapability("newCommandTimeout", 75);
		driver = new AndroidDriver( new URL("http://127.0.0.1:"+sData[2]+"/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

	}
		
	
}