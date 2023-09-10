public class Weeks{
	NameOfWeek week;
	byte noOfWeeks;
	char firstLetterOfWeek;
	
	
	public Weeks(NameOfWeek week,byte noOfWeeks,char firstLetterOfWeek) {
		this.week=week;
		this.noOfWeeks=noOfWeeks;
		this.firstLetterOfWeek=firstLetterOfWeek;
	
	}
	
	public static void main(String[] args){
		
		Weeks days = new Weeks(NameOfWeek.MONDAY,(byte)7,'w');
		
		System.out.println(days.week.name);
		System.out.println(days.noOfWeeks);
		System.out.println(days.firstLetterOfWeek);
		
		
	}
}
enum NameOfWeek{
	MONDAY("mon"),TUESDAY("tue"),WEDNESDAY("wed"),THURSDAY("thur"),FRIDAY("fri"),SATURDAY("sat");
	 String name;
	
	NameOfWeek(String name){
		this.name = name;
	}
	
}