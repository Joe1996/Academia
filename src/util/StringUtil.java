package util;

public class StringUtil {
	
	public static boolean isEmpty(String value) {
		if (value == null || value.isEmpty()) 
			return true;
		
		return false;
	}
	
	public static boolean isNotEmpty(String value) {
		if (value != null && !value.isEmpty())
			return true;
		
		return false;
	}

}
