package com.app.sunbeam.Configurations;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader implements ConfigReader {
	public static FileInputStream file;
	public static Properties prop;
	public PropertyReader() {
		try {
			String filePath = System.getProperty("user.dir")+"\\src\\main\\java\\com\\app\\sunbeam\\Resources\\config.properties";
			file = new FileInputStream(new File(filePath));
			prop = new Properties();
			prop.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getUserName() {
		String getUName = prop.getProperty("uname");
		return getUName;
	}

	@Override
	public String getUserPassword() {
		String getUPass = prop.getProperty("upassword");
		return getUPass;
	}

	@Override
	public String getUrl() {
		String getUrl = prop.getProperty("url");
		return getUrl;
	}
	
	@Override
	public String getBrowserName() {
		String getBName = prop.getProperty("bname");
		return getBName;
	}
	
}
