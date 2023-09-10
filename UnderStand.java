public class UnderStand{
	public static void main(String[] args){
		call("calling to u");
		sell("selling bike");
		run("running");
		
	}
	public static String call (String name){
		boolean ref = name.endsWith("u");
		System.out.println(ref);
		return "true";
	}
	public static String sell(String ktm){
	String royal = ktm.concat(".....kiran");
	System.out.println(royal);
	return"true";
	}
	public static String run(String pm){
		String haot = pm.replace('r','u');
		System.out.println(haot);
		return"true";
	}
	
}

