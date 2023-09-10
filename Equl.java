public class Equl{
	public static void main(String [] args){
		tv("watching tv");
	}
	public static String tv(String name){
		String demo = "watching tv";
		boolean ref = name.equals(demo);
		System.out.println(ref);
		return "true";
	}
}