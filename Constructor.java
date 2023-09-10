public class Constructor{
	public Constructor(){
		System.out.println("Constructor Chaining");
	}
	public Constructor(int number){
		this("Kiran");
		System.out.println("Constructor Number");
	}
	public Constructor(String name){
		this('A');
		System.out.println("Kiran");
	}
	public Constructor(char latter){
		this(true);
		System.out.println("Starting letter of kiran");
	}
	public Constructor(boolean trueorfalse){
		this();
		System.out.println("Deer has Four Legs");
	}
	public static void main(String[] args){
		Constructor num = new Constructor(1234);
	}
}
