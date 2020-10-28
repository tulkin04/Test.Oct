package fourthPackage;

public class LogicalNot {

	public static void main(String[] args) {
	
		int x = -1;
		
		boolean isPositive = x > 0 ? true : false;
		String posOrneg = x > 0 ? "Positive" : "Negative";
		System.out.println(isPositive);
		System.out.println(posOrneg);
	
	if (x>=0) {
		isPositive = true;
		posOrneg = "Positive";
	}else {
		isPositive = false;
		posOrneg = "Negative";
	}
	int age =19;
	boolean isTeenager =age >=13 && age <=19 ? true : false;
	System.out.println(isTeenager);
	
	//double money = 7.500;
	//boolean isRich = money >= 8.500 ? true : false ;
	//System.out.println(isRich);
	
	
	
	}
	
	
	
	
	
	
	
	

}
