package com.shopclues.scripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shopclues.library.BaseLib;
import com.shopclues.library.GenericLib;
import com.shopclues.po.HomePo;

public class PlaceOrderTest extends BaseLib
{
	HomePo homePo=null;
	String[] sData=null;
	String sTestCaseID=null;
	String unfilteredItems = null;
	String filteredItems = null;
	String sTestDataFile = null;

	/* @TestCaseID: PlaceOrder_03
	 * @Description: Click a product from deal present on home page and add that product in cart.*/
	@Parameters({"deviceName","version","data"})
	@Test(priority=1,enabled=false,description="Click a product from deal present on home page and add that product in cart.")
	public void testAddProducttoCart(String deviceId, String version, String data) throws Exception
	{	
		sTestDataFile = sDirPath+"\\"+data;
		System.out.println("2 execution"+data);
		homePo= new HomePo(driver);
		sTestCaseID="PlaceOrder_03";
		sData=GenericLib.toReadExcelData(sTestCaseID,sTestDataFile);
		try
		{
			Thread.sleep(10000);
			for(int i=0;i<=7;i++){
			homePo.scrollDown();
			}
			homePo.getEleDealProduct().click();
			homePo.getEleAddCartIcon().click();
			homePo.getEleCartIcon().click();
			Assert.assertTrue(homePo.getEleCartProductName().isDisplayed(),"Product is not displayed in cart page");
			Reporter.log("Product is successfully displayed in cart page");
		}
		catch(Exception e)
		{
			Reporter.log("Failed");
			throw e;
		}
	}
	/* @TestCaseID: PlaceOrder_03
	 * @Description:Search any product from home page and then verify search result shows the list of product.*/
	@Parameters({"deviceName","version","data"})
	@Test(priority=2,enabled=false,description= "Search any product from home page and then verify search result shows the list of product.")
	public void testSearchResult(String deviceId, String version, String data) throws Exception
	{
		sTestDataFile = sDirPath+"\\"+data;
		System.out.println("1 execution"+data);
		homePo= new HomePo(driver);
		sTestCaseID="PlaceOrder_03";
		sData=GenericLib.toReadExcelData(sTestCaseID,sTestDataFile);
		try
		{   homePo.getEleSearchTxtFld().click();
			homePo.getEleSearchTxtFld().sendKeys(sData[3]);
			Thread.sleep(3000);
			homePo.getEleSearchTxtFld().click();
			Thread.sleep(10000);
			//driver.sendKeyEvent(AndroidKeyCode.ENTER);
			Thread.sleep(3000);
			for(WebElement eleSearchlist:homePo.getEleSearchList()){
				Assert.assertTrue(eleSearchlist.isDisplayed(), eleSearchlist.getText()+"Product list is not displayed after entering the search button");
				Reporter.log(eleSearchlist.getText()+"Product list is successfully displayed after entering the search button");
			}
		}
		catch(Exception e)
		{
			Reporter.log("Failed");
			throw e;
		}
	}
	/* @TestCaseID: PlaceOrder_03
	 * @Description:Apply filter on list of products displayed on product list page.*/
	@Test(priority=3,enabled=false,description="Apply filter on list of products displayed on product list page.")
	public void testFilteredProdectList() throws Exception
	{
		homePo = new HomePo(driver);
//		sTestCaseID="FilterProduct_03";
//		sData=GenericLib.toReadExcelData(sTestCaseID);
		
		try{
			homePo.getEleSearchTxtFld().sendKeys("Mobiles");
//			driver.sendKeyEvent(AndroidKeyCode.ENTER);
			Thread.sleep(2000);
			unfilteredItems = homePo.getEleItemsCountNum().getText();
			homePo.getEleFilterBtn().click();
			homePo.getEleCategoryTxt().click();
			homePo.getEleMobileTabletsTxt().click();
			homePo.getEleAndroidTxt().click();
			homePo.getEleBrandTxt().click();
			homePo.getEleMotorolaTxt().click();
			homePo.getEleCODAvailableTxt().click();
			homePo.getEleYesTxt().click();
			homePo.getEleTopMerchantTxt().click();
			homePo.getEleYesTxt().click();
			homePo.getEleFilterPriceTxt().click();
			homePo.getElePriceRangeTxt().click();
			homePo.getEleApplyFilterBtn().click();
			filteredItems = homePo.getEleItemsCountNum().getText();	
			Assert.assertTrue(homePo.getEleProductName().isDisplayed(),"Filter product is not displayed");
			Reporter.log("Filter product is successfully displayed");
			
		}catch(Exception e)
		{
			Reporter.log("Failed");
            throw e;
		}
	}	
	
	@Test(priority=4,enabled=true,description= "Search any product from home page and then verify search result shows the list of product.")
	public void findMeAShoe() throws Exception{
		
		homePo= new HomePo(driver);
		
		try{
			homePo.getEleCloseBtn().click();
			Thread.sleep(2000);
			homePo.getEleHamburgerIcn().click();
			homePo.getEleHamburgerIcn().click();
			homePo.getEleFootwearTxt().click();
			homePo.scrollDown();
			Thread.sleep(2000);
			homePo.getEleWomenFootwearTxt().click();
			homePo.getEleSportShoesTxt().click();
			Thread.sleep(5000);
			unfilteredItems = homePo.getEleItemsCountNum().getText();
			System.out.println("Total number of shoes before filter = "+unfilteredItems);
			homePo.getEleFilterBtn().click();
			homePo.getEleCODAvailableTxt().click();
			homePo.getEleYesTxt().click();
			homePo.getEleTopMerchantTxt().click();
			homePo.getEleYesTxt().click();
			homePo.getEleFilterPriceTxt().click();
			homePo.getElePriceRangeTxt().click();
			homePo.getEleApplyFilterBtn().click();
			Thread.sleep(5000);
			filteredItems = homePo.getEleItemsCountNum().getText();
			System.out.println("Total number of shoes after filter = "+filteredItems);
		}	
		catch(Exception e)
		{
			Reporter.log("Failed");
			throw e;
		}
	}
	
}
