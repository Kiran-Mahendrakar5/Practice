public class TestCase{
	public static void main(String[] args){
		sell("selling my bike");
		travell("love travelling");
		ride("u have safe ride");
	}
	public static String sell(String name){
		boolean ref = name.endsWith("bike");
		System.out.println(ref);
		return "true";
	}
	public static String travell(String naam){
		String hesaru = naam.concat("....kiran");
		System.out.println(hesaru);
		return "true";
	}
	public static String ride(String himalaya){
		String ref = himalaya.replace('u','i');
		System.out.println(ref);
		return "true";
	}
}
