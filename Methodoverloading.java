public class Methodoverloading{
	public static void main (String[] args){
		demo(95);
		demo(150);
		demo(31000);
		demo(123455);
		demo(75.98f);
		
		demo("Kiran");
		demo(70000,200);
	    demo(125,4,119);
		demo(15,6,9,40);
		demo("Kiran",'A',450,50,5);
		
		demo(600,'C');
		demo('A',600);
	    demo(5,"Kishan");
	    demo("Samarth",3);
	}
		
	public static void demo(byte number){
		System.out.println(number);
	}
	public static void demo(short number){
		System.out.println(number);
	}
	public static void demo(int number){
		System.out.println(number);
	}
	public static void demo(long number){
		System.out.println(number);
	}
	public static void demo(float percentage){
		System.out.println(percentage);
	}
	public static void demo(String name){
		System.out.println(name);
	}
	public static void demo(int car,int number){
		System.out.println(car);
		System.out.println(number);
	}
	public static void demo(int numbers,int cars,int tabletsInOneBox){
		System.out.println(numbers);
		System.out.println(cars);
		System.out.println(tabletsInOneBox);
	}
	public static void demo(int number,int factories,int apartment,int lakes){
		System.out.println(number);
		System.out.println(factories);
		System.out.println(apartment);
		System.out.println(lakes);
	}
	public static void demo(String name,char grade,int marks,int percentage,int subject){
		System.out.println(name);
		System.out.println(grade);
		System.out.println(marks);
		System.out.println(percentage);
		System.out.println(subject);
	}
	public static void demo(int number,char grade){
		System.out.println(number);
		System.out.println(grade);
	}
	public static void demo(char grade,int number){
	   System.out.println(grade);
	   System.out.println(number);
	}
	public static void demo(int ticketNumber,String name){
	   System.out.println(ticketNumber);
	   System.out.println(name);
	}
	public static void demo(String name,int serialnumber ){
		System.out.println(name);
		System.out.println(serialnumber);
	}
	
	   
	   
	   
	   
}