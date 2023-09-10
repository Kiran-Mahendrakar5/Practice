public class Statics{
	public static void main(String[] args){
     demo.a = 55;
     demo.b = 500;
     demo.c = 1000;
     demo.d = 1345656;
     demo.e = 75.68f;
    
 	 System.out.println(demo.a);
	 System.out.println(demo.b);
	 System.out.println(demo.c);
	 System.out.println(demo.d);
	 System.out.println(demo.e);
	 
	
	
	
	demo serial = new demo();
	
	 serial.f = 4.9;
     serial.g = 'A';
     serial.h = true;
	 serial.i = "Kiran";
	 serial.j = 4500;
	 
	 System.out.println(serial.f);
	 System.out.println(serial.g);
	 System.out.println(serial.h);
	 System.out.println(serial.i);
	 System.out.println(serial.j);
	 
	}
	public static class demo{
		public demo(){
			System.out.println("Exucuted");
		}
		static byte a;
		static short b;
		static int c;
		static long d;
		static float e;
	
		double f;
		char g;
		boolean h; 
		String i;
		int j;
		
	}
}