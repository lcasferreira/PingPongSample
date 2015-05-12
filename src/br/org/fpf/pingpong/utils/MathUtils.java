package br.org.fpf.pingpong.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class MathUtils {

	public static Double trucate(Double value, int places) {
	    if (places < 0 || value == null) {
	    	throw new IllegalArgumentException();
	    }
	    
	    String strNumber = value.toString();
	    String fracDigits = strNumber.substring(strNumber.lastIndexOf(".")); 
	    if(fracDigits.toCharArray().length <= 3) {
	    	return value;
	    }

	    long factor = (long) Math.pow(10, places);
	    
	    Long intPart = value.longValue();
	    intPart *= factor;
	    value *= factor;
	    
	    value -= intPart;  
	    
	    Long fracPart = value.longValue();
	    
	    return (intPart.doubleValue() + fracPart.doubleValue()) / factor;
	}
	
	public static Double round(Double value, int places) {
	    if (places < 0) {
	    	throw new IllegalArgumentException();
	    }

	    DecimalFormat formatter = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US));
	    
	    Double result = Double.valueOf(formatter.format(value));
	    
	    return result;
	}
}
