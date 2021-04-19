package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	
public Configuration_Reader() throws Throwable {
	
File file  = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Adactin_Project\\src\\main\\java\\com\\adactin\\properties\\configuration.properties");
FileInputStream fis=new FileInputStream(file);
 p =new Properties();

//load
 p.load(fis);
 }
	
public  String getBrowser() {

	String browser = p.getProperty("browser"); 
	
	return browser;
}


public String getUrl() {

	String url = p.getProperty("url");
	return url;
}


public String getCredit_Num() {

	String creditnum = p.getProperty("Credit_number");
	return creditnum;
}

public String getCredit_Type() {

	String credittype = p.getProperty("credit_type");
	return credittype;
}

public String getCvv() {

	String cvv = p.getProperty("credit_cvv");
	return cvv;
}

public  String getExpiry_month() {

	String month = p.getProperty("expiry_month");
	return month;
}


public String getExpiry_Year() {
	String year = p.getProperty("expiry_year");
	return year;

}


}
