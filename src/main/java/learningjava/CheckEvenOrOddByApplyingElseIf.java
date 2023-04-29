package learningjava;

public class CheckEvenOrOddByApplyingElseIf {

	public static void main(String[] args) {
		int a = 23;
		int b = 24;
		
		if(a%2==0 && b%2!=0) {
			System.out.println("a is the even number");
		}else if(b%2==0 && a%2!=0) {
			System.out.println("b is the even number");
			
		}

	}

}
