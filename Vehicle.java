public class Vehicle{
	public static void main(String[] args){
		 call("calling to u");
		 bye("buying bike");
		 sell("selling");
		 run("running");
		 
	}
	public static String call(String display){
		boolean ref = display.endsWith("u");
		System.out.println(ref);
		return "true";
	}
	public static String bye(String name){
	boolean refe = name.endsWith("bike");
	System.out.println(refe);
	return "true";
	
	}
	public static String sell(String bike){
		String refer = bike.concat("    kiran");
		System.out.println(refer);
		return "true";
		
	}
	public static String run(String pm){
		String hoat = pm.replace('r' , 'u');
		System.out.println(hoat);
		return "true";
	}
}