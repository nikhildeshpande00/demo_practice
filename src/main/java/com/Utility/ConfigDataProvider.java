package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	public ConfigDataProvider() throws Exception {
	String pathconfig="C:\\Users\\ADMIN\\eclipse-workspace\\DEMO\\Config\\config.properties";
	FileInputStream file=new FileInputStream(pathconfig); //class
	
	pro=new Properties();//properties class is used for load config file
	pro.load(file);
}
	public String getBase_URL_QA1() {
	return pro.getProperty("Base_URL_QA1");
	
	
}
	public String getBase_URL_QA2() {
	return pro.getProperty("Base_URL_QA1()");
}
}
