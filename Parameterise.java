public class Parameterise{
	static int valve;
	 String name;
	public Parameterise(int valve,String name){
		this.valve=valve;
		this.name=name;
	}
	public static void main(String[] args){
		Parameterise ref = new Parameterise(21,"Kiran");
		System.out.println(valve);//static 
		System.out.println(ref.name);//non static
	}
}