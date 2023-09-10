public class Parameterises{
	static int value;
	String name;
	
	public Parameterises(int value,String name){
		this.value=value;
		this.name=name;
	}
	public static void main(String [] args){
	Parameterises ref =new Parameterises(21,"kiran");
	System.out.println(value);//static 
	System.out.println(ref.name);
}

}