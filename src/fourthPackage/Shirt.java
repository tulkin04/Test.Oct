package fourthPackage;

import org.testng.annotations.Test;

public class Shirt {
	
	public static String color;
    public static char size;
	
	public static void putOn ( ) {
		System.out.println("Shirt is on!");	
		
	}
	@Test
	public static void takeOff() {
		System.out.println("Shirt is off!");
	}
	public static void setColor(String newColor) {
		color = newColor;
	}
	
	public static void setSize(char newSize) {
		size = newSize;
	}




}