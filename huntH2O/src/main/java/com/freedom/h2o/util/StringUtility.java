/**
 *  Copyright BDP International, Inc.
 */
package com.freedom.h2o.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;


/**
 * Class: StringUtility
 *
 * Description:
 * Created on Aug 28, 2008
 *
 * @author Adam Stokar
 * @version
 */
public class StringUtility
{
    private static String goodChars =
        " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789\n!@#$%^&*()_+-=<>?:\"{}|,./;'[]\\`~'";
    private static String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static String fileChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-";

    public static boolean checkEmail(String email) {
    	
        if (email.indexOf(" ") > -1)
        {
            return false;
        }

        String filter =
            "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.(?:[a-z]{2}|com|org|net|gov|mil|biz|info|mobi|name|aero|jobs|museum)$";

        if (! email.toLowerCase().matches(filter))
        {
            return false;
        } else
        {
            return true;
        }
    }
    
    public static String getWebString(String input) {
    	String encodedStr = "";
    	
    	if(input != null) {
    		encodedStr = input.trim();
    		encodedStr = encodedStr.replaceAll("\'", "\\\\&#39;");
    		encodedStr = encodedStr.replaceAll("\"", "&quot;");
    		encodedStr = encodedStr.replaceAll("<", "&lt;");
    		encodedStr = encodedStr.replaceAll(">", "&gt;");
    	}    	
    	
    	return encodedStr;
    }

    public static String replaceBadFileChars(String s) {
    	String result = "";
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (fileChars.indexOf(s.charAt(i)) >= 0) {
    			result += s.charAt(i);
    		} else {
    			result += "-";
    		}
    	}
    	
    	return result;
    }
    
    public static String stripBadChars(String s)
    {
        String result = "";

        for (int i = 0; i < s.length(); i++)
        {
            if (goodChars.indexOf(s.charAt(i)) >= 0)
            {
                result += s.charAt(i);
            }
        }

        return result;
    }

    public static String getAlphanumeric(String s)
    {
        String result = "";

        for (int i = 0; i < s.length(); i++)
        {
            if (alphaNumeric.indexOf(s.charAt(i)) >= 0)
            {
                result += s.charAt(i);
            }
        }

        return result;
    }

    public static Integer getInt(String value)
    {
        Integer num = null;

        try
        {
            num = Integer.parseInt(value);
        } catch (Exception e)
        {
        }

        return num;
    }

    public static Double getDouble(String value)
    {
        Double num = null;

        try
        {
            num = Double.parseDouble(value);
        } catch (Exception e)
        {
        }

        return num;
    }

    public static Date getDate(String value) {
        DateFormat dFormat = new SimpleDateFormat("d-MMM-yyyy");
        Date d = null;

        try {
            d = dFormat.parse(value);
        } catch (Exception e) {
            System.out.println(e.getMessage() + value);
        }

        return d;
    }

    public static Date getDateTime(String value)
    {
        DateFormat tFormat = new SimpleDateFormat("d-MMM-yyyy hh:mm a");
        Date d = null;

        try
        {
            d = tFormat.parse(value);
        } catch (ParseException e)
        {
            System.out.println(e.getMessage());
        }

        return d;
    }

    public static boolean compareTo(String s1, String s2) {
        if ((s1 == null) && (s2 != null)) {
            return false;
        }

        if ((s1 != null) && (s2 == null)) {
            return false;
        }

        if ((s1 == null) && (s2 == null)) {
            return true;
        }

        return s1.equals(s2);
    }
    
    public static String capitalize(String str){
    	String first = str.substring(0,1).toUpperCase();
    	return str.replaceFirst("[a-z]", first);
    }
    
    public static void main(String[] args){
    
    }
}
