package com.jrs.main;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.vaadin.ui.ComboBox;

public class Utils {
	
	public static String getSHACode(String password) {
    	try {
			byte[] bytesOfPassword = null;
			MessageDigest md = null;
			bytesOfPassword = password.getBytes("UTF-8");
			md = MessageDigest.getInstance("SHA");
			byte[] digest = md.digest(bytesOfPassword);
			BigInteger bigInt = new BigInteger(1,digest);
			String hashtext = bigInt.toString(16);
			return hashtext;
		} catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e2) {
			e2.printStackTrace();
		}
		return "";
	}

	public static String getStringValue(String obj2str) {
		return getStringValue(obj2str, false);
	}

	
	public static String getStringValue(Object obj2str, boolean isNullAllowed) {
		if (obj2str == null) {
			if (isNullAllowed) {
				return null;
			} else {
				return "";
			}
		} else {
			return obj2str.toString();
		}
	}
	
	
	public static void preSelect(ComboBox cmb) {
		if (cmb.getContainerDataSource().size() < 2) {
			for (Object usId: cmb.getContainerDataSource().getItemIds()) {
				cmb.select(usId);
				break;
			}
		}
	}

	public static String convertInteger2String(Integer val, boolean isNullAllowed) {
		if (val == null) {
			if (isNullAllowed) {
				return null;
			} else {
				return "";
			}
		} else {
			return val.toString();
		}
	}



	
}
