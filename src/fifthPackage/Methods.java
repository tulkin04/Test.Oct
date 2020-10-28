package fifthPackage;

public class Methods {

	public static void main(String[] args) {
	
	int a = 15;
	int b = 25;
	int c = 35;

	calclargestNumber(a, b, c);
	
	int a2 = 15;
	int b2 = 25;
	int c2 = 45;
	
	calclargestNumber(a2, b2, c2);
	
	int a3 = 15;
	int b3 = 25;
	int c3 = 55;
	
	calclargestNumber(a3, b3, c3);
	
	
	int a4 = 15;
	int b4 = 25;
	int c4 = 65;
	
	calclargestNumber(a4, b4, c4);
	
	}
	public static void calclargestNumber( int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(" The greatest number is ");
		}else if (b > a && b > c) {
			System.out.println(" The greatest number is ");
		}else  {
			System.out.println(" The greatest number is " + c);
		} 

		

		}	
}
