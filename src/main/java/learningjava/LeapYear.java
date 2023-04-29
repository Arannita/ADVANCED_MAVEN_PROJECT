package learningjava;

public class LeapYear {

	public static void main(String[] args) {
		
		int year = 1363;
		
		if(year%4 ==0 && year%100 !=0 || year%400 ==0) {
			System.out.println("year is the leap year");
		}else {
			System.out.println("Hafiz is a madarchod batpar");
		}

	}

}
