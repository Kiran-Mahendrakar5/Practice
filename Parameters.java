public class Parameters{
	public static void main(String[] args){
		num(55);
		rent(500,"owner");
		car(5,"kiran",250000);
		college(50000,"Reva",4.5,'r');
	}
	public static byte num(int number){
		System.out.println(number);
		return 15;
	}
	public static int rent(int money ,String name){
		System.out.println("giving rent to");
		System.out.println(name);
		System.out.println(money);
		return 100;
	}
	public static short car(int number,String name,long price){
	    System.out.println("sold car to");
	    System.out.println(name);
	    System.out.println(number);
	    System.out.println(price);
	    return 500;
	}
	public static String college(long college,String name,double rating,char alphabet){
		 System.out.println("I joined ncc in college");
		 System.out.println(name);
		 System.out.println(college);
		 System.out.println(rating);
		 System.out.println(alphabet);
		 return "Kishan";
	}
	
}