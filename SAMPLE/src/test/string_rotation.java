package test;

public class string_rotation {
	public static void main(String[] args) {
		String patter = "vishist";
		String test1 = "vishist";
		String test2 = "svhiits";
		String test3 = null;
		if (isRotation(patter,test1))	
			System.out.println("the test1 is the rotation of the pattern"); 
		else 
			System.out.println("the test1 is not the rotation of the pattern");
		if (isRotation(patter,test2))	
			System.out.println("the test2 is the rotation of the pattern"); 
		else 
			System.out.println("the test2 is not the rotation of the pattern");
		if (isRotation(patter,test3))	
			System.out.println("the test3 is the rotation of the pattern"); 
		else 
			System.out.println("the test3 is not the rotation of the pattern");
	}
	public static boolean isSubString(String patterStr,String test){
		if(patterStr == null || test == null)	
			return false;
		if((patterStr.indexOf(test)) > 0)	
			return true;
		else 
			return false;
			
	}
	public static boolean isRotation(String patterStr,String test){
		if(patterStr == null || test == null)	
			return false;
		if(patterStr.length() != test.length())	
			return false;
		
		if(isSubString(patterStr+patterStr, test))	
			return true;
		else 	
			return false;
	}
}


