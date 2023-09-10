public class VariablesChain{
	byte noOfStudents = 80;
	short noOfApartments = 1000;
	int toyInShop = 2200;
	long noTemples = 125567;
	float percentage = 75.65f;
	double xworkzRating = 4.9;
	char alphabets = 'A';
	boolean cowHasFourLegs = true;
	
	public VariablesChain(int toyInShop){
		System.out.println(this.toyInShop);
		System.out.println(toyInShop);
	}
	public VariablesChain(short noOfApartments){
		System.out.println(this.noOfApartments);
		System.out.println(noOfApartments);
	}
	public VariablesChain(byte noOfStudents){
		System.out.println(this.noOfStudents);
		System.out.println(noOfStudents);
	}
	public VariablesChain(long noTemples){
		System.out.println(this.noTemples);
		System.out.println(noTemples);
	}
	public VariablesChain(float percentage){
		System.out.println(this.percentage);
		System.out.println(percentage);
	}
	public VariablesChain(double xworkzRating){
		System.out.println(this.xworkzRating);
		System.out.println(xworkzRating);
	}
	public VariablesChain(char alphabets){
		System.out.println(this.alphabets);
		System.out.println(alphabets);
	}
	public VariablesChain(boolean cowHasFourLegs){
		System.out.println(this.cowHasFourLegs);
		System.out.println(cowHasFourLegs);
	}
	public static void main(String[] args){
		demo('A','B');
		demo("Kiran",75.68f);
		demo(20,60);
		demo(250,250);
		demo(55,true);
		
		VariablesChain cars = new VariablesChain(10000);
		
	}
	public static void demo(char alphabets,char nowel){
		System.out.println(alphabets);
	}
	public static void demo(String name,float percentage){
		System.out.println(name);
	}
	public static void demo(int temples,short apartments){
		System.out.println(temples);
	}
	public static void demo(int students,int toys){
		System.out.println(students);
	}
	public static void demo(int homes,boolean cowHasFourLegs){
		System.out.println(cowHasFourLegs);
	}
	
	
	
	
	
}