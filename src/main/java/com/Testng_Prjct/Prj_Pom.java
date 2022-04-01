package com.Testng_Prjct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prj_Pom {
	
	public static WebDriver driver;
	
	//Login
		@FindBy(xpath="//a[@class='login']") private WebElement lgn;
		@FindBy(id="email") private WebElement email;
		@FindBy(id="passwd") private WebElement psswd;
	    @FindBy(id="SubmitLogin") private WebElement sign_in;
	  
		public WebElement getLgn() {
			return lgn;
		}
		public WebElement getEmail() {
			return email;
		}
		public WebElement getPsswd() {
			return psswd;
		}
	  public WebElement getSign_in() {
			return sign_in;
		}
	
	//Searchbar_fnct
	@FindBy(id="search_query_top") private WebElement searchbar;

	public WebElement getSearchbar() {
		return searchbar;
	}
	
	
	
	//Searchbar_fnct1
	@FindBy(xpath="//a[@class='home']") private WebElement hme1;
	@FindBy(id="search_query_top") private WebElement searchbar1;
	@FindBy(name="submit_search") private WebElement  searchbutton;
	
	public WebElement getSearchbar1() {
		return searchbar1;
	}
	public WebElement getSearchbutton() {
		return searchbutton;
	}
	public WebElement getHme1() {
		return hme1;
	}
  //Highest_first
	@FindBy(id="selectProductSort") private WebElement highfst;
	
   
  public WebElement getHighfst() {
		return highfst;
	}

//Addtocart
  @FindBy(xpath="(//div[@class='product-container'])[1]") private WebElement slct;
  @FindBy(id="wishlist_button") private WebElement wshlst;
  @FindBy(xpath="//a[@class='logout']") private WebElement wolgn;
	
  public WebElement getSlct() {
		return slct;
	}	
  public WebElement getWshlst() {
		return wshlst;
	}
  public WebElement getWolgn() {
		return wolgn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Prj_Pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
