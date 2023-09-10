public class ConstructorChaining{
	public ConstructorChaining(){
		System.out.println("its ConstructorChaining");
	}
	public ConstructorChaining(double rating){
		this();
		System.out.println("btm rating");
	}
	public ConstructorChaining(String name){
		this(4.9);
		System.out.println("my name");
	}
	public static void main (String [] args){
	ConstructorChaining ref = new ConstructorChaining("kiran");
	
}

}