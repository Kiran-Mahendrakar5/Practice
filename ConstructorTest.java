public class ConstructorTest{
	public ConstructorTest(){
		System.out.println("Constructor Chaining");
	}
	public ConstructorTest(int number){
		this("Kiran");
		System.out.println("Constructor Number");
	}
	public ConstructorTest(String name){
		this('A');
		System.out.println("Kiran");
	}
	public ConstructorTest(char latter){
		this(true);
		System.out.println("Starting letter of kiran");
	}
	public ConstructorTest(boolean trueorfalse){
		this();
		System.out.println("Deer has Four Legs");
	}
	public static void main(String[] args){
		ConstructorTest num = new ConstructorTest(1234);
	}
}
