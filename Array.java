public class Array{
	public static void main (String[] args){
		byte[] pageNumber= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(pageNumber[5]);
		short[] priceOfKeyboards= {250,350,390,400,410,500,510,600,610,450,};
		System.out.println(priceOfKeyboards[6]);
		int[] bikeNumber= {5824,2565,8756,9867,4554,7898,9087,1243,8712,5532};
        System.out.println(bikeNumber[3]);
        long[] priceOfLaptop= {32000,36000,39000,38500,40000,42000,43000,50000,52000,55000};
        System.out.println(priceOfLaptop[1]);
        float[] sugarsInBiscuit= {7.5f,7.3f,7.2f,8.1f,8.3f,6.9f,6.8f,6.7f,5.9f,7.2f};
        System.out.println(sugarsInBiscuit[4]);
        double[] ratings= {2.5,2.6,2.7,2.8,3.1,3.2,4.3,4.4,4.5,4.9};
        System.out.println(ratings[9]);
        char[] alphabets= {'A','B','C','D','E','F','G','H','I','J'};
        System.out.println(alphabets[6]);
        boolean[] trueOrFalse= {true,false,true,false,true,false,true,false,true,false};
        System.out.println(trueOrFalse[5]);
        String[] bikeName= {"Ktm","Pulsar","Hero","Tvs","Royalenfield","Activa"};
        System.out.println(bikeName[3]);
		String[] newKeyword= new String[10];
		System.out.println(newKeyword[5]);
		int sizeOfInt[]= new int[10];
		System.out.println(sizeOfInt[6]);
	}
}