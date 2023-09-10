public class ParametersTest{
	public static void main(String[] args){
		demo('K');
		demo(true);
		demo(1200);
		demo(126,50000);
		demo(false,'S');
		demo(75.68,1000);
			
	}
	public static void demo(char alphabets){
		System.out.println(alphabets);
	}
	public static void demo(boolean trueorfalse){
		System.out.println(trueorfalse);
	}
	public static void demo(int number){
		System.out.println(number);
	}
	public static void demo(int students,int lakhs){
		System.out.println(students);
		System.out.println(lakhs);
	}
	public static void demo(boolean torf,char letter){
		System.out.println(torf);
		System.out.println(letter);
	}
	public static void demo(double percentage,int tutions){
		System.out.println(percentage);
		System.out.println(tutions);
	}
	
}