public class IfElseArrayLoop{
	public static void main(String[] args){
		
	int[] templeInTumkur = {1234,54321,34521,11111,78912};
	short[] apartmnets = {123,555,152,123,656};
	long homesInBangalore = 1456656;
	boolean humansNeedWater = true;
	float percentage = 75.89f;
	char alphabets = 'A';
	String animal = "COW";
	
	
	for (int i=0; i<templeInTumkur.length;i++){
		System.out.println(templeInTumkur[i]);
	}
        if(homesInBangalore!=1456656){
		System.out.println("its true");
	}	
	    else{
	    System.out.println("its false");
		}
		if(alphabets!='A'){
		System.out.println("its true");
    }
	    else{
		System.out.println("its false");
		}
		if(homesInBangalore==1456656){
		System.out.println("its true");
	}
	    else{
		System.out.println("its false");
		}
		if(animal!="COW"){
		System.out.println("its true");
    }
	    else{
		System.out.println("its false");
		}
		if(2-1==75.89f){
		System.out.println("its true");
	}
	    else{
		System.out.println("its false");
		}
		
	}
}