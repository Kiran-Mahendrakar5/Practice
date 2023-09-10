public class Test{
	public static void main (String[] args){
		for(int i=1; i<=5;i++){   //i=r
			System.out.print(i+"");
			for(int j=1; j<=5;j++){  //j=r
				if(i==3&&j==1){
					System.out.println("& ");
					
				}else{
					System.out.println("  ");
				}
			}
		}
	}
}