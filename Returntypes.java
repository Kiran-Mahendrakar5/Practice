public class Returntypes{
	public static void main(String[] args){
		byte noStudents = givebyte();
		System.out.println(noStudents);
		short noSchool = giveshort();
		System.out.println(noSchool);
		int noLibrary = giveint();
		System.out.println(noLibrary);
		long priceOfCar = givelong();
		System.out.println(priceOfCar);
		float percentage = givefloat();
		System.out.println(percentage);
		double rating = givedouble();
		System.out.println(rating);
		char alphabetes = givechar();
		System.out.println(alphabetes);
		boolean weEatLunchInNight = giveboolean();
		System.out.println(weEatLunchInNight);
		String animal = givestring();
		System.out.println(animal);
		
	}
	public static byte givebyte(){
		return 57;
	}
	public static short giveshort(){
		return 221;
	}
	public static int giveint(){
		return 52111;
	}
	public static long givelong(){
		return 5555551;
	}
	public static float givefloat(){
		return 65.5f;
	}
	public static double givedouble(){
		return 4.5;
	}
	public static char givechar(){
		return 'A';
	}
	public static boolean giveboolean(){
		return false;
	}
	public static String givestring(){
		return "Elephant";
	}
}