public class MyCode{
	public static void main(String [] args){
		call("calling to u");
		bike("bike sold to u");
		result("fail");
		tv("watching tv");
		
	}
	public static String call (String name){
		boolean ref = name.endsWith("u");
		System.out.println(ref);
		return "true";
	}
	public static String bike(String naam){
		String refe = naam.concat(".....kiran");
		System.out.println(refe);
		return "true";
	}
	public static String result(String naa){
		String refer = naa.replace('f','p');
		System.out.println(refer);
		return "true";
	}
	
	
}
	
			