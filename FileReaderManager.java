package com.adactin.helper;

public class FileReaderManager {

public static FileReaderManager getIstance() {
	FileReaderManager helper= new  FileReaderManager();
	
		return helper;

	}
	
	
	public Configuration_Reader getIstanceCR() throws Throwable {

		Configuration_Reader reader=new Configuration_Reader();
		return reader;
	}
	

}
