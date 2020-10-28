package mysecondproject;

public class Logical_operators {

	public static void main(String[] args) {
		//Logical Operators 
		//(&&) Logical and			[T && T=> True]	[T && F=> False]
		//(||) Logical or			[T || T=> True] [T || F=> False]
		//(!) Logical not			[!T => False ] [!F => True]
//	 int x = 11;
//		if(x > 0 && x < 11) {
//		System.out.println("number is within the range");	
			
//		}else {
//			System.out.println("number is outside range" );
//		}
		
	int score = 65;
	if (score >= 86 && score < 100) {	
		System.out.println("your score is A");
	}else if (score >= 72 && score < 86) {
		System.out.println("your score is B");
	}else if (score >= 65 && score < 72 ) {
		System.out.println("your score is C");
	}else if (score >=0 && score < 65 ) {
		System.out.println("your score is D");
	}else {
		System.out.println("wrong input");
	} 
	
	
	}
	}
