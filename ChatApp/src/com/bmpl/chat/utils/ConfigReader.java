package com.bmpl.chat.utils;
import java.util.ResourceBundle;
public class ConfigReader {
	ConfigReader(){}
		private static ResourceBundle br=ResourceBundle.getBundle("config");
		public static String getValue(String k) {
			return br.getString(k);
		}
	

}
