public class Forloop {
	public static void main(String[] args) {
		
		
		
		String[] str = {"Bangalore","Gadag","Mangalore","Tumkur","Chitradurga","Davangere","Hassan","Mysore","Ballary","Udupi"};
		byte[] byt = {12,3,45,78,14,53,76,15,11,19,};
		short[] shor = {129,450,390,290,550,789,145,678,889,990};
		int[] num = {1100,2456,3897,4098,5000,6678,7986,8123,9100,1000};
		long[] lon = {12343465,56789,9876557,3567754,465644,789765,9864345,100000,7568646,544556};
		float[] flo = {339.23f,337.23f,439.23f,449.23f,33.23f,73.98f,43.98f,80.98f,90.98f,65.98f};
		double[] dou = {6.8d,6.9d,9.8d,5.8d,1.8d,4.5d,4.6d,4.7d,4.9d,4.1d};
		char[] ch = {'A','B','C','D','E','F','G','H','I','J',};
        boolean[] bool = {true,false,true,false,true,false,true,false,true,false};

        for(int i=0; i<str.length; i++){
			System.out.println(str[i]);
		}		
		
		for(int i=0; i<byt.length; i++){
			System.out.println(byt[i]);
		}
		
		for(int i=0; i<shor.length; i++){
			System.out.println(shor[i]);
		}
		
		for(int i=0; i<num.length; i++){
			System.out.println(num[i]);
		}
		
		for(int i=0; i<lon.length; i++){
			System.out.println(lon[i]);
		}
		
		for(int i=0; i<flo.length; i++){
			System.out.println(flo[i]);
		}
		
		for(int i=0; i<dou.length; i++){
			System.out.println(dou[i]);
		}
		
		for(int i=0; i<ch.length; i++){
			System.out.println(ch[i]);
		}
		
		for(int i=0; i<bool.length; i++){
			System.out.println(bool[i]);
		}
		System.out.println();
		
	}
}