package com.bmpl.chat.utils;
import java.security.*;
public interface Encryption {
	public static String passwordEncrypt(String plainPassword) throws NoSuchAlgorithmException{
		String encryptPassword=null;
		MessageDigest messageDigest=MessageDigest.getInstance("MD5");
		messageDigest.update(plainPassword.getBytes());
		byte [] encrypt=messageDigest.digest();
		StringBuffer sb=new StringBuffer();
		for(byte b:encrypt) {
			sb.append(b);
		}
		encryptPassword=sb.toString();
		return encryptPassword;
	}

}
