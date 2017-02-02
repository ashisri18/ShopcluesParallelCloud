package com.shopclues.po;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;


public class HomePo {

	JavascriptExecutor js=null;
    HashMap<String, String> scrollObject=null;
    AndroidDriver driver = null;
	
	public HomePo(AndroidDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@name='Submit']")
	private WebElement eleSubmitBtn;
	public WebElement getEleSubmitBtn(){
	
		return eleSubmitBtn;
	}
	
	@FindBy(id="com.shopclues:id/action_more")
	private WebElement eleMenuBar;
	public WebElement getEleMenuBar()
	{
		return eleMenuBar;
	}
	

	@FindBy(id="com.shopclues:id/tvLogin")
	private WebElement eleLoginIcn;
	public WebElement getEleLoginIcn()
	{
		return eleLoginIcn;
	}
	
	@FindBy(id="com.shopclues:id/userName")
	private WebElement eleUsernameTxtField;
	public WebElement getEleUsernameTxtField()
	{
		return eleUsernameTxtField;
	}
	@FindBy(id="com.shopclues:id/password")
	private WebElement elePwdTxtField;
	public WebElement getElePwdTxtField()
	{
		return elePwdTxtField;
	}
	
	@FindBy(name="Login")
	private WebElement eleLoginBtn;
	public WebElement getEleLoginBtn()
	{
		return eleLoginBtn;
	}
	@FindBy(id="com.shopclues:id/editText1")
	private WebElement eleSearchTxtFld;
	public WebElement getEleSearchTxtFld()
	{
		return eleSearchTxtFld;
	}
	@FindBy(name="SORT")
	private WebElement eleSortIcon;
	public WebElement getEleSortIcon()
	{
		return eleSortIcon;
	}
	
	@FindBy(name="FILTERS")
	private WebElement eleFiltersIcon;
	public WebElement getEleFiltersIcon()
	{
		return eleFiltersIcon;
	}
	@FindBy(id="com.shopclues:id/tvproduct_name")
	private WebElement eleProductName;
	public WebElement getEleProductName()
	{
		return eleProductName;
	}
	@FindBy(name="Test Product For Automation")
	private WebElement eleFullProductName;
	public WebElement getEleFullProductName()
	{
		return eleFullProductName;
	}
	@FindBy(id="com.shopclues:id/product_id")
	private WebElement eleProductId;
	public WebElement getEleProductId()
	{
		return eleProductId;
	}
	@FindBy(id="com.shopclues:id/ratings")
	private WebElement eleRatingTxt;
	public WebElement getEleRatingTxt()
	{
		return eleRatingTxt;
	}
	
	@FindBy(id="com.shopclues:id/rating_nombers")
	private WebElement eleReviewTxt;
	public WebElement getEleReviewTx()
	{
		return eleReviewTxt;
	}
	@FindBy(id="com.shopclues:id/image")
	private WebElement elePicOfProduct;
	public WebElement getElePicOfProduct()
	{
		return elePicOfProduct;
	}
	
	@FindBy(id="com.shopclues:id/tv_third_price")
	private WebElement elePrice;
	public WebElement getElePrice()
	{
		return elePrice;
	}
	@FindBy(id="com.shopclues:id/is_cod")
	private WebElement eleCOD;
	public WebElement getEleCOD()
	{
		return eleCOD;
	}
	@FindBy(id="com.shopclues:id/shipping_freight")
	private WebElement eleShippingTxt;
	public WebElement getEleShippingTxt()
	{
		return eleShippingTxt;
	}
	
	@FindBy(name="BUY NOW")
	private WebElement eleBuyNowBtn;
	public WebElement getEleBuyNowBtn()
	{
		return eleBuyNowBtn;
	}
	
	@FindBy(id="com.shopclues:id/text_seller_info")
	private WebElement eleSellerInfo;
	public WebElement getEleSellerInfo()
	{
		return eleSellerInfo;
	}
	
	@FindBy(name="Description")
	private WebElement eleDescription;
	public WebElement getEleDescription()
	{
		return eleDescription;
	}
	
	@FindBy(id="com.shopclues:id/img_cart_item_delete")
	private WebElement eleCartDelete;
	public WebElement getEleCartDelete()
	{
		return eleCartDelete;
	}
	
	@FindBy(id="com.shopclues:id/tv_quantity")
	private WebElement eleQuantity;
	public WebElement getEleQuantity()
	{
		return eleQuantity;
	}
	
	@FindBy(id="com.shopclues:id/tv_price_cross_qty")
	private WebElement elePriceTxt;
	public WebElement getElePriceTxt()
	{
		return elePriceTxt;
	}
	@FindBy(id="com.shopclues:id/tv_shipping_cross_qty")
	private WebElement eleShipping;
	public WebElement getEleShipping()
	{
		return eleShipping;
	} 
	@FindBy(className="android.widget.TextView")
	private WebElement eleGrandTotal;
	public WebElement getEleGrandTotal()
	{
		return eleGrandTotal;
	}
	@FindBy(name="Place Order")
	private WebElement elePlaceorderBtn;
	public WebElement getElePlaceorderBtn()
	{
		return elePlaceorderBtn;
	}
	
	@FindBy(id="com.shopclues:id/tv_change")
	private WebElement eleChangeBtn;
	public WebElement getEleChangeBtn()
	{
		return eleChangeBtn;
	}
	
	@FindBy(id="com.shopclues:id/menu_add_new")
	private WebElement eleAddnewicon;
	public WebElement getEleAddnewicon()
	{
		return eleAddnewicon;
	}
	@FindBy(id="com.shopclues:id/et_pincode")
	private WebElement elePincodeTxtFld;
	public WebElement getElePincodeTxtFld()
	{
		return elePincodeTxtFld;
	}
	
	@FindBy(id="com.shopclues:id/et_first_name")
	private WebElement eleNameTxtFld;
	public WebElement getEleNameTxtFld()
	{
		return eleNameTxtFld;
	}
	
	@FindBy(id="com.shopclues:id/et_contact")
	private WebElement elePhoneNumTxtFld;
	public WebElement getElePhoneNumTxtFld()
	{
		return elePhoneNumTxtFld;
	}
	
	@FindBy(id="com.shopclues:id/et_address1")
	private WebElement eleAddress1TxtFld;
	public WebElement getEleAddress1TxtFld()
	{
		return eleAddress1TxtFld;
	}
	
	@FindBy(id="com.shopclues:id/et_address2")
	private WebElement eleAddress2TxtFld;
	public WebElement getEleAddress2TxtFld()
	{
		return eleAddress2TxtFld;
	}
	
	@FindBy(id="com.shopclues:id/et_city")
	private WebElement eleCityTxtFld;
	public WebElement getEleCityTxtFld()
	{
		return eleCityTxtFld;
		
	}
	@FindBy(name="Karnataka")
	private WebElement eleStateList;
	public WebElement getEleStateList()
	{
		return eleStateList;
	}
	
	@FindBy(id="com.shopclues:id/spinner_state")
	private WebElement eleSelectState;
	public WebElement getEleSelectState()
	{
		return eleSelectState;
		
	}
	@FindBy(id="com.shopclues:id/rb_home")
	private WebElement eleHomeRadio;
	public WebElement getEleHomeRadio()
	{
		return eleHomeRadio;
		
	}
	
	@FindBy(id="com.shopclues:id/rb_office")
	private WebElement eleOfficeRadio;
	public WebElement getEleOfficeRadio()
	{
		return eleOfficeRadio;
		
	}

	@FindBy(id="com.shopclues:id/rb_other")
	private WebElement eleOtherRadio;
	public WebElement getEleOtherRadio()
	{
		return eleOtherRadio;
		
	}
	
	@FindBy(name="Save & Continue")
	private WebElement eleSaveandContinueBtn;
	public WebElement getEleSaveandContinueBtn()
	{
		return eleSaveandContinueBtn;
	}
	
	@FindBy(id="com.shopclues:id/et_first_name")
	private WebElement eleNameTxt;
	public WebElement getEleNameTxt()
	{
		return eleNameTxt;
		
	}
	
	@FindBy(id="com.shopclues:id/tv_name")
	private WebElement eleAddressNameTxt;
	public WebElement getEleAddressNameTxt()
	{
		return eleAddressNameTxt;
		
	}

	
	@FindBy(id="com.shopclues:id/tv_phone")
	private WebElement eleAddressPhoneNumTxt;
	public WebElement getEleAddressPhoneNumTxt()
	{
		return eleAddressPhoneNumTxt;
		
	}
	
	@FindBy(id="com.shopclues:id/et_contact")
	private WebElement elePhoneNumTxt;
	public WebElement getElePhoneNumTxt()
	{
		return elePhoneNumTxt;
		
	}
	@FindBy(id="com.shopclues:id/tv_address")
	private WebElement eleAddressTxt;
	public WebElement getEleAddressTxt()
	{
		return eleAddressTxt;
		
	}
	
	@FindBy(id="com.shopclues:id/tv_edit")
	private WebElement eleEditIcon;
	public WebElement getEleEditIcon()
	{
		return eleEditIcon;
		
	}
	@FindBy(id="com.shopclues:id/tv_ship_to")
	private WebElement eleShipToAddressName;
	public WebElement getEleShipToAddressName()
	{
		return eleShipToAddressName;
		
	}
	@FindBy(id="com.shopclues:id/tv_change")
	private WebElement eleChangeIcon;
	public WebElement getEleChangeIcon()
	{
		return eleChangeIcon;
		
	}
	
	@FindBy(id="com.shopclues:id/tv_product")
	private WebElement eleProductNameTxt;
	public WebElement getEleProductNameTxt()
	{
		return eleProductNameTxt;
		
	}
	@FindBy(id="com.shopclues:id/tv_price")
	private WebElement eleAmountTxt;
	public WebElement getEleAmountTxt()
	{
		return eleAmountTxt;
		
	}
	
	@FindBy(name="Total Order Value")
	private WebElement eleTotalOrderValueTxt;
	public WebElement getEleTotalOrderValueTxt()
	{
		return eleTotalOrderValueTxt;
		
	}
	
	@FindBy(name="Total Discount")
	private WebElement eleTotalDiscountTxt;
	public WebElement getEleTotalDiscountTxt()
	{
		return eleTotalDiscountTxt;
		
	}
	@FindBy(name="Total Shipping Charges")
	private WebElement eleTotalShippingChargesTxt;
	public WebElement getEleTotalShippingChargesTxt()
	{
		return eleTotalShippingChargesTxt;
		
	}
	
	@FindBy(name="Grand Total")
	private WebElement eleGrandTotalTxt;
	public WebElement getEleGrandTotalTxt()
	{
		return eleGrandTotalTxt;
		
	}
	@FindBy(id="com.shopclues:id/tv_clues_bucks")
	private WebElement eleCluebucksTxtFld;
	public WebElement getEleCluebucksTxtFld()
	{
		return eleCluebucksTxtFld;
		
	}
	
	@FindBy(id="com.shopclues:id/et_coupon")
	private WebElement eleCouponCodeTxtFld;
	public WebElement getEleCouponCodeTxtFld()
	{
		return eleCouponCodeTxtFld;
		
	}
	
	@FindBy(id="com.shopclues:id/tv_redeem")
	private WebElement eleRedeemBtn;
	public WebElement getEleRedeemBtn()
	{
		return eleRedeemBtn;
		
	}
	
	
	@FindBy(id="com.shopclues:id/tv_apply")
	private WebElement eleApplyBtn;
	public WebElement getEleApplyBtn()
	{
		return eleApplyBtn;
		
	}
	
	@FindBy(name="Credit Card")
	private WebElement eleCreditCardRadioBtn;
	public WebElement getEleCreditCardRadioBtn()
	{
		return eleCreditCardRadioBtn;
		
	}

	@FindBy(id="com.shopclues:id/spinner_payment_mode")
	private WebElement eleSelectCardTypeList;
	public WebElement getEleSelectCardTypeList()
	{
		return eleSelectCardTypeList;
		
	}

	
	@FindBy(name="Debit Card")
	private WebElement eleDebitCardRadioBtn;
	public WebElement getEleDebitCardRadioBtn()
	{
		return eleCreditCardRadioBtn;
		
	}
	
	@FindBy(name="Cash Cards/Wallets")
	private WebElement eleCashCardsRadioBtn;
	public WebElement getEleCashCardsRadioBtn()
	{
		return eleCashCardsRadioBtn;
		
	}
	@FindBy(name="Net Banking")
	private WebElement eleNetBankingRadioBtn;
	public WebElement getEleNetBankingRadioBtn()
	{
		return eleNetBankingRadioBtn;
		
	}
	
	@FindBy(id="com.shopclues:id/rb_payment_mode")
	private WebElement eleCODRadioBtn;
	public WebElement getEleCODRadioBtn()
	{
		return eleCODRadioBtn;
		
	}
	
	@FindBy(name="Gift Cards")
	private WebElement eleGiftCardsRadioBtn;
	public WebElement getEleGiftCardsRadioBtn()
	{
		return eleGiftCardsRadioBtn;
		
	}
	
	@FindBy(id="com.shopclues:id/tv_pay_now")
	private WebElement elePlaceOrderBtn;
	public WebElement getElePlaceOrderBtn()
	{
		return elePlaceOrderBtn;
		
	}
	@FindBy(id="com.shopclues:id/tv_address_type")
	private WebElement eleAddressTypeTxt;
	public WebElement getEleAddressTypeTxt()
	{
		return eleAddressTypeTxt;
		
	}
	
	@FindBy(name="Track Order")
	private WebElement eleTrackOrderBtn;
	public WebElement getEleTrackOrderBtn()
	{
		return eleTrackOrderBtn;
		
	}
	
	@FindBy(id="com.shopclues:id/tv_payment_status")
	private WebElement eleThankMessageTxt;
	public WebElement getEleThankMessageTxt()
	{
		return eleThankMessageTxt;
		
	}

	
	@FindBy(name="Continue Shopping")
	private WebElement eleContinueShoppingBtn;
	public WebElement getEleContinueShoppingBtn()
	{
		return eleContinueShoppingBtn;
		
	}
	
	@FindBy(className="android.widget.ListView")
	private List<WebElement> eleMyOrdersPage;
	public List<WebElement> getEleMyOrdersPage()
	{
		return eleMyOrdersPage;
		
	}
	@FindBy(className="android.widget.ListView")
	private List<WebElement> eleSearchList;
	public List<WebElement> getEleSearchList()
	{
		return eleSearchList;
		
	}
	
	
	@FindBy(className="android.widget.TextView")
	private List<WebElement>  eleFieldErrorMessage;
	public List<WebElement>  getEleFieldErrorMessage()
	{
		return eleFieldErrorMessage;
		
	}
	
	@FindBy(id="com.shopclues:id/tv_payment_helptext")
	private WebElement eleOrderId;
	public WebElement getEleOrderId()
	{
		return eleOrderId;
		
	}
	@FindBy(id="com.shopclues:id/image")
	private WebElement eleDealProduct;
	public WebElement getEleDealProduct()
	{
		return eleDealProduct;
		
	}
	@FindBy(id="com.shopclues:id/add_to_cart")
	private WebElement eleAddCartIcon;
	public WebElement getEleAddCartIcon()
	{
		return eleAddCartIcon;
		
	}
	@FindBy(id="com.shopclues:id/cart")
	private WebElement eleCartIcon;
	public WebElement getEleCartIcon()
	{
		return eleCartIcon;
		
	}
	@FindBy(id="com.shopclues:id/tv_cart_item_name")
	private WebElement eleCartProductName;
	public WebElement getEleCartProductName()
	{
		return  eleCartProductName;
		
	}
	
	@FindBy(name="My Orders")
	private WebElement eleMyOrderIcon;
	public WebElement getEleMyOrderIcon()
	{
		return eleMyOrderIcon;
		
	}
	
// ******************************Elements for Filter Product Test *********************************
	@FindBy(id="tvTotalItemCount")
	private WebElement eleItemsCountNum;
	public WebElement getEleItemsCountNum(){
		return eleItemsCountNum;
	}
	@FindBy(id="textView_filter")
	private WebElement eleFilterBtn;
	public WebElement getEleFilterBtn(){
		return eleFilterBtn;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'CATEGORY')]")
	private WebElement eleCategoryTxt;
	public WebElement getEleCategoryTxt(){
		return eleCategoryTxt;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'₹ 349')]")
	private WebElement eleCategoryTxt1;
	public WebElement getEleCategoryTxt1(){
		return eleCategoryTxt1;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Mobiles & Tablets')]")
	private WebElement eleMobileTabletsTxt;
	public WebElement getEleMobileTabletsTxt(){
		return eleMobileTabletsTxt;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Android Phones')]")
	private WebElement eleAndroidTxt;
	public WebElement getEleAndroidTxt(){
		return eleAndroidTxt;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'BRAND')]")
	private WebElement eleBrandTxt;
	public WebElement getEleBrandTxt(){
		return eleBrandTxt;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Motorola')]")
	private WebElement eleMotorolaTxt;
	public WebElement getEleMotorolaTxt(){
		return eleMotorolaTxt;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'COD AVAILABLE')]")
	private WebElement eleCODAvailableTxt;
	public WebElement getEleCODAvailableTxt(){
		return eleCODAvailableTxt;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Yes')]")
	private WebElement eleYesTxt;
	public WebElement getEleYesTxt(){
		return eleYesTxt;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'TOP RATED MERCHANT')]")
	private WebElement eleTopMerchantTxt;
	public WebElement getEleTopMerchantTxt(){
		return eleTopMerchantTxt;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'PRICE')]")
	private WebElement eleFilterPriceTxt;
	public WebElement getEleFilterPriceTxt(){
		return eleFilterPriceTxt;
	}
	/*@FindBy(xpath="//android.widget.TextView[contains(@text,'10,001 - 20,000')]")
	private WebElement elePriceRangeTxt;
	public WebElement getElePriceRangeTxt(){
		return elePriceRangeTxt;
	}*/
	@FindBy(id="button_apply_filter")
	private WebElement eleApplyFilterBtn;
	public WebElement getEleApplyFilterBtn(){
		return eleApplyFilterBtn;
	}
// ************************Find Me A Shoe ***************************************************	
	@FindBy(xpath="//android.widget.ImageButton[contains(@content-desc,'Open navigation drawer')]")
	private WebElement eleHamburgerIcn;
	public WebElement getEleHamburgerIcn(){
		return eleHamburgerIcn;
	}
	@FindBy(id="close_dialog")
	private WebElement eleCloseBtn;
	public WebElement getEleCloseBtn(){
		return eleCloseBtn;
	}
	@FindBy(id="action_more")
	private WebElement eleListIcn;
	public WebElement getEleListIcn(){
		return eleListIcn;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Footwear')]")
	private WebElement eleFootwearTxt;
	public WebElement getEleFootwearTxt(){
		return eleFootwearTxt;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Shoe Care')]")
	private WebElement eleWomenFootwearTxt;
	public WebElement getEleWomenFootwearTxt(){
		return eleWomenFootwearTxt;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Shoe Insoles and Inserts')]")
	private WebElement eleSportShoesTxt;
	public WebElement getEleSportShoesTxt(){
		return eleSportShoesTxt;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Badminton Shoes')]")
	private WebElement eleBadmintonShoesTxt;
	public WebElement getEleBadmintonShoesTxt(){
		return eleBadmintonShoesTxt;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'300 - Rs. 499')]")
	private WebElement elePriceRangeTxt;
	public WebElement getElePriceRangeTxt(){
		return elePriceRangeTxt;
	}
	
	/* @Descripyion:To login into the app.
     * @Author: RaghuKiran MR*/
	public void login(String username,String Password,String sData[]) throws InterruptedException {
		Thread.sleep(10000);
		getEleMenuBar().click();
		getEleLoginIcn().click();
		getEleUsernameTxtField().sendKeys(username);
		getElePwdTxtField().sendKeys(Password);
		driver.hideKeyboard();
		Thread.sleep(5000);
		driver.findElement(By.id("com.shopclues:id/login")).click();
		//Assert.assertTrue(getEleSubmitBtn().isDisplayed(),"Homepage is not displayed");
		//NXGReports.addStep("Homepage is successfully displayed", LogAs.PASSED, null);
	}
	public void login1(String username,String Password,String sData[]) throws InterruptedException {
		getEleMenuBar().click();
		getEleLoginIcn().click();
		getEleUsernameTxtField().sendKeys(username);
		getElePwdTxtField().sendKeys(Password);
		driver.hideKeyboard();
		driver.findElement(By.id("com.houzify:id/loginButton")).click();
		Thread.sleep(1000);
	}
	
	//Scroll the page	
	public void scrollDown() throws InterruptedException
	    {
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		driver.swipe(0,scrollStart,0,scrollEnd,2000);
		}
		
	
	//scroll the page
	public void scrolldown1(){
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		System.out.println("s="+scrollStart);
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		for (int i = 0; i < dimensions.getHeight(); i++) {
		driver.swipe(0,scrollStart,0,scrollEnd,2000);
		}
	}
	/* @Descripyion:To search for a product and navigate to search result page.
     * @Author:RaghuKiran MR*/
		public void searchProduct(String sData[]) throws InterruptedException{
		getEleSearchTxtFld().sendKeys(sData[3]);
		Thread.sleep(3000);
		getEleSearchTxtFld().click();
		Thread.sleep(10000);
		//driver.pressKeyCode(AndroidKeyCode.ENTER);
		//driver.sendKeyEvent(AndroidKeyCode.ENTER);
		Thread.sleep(3000);
		Assert.assertTrue(getEleSortIcon().isDisplayed(),"ShortBy icon is not displayed");
		Reporter.log("ShortBy icon is successfully displayed");
		Assert.assertTrue(getEleFiltersIcon().isDisplayed(),"Filters icon is not displayed");
		Reporter.log("Filters icon is successfully displayed");
		Assert.assertTrue(getEleProductName().isDisplayed(),"Productname is not displayed");
		Reporter.log("Productname is successfully displayed");
	}
		

	/* @Descripyion:To click on the product in the search result page and navigate to product description page.
     * @Author: RaghuKiran MR*/
		public void productDescription() throws InterruptedException{
		getEleProductName().click();
		Assert.assertTrue(getEleFullProductName().isDisplayed(),"Productname is not displayed");
		Reporter.log("Productname is successfully displayed");
		Assert.assertTrue(getEleProductId().isDisplayed(),"ProductId is not displayed");

		Reporter.log("ProductId is successfully displayed");
		Assert.assertTrue(getEleRatingTxt().isDisplayed(),"Rating is not displayed");
		Reporter.log("Rating is successfully displayed");
		Assert.assertTrue(getEleReviewTx().isDisplayed(),"Review is not displayed");
		Reporter.log("Review is successfully displayed");
		Assert.assertTrue(getElePicOfProduct().isDisplayed(),"Image of the product is not displayed");
		Reporter.log("Image of the product is successfully displayed");
		Assert.assertTrue(getElePrice().isDisplayed(),"Price is not displayed");
		Reporter.log("Price is successfully displayed");
		Assert.assertTrue(getEleCOD().isDisplayed(),"COD is not displayed");
		Reporter.log("COD is successfully displayed");
		Thread.sleep(5000);
		scrollDown();
		Assert.assertTrue(getEleShippingTxt().isDisplayed(),"Shipping text is not displayed");
		Reporter.log("Shipping text is successfully displayed");
		Thread.sleep(5000);
		scrollDown();
		Assert.assertTrue(getEleSellerInfo().isDisplayed(),"Seller information  is not displayed");
		Reporter.log("Seller information  is successfully displayed");
		scrollDown();
		Assert.assertTrue(getEleDescription().isDisplayed(),"Description is not displayed");
		Reporter.log("Description is successfully displayed");
		Assert.assertTrue(getEleBuyNowBtn().isDisplayed(),"Buy now button is not displayed");
		Reporter.log("Buy now button is successfully displayed");
		getEleBuyNowBtn().click();
		}
	/* @Descripyion:To click on buy now button and navigate to cart page.
     * @Author: RaghuKiran MR*/

	public void tocartPage(){
		Assert.assertTrue(getEleCartDelete().isDisplayed(),"Cross Link is not displayed");
		Reporter.log("Cross Link is successfully displayed");
		Assert.assertTrue(getEleQuantity().isDisplayed(),"Quantity of the product is not displayed");
		Reporter.log("Quantity of the product is successfully displayed");
		Assert.assertTrue(getElePriceTxt().isDisplayed(),"Price of the product is not displayed");
		Reporter.log("Price of the product is successfully displayed");
		Assert.assertTrue(getEleShipping().isDisplayed(),"Shipping free is not displayed");
		Reporter.log("Shipping free is successfully displayed");
		Assert.assertTrue(getEleGrandTotal().isDisplayed(),"Grand total is not displayed");
		Reporter.log("Grand total is successfully displayed");
		Assert.assertTrue(getElePlaceorderBtn().isDisplayed(),"Placeorder button is not displayed");
		Reporter.log("Placeorder button is successfully displayed");
		getElePlaceorderBtn().click();
	}
	/* @Descripyion:To click on Place Order button and navigate to Enter Address Page.
     * @Author: RaghuKiran MR*/

	public void enterAddressPage(String sData[]) throws InterruptedException{
		try{
		Assert.assertTrue(getEleChangeBtn().isDisplayed(),"Change link is not displayed");
		Reporter.log("Change link is successfully displayed");
		getEleChangeBtn().click();
		Thread.sleep(3000);
		getEleAddnewicon().click();
		Assert.assertTrue(getElePincodeTxtFld().isDisplayed(),"Pincode text field is not displayed");
		Reporter.log("Pincode text field is successfully displayed");
		getElePincodeTxtFld().sendKeys(sData[4]);
		Assert.assertTrue(getEleNameTxt().isDisplayed(),"Name text field is not displayed");
		Reporter.log("Name text field is successfully displayed");
		getEleNameTxt().sendKeys(sData[6]);
		Assert.assertTrue(getElePhoneNumTxtFld().isDisplayed(),"Phonenumber text field is not displayed");
		Reporter.log("Phonenumber text field is successfully displayed");
		getElePhoneNumTxtFld().sendKeys(sData[7]);
		driver.hideKeyboard();
		Assert.assertTrue(getEleAddress1TxtFld().isDisplayed(),"Address one text field is not displayed");
		Reporter.log("Address one text field is successfully displayed");
		getEleAddress1TxtFld().sendKeys(sData[8]);
		driver.hideKeyboard();
		Assert.assertTrue(getEleAddress2TxtFld().isDisplayed(),"Address text field is not displayed");
		Reporter.log("Address text field is successfully displayed");
		getEleAddress2TxtFld().sendKeys(sData[11]);
		driver.hideKeyboard();
		Assert.assertTrue(getEleCityTxtFld().isDisplayed(),"City text filed is not displayed");
		Reporter.log("City text field is successfully displayed");
		getEleCityTxtFld().clear();
		getEleCityTxtFld().sendKeys(sData[5]);
		driver.hideKeyboard();
		Assert.assertTrue(getEleSelectState().isDisplayed(),"Select State drop down arrow is not displayed");
		Reporter.log("Select State drop down arrow is successfully displayed");
		Assert.assertTrue(getEleHomeRadio().isDisplayed(),"Home radio button is not displayed");
		Reporter.log("Home radio button is successfully displayed");
		Assert.assertTrue(getEleOfficeRadio().isDisplayed(),"Office radio button is not displayed");
		Reporter.log("Office radio button is successfully displayed");
		Assert.assertTrue(getEleOtherRadio().isDisplayed(),"Other radio button is not displayed");
		Reporter.log("Orther radio button is successfully displayed");
		Assert.assertTrue(getEleSaveandContinueBtn().isDisplayed(),"Save and continue button is not displayed");
		Reporter.log("Save and continue button is successfully displayed");
		getEleSaveandContinueBtn().click();
		}catch(Exception e){
			
		}
	}
		
		//Verify without entering the value to the textfield
	public void withoutvalue() throws InterruptedException{
		getEleChangeBtn().click();
		Thread.sleep(3000);
		getEleAddnewicon().click();
		getEleSaveandContinueBtn().click();
		for(WebElement eleAddressErrorTxt:getEleFieldErrorMessage()){
			Assert.assertTrue(eleAddressErrorTxt.isDisplayed(), eleAddressErrorTxt.getText()+" is not displayed after clicking on save and continue button without entering value in the address text field.");
			Reporter.log(eleAddressErrorTxt.getText()+" is successfully displayed after clicking on save and continue button without entering value in the address text field.");

		}
	}
	/* @Descripyion:To click on Save and continue button and navigate to Address Page.
     * @Author: RaghuKiran MR*/
	public void addressPage() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.name("Navigate up")).click();
		Assert.assertTrue(getEleAddressNameTxt().isDisplayed(),"Name text is not displayed");
		Reporter.log("Name text is successfully displayed");
		Assert.assertTrue(getEleAddressPhoneNumTxt().isDisplayed(),"Phone number text field is not displayed");
		Reporter.log("Phone number text field is successfullly  displayed");
		Assert.assertTrue(getEleAddressTypeTxt().isDisplayed(),"Address Type text is not displayed");
		Reporter.log("Address Type text is successfully displayed");
		Assert.assertTrue(getEleAddressTxt().isDisplayed(),"Address text is not displayed");
		Reporter.log("Address text is successfully displayed");
		Assert.assertTrue(getEleEditIcon().isDisplayed(),"Edit link is not displayed");
		Reporter.log("Edit link is successfully displayed");
		Assert.assertTrue(getEleSaveandContinueBtn().isDisplayed(),"Save and continue button is not displayed");
		Reporter.log("Save and continue button is successfully displayed");
		getEleSaveandContinueBtn().click();	
		}
	
	/* @Descripyion:To click on Save and continue button and navigate to Checkout Page.
     * @Author: RaghuKiran MR*/
	public void checkoutPage(){
		Assert.assertTrue(getEleShipToAddressName().isDisplayed(),"Shipto address name is not displayed");
		Reporter.log("Shipto address name is successfully displayed");
		Assert.assertTrue(getEleChangeBtn().isDisplayed(),"Change button is not displayed");
		Reporter.log("Change button is successfully displayed");
		Assert.assertTrue(getEleAddressTxt().isDisplayed(),"Full address text is not displayed");
		Reporter.log("Full address text is successfully displayed");
		Assert.assertTrue(getEleProductNameTxt().isDisplayed(),"Product name is not displayed");
		Reporter.log("Product name is successfully displayed");
		Assert.assertTrue(getEleAmountTxt().isDisplayed(),"Product Amount is not displayed");
		Reporter.log("Product Amount is successfully displayed");
		Assert.assertTrue(getEleTotalOrderValueTxt().isDisplayed(),"Total order value is not displayed");
		Reporter.log("Total order value is successfully displayed");
		Assert.assertTrue(getEleTotalDiscountTxt().isDisplayed(),"Total discount is not displayed");
		Reporter.log("Total discount is successfully displayed");
		Assert.assertTrue(getEleTotalShippingChargesTxt().isDisplayed(),"Shipping charges amount is not displayed");
		Reporter.log("Shipping charges amount is successfully displayed");
		Assert.assertTrue(getEleGrandTotalTxt().isDisplayed(),"GrandTotal amount is not displayed");
		Reporter.log("GrandTotal amount is successfully displayed");
		Assert.assertTrue(getEleCluebucksTxtFld().isDisplayed(),"ClueBucks text field is not displayed");
		Reporter.log("ClueBucks text field is successfully displayed");
		Assert.assertTrue(getEleRedeemBtn().isDisplayed(),"Redeem button is not displayed");
		Reporter.log("Redeem button is successfully displayed");
		getEleRedeemBtn().click();
		getElePlaceorderBtn().click();
	}
	/* @Descripyion:To click on Place Order button and navigate to Checkout Page.
     * @Author: RaghuKiran MR*/
	public void thankyoupage(){
		Assert.assertTrue(getEleThankMessageTxt().isDisplayed(), "Thank message is not displayed");
		Reporter.log("Thank message is successfully displayed");
		Assert.assertTrue(getEleTrackOrderBtn().isDisplayed(), "TrackOrder button is not displayed");
		Reporter.log("TrackOrder button is successfully displayed");
		Assert.assertTrue(getEleContinueShoppingBtn().isDisplayed(), "ContinueShopping button is not displayed");
		Reporter.log("TrackOrder button is successfully displayed");
		getEleTrackOrderBtn().click();
		try{
		for(WebElement elemyorderpage:getEleMyOrdersPage()){
			Assert.assertTrue(elemyorderpage.isDisplayed(), elemyorderpage.getText()+" is not displayed after clicking on save and continue button without entering value in the address text field.");
			Reporter.log(elemyorderpage.getText()+" is successfully displayed after clicking on save and continue button without entering value in the address text field.");
		}

		}catch(Exception e){
			getEleMenuBar().click();
			getEleMyOrderIcon().click();
				for(WebElement elemyorderpage:getEleMyOrdersPage()){
					Assert.assertTrue(elemyorderpage.isDisplayed(), elemyorderpage.getText()+" is not displayed after clicking on save and continue button without entering value in the address text field.");
					Reporter.log(elemyorderpage.getText()+" is successfully displayed after clicking on save and continue button without entering value in the address text field.");
		}
		}
	}
	
	public void Couponcode(String sCouponcode){
		Assert.assertTrue(getEleShipToAddressName().isDisplayed(),"Shipto address name is not displayed");
		Reporter.log("Shipto address name is successfully displayed");
		Assert.assertTrue(getEleChangeBtn().isDisplayed(),"Change button is not displayed");
		Reporter.log("Change button is successfully displayed");
		Assert.assertTrue(getEleAddressTxt().isDisplayed(),"Full address text is not displayed");
		Reporter.log("Full address text is successfully displayed");
		Assert.assertTrue(getEleProductNameTxt().isDisplayed(),"Product name is not displayed");
		Reporter.log("Product name is successfully displayed");
		Assert.assertTrue(getEleAmountTxt().isDisplayed(),"Product Amount is not displayed");
		Reporter.log("Product Amount is successfully displayed");
		Assert.assertTrue(getEleTotalOrderValueTxt().isDisplayed(),"Total order value is not displayed");
		Reporter.log("Total order value is successfully displayed");
		Assert.assertTrue(getEleTotalDiscountTxt().isDisplayed(),"Total discount is not displayed");
		Reporter.log("Total discount is successfully displayed");
		Assert.assertTrue(getEleTotalShippingChargesTxt().isDisplayed(),"Shipping charges amount is not displayed");
		Reporter.log("Shipping charges amount is successfully displayed");
		Assert.assertTrue(getEleGrandTotalTxt().isDisplayed(),"GrandTotal amount is not displayed");
		Reporter.log("GrandTotal amount is successfully displayed");
		Assert.assertTrue(getEleCouponCodeTxtFld().isDisplayed(),"Coupon code textfield is not displayed");
		Reporter.log("Coupon code textfield is successfully displayed");
		getEleCouponCodeTxtFld().sendKeys(sCouponcode);
		Assert.assertTrue(getEleApplyBtn().isDisplayed(),"Apply button is not displayed");
		Reporter.log("Apply button is successfully displayed");
		getEleApplyBtn().click();
		getElePlaceorderBtn().click();	
		
	}
		
}

