public class ConstructorChain{
	public ConstructorChain(){
		System.out.println("ConstructorChain");
	}
	public ConstructorChain(double rating){
		this();
		System.out.println("i know");
	}
	public ConstructorChain(String name){
		this(98.99f);
		System.out.println("learn java");
	}
	public ConstructorChain(float percentage){
		this(4.9);
		System.out.println("python");
	}
	public static void main(String[] args){
		ConstructorChain ref = new ConstructorChain("Kiran");
	}
}