package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin_pom.Book_A_Hotel;
import com.adactin_pom.Booking_Confirmation;
import com.adactin_pom.Check_Button;
import com.adactin_pom.Login_Page;
import com.adactin_pom.Logout;
import com.adactin_pom.Search_Hotel;

public class Page_Object_Manager {
	
	public WebDriver driver;
	private Login_Page login;
	private Search_Hotel search;
	private Check_Button check;
	private Book_A_Hotel book;
	private Booking_Confirmation confirm;
	private Logout logout;
	
	 
	
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public Login_Page getInstanceLogin() {
		login =new Login_Page(driver) ;
		
       return login;
	}
	
	public Search_Hotel getInstancesearch() {

		search=new Search_Hotel(driver);
		return search;
	}
	
	
	public Check_Button getInstanceCheck() {
		check=new Check_Button(driver);
				return check;
	}
	
	
	
	public  Book_A_Hotel getInstancebook() {
book=new Book_A_Hotel(driver);
return book;
	}
	
	
	public Booking_Confirmation getInstanceconfirm() {
confirm=new Booking_Confirmation(driver);

return confirm;
	}
	
	public Logout getInstanceLogout() {
logout= new Logout(driver);
return logout;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}




