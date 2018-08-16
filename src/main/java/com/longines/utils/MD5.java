package com.longines.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5
{
	
	public static String tomd5(String str)
	{
		String re=null;
		
		byte mi[];
		try
		{
			byte [] tem=str.getBytes();
			MessageDigest md5=MessageDigest.getInstance("md5");
			md5.reset();
			md5.update(tem);
			mi = md5.digest();
			StringBuilder sb=new StringBuilder();
		    for(byte t:mi)
		    {
		    	sb.append(Integer.toHexString(t&0xFF));
		    }
		    re=sb.toString();
		} catch (NoSuchAlgorithmException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return re;
	}



}
