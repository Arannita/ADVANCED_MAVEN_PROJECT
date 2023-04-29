package learningjava;

public class Greatest {

	public static void main(String[] args) {
		
		int a =10;
		int b = 20;
		int c =5;
		
		if (a>b && a>c){
			System.out.println("a is the greatest :" + a);
		}else if (b>a && b>c) {
			System.out.println("b is the greatest :" + b);
		}else if (c>a && c>a) {
	System.out.println("c is the greatest :" + c);
	
		}else {
			System.out.println("nothing is the greatest");
		}
			
	}
}
