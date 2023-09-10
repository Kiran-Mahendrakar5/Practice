public class ReturnTypeTest{
	public static void main(String[] args){
		
	 byte noStudents = givebyte();
	 System.out.println(noStudents);
	 short noLakhs = giveshort();
	 System.out.println(noLakhs);
	 int bikeNumbers = giveint();
	 System.out.println(bikeNumbers);
	 long bikeInBtm = givelong();
	 System.out.println(bikeInBtm);
	 float sslcpercentage = givefloat();
	 System.out.println(sslcpercentage);
	 boolean deerHasFourLegs = giveboolean();
	 System.out.println(deerHasFourLegs);
	 
	}
	public static byte givebyte(){
		return 55;
	}
	public static short giveshort(){
		return 1000;
	}
	public static int giveint(){
		return 5824;
	}
	public static long givelong(){
		return 12345;
	}
	public static float givefloat(){
		return 10.00f;
	}
	public static boolean giveboolean(){
		return true;
	}
	 
}