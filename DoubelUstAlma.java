package javaTemelleri;

public class doubleUs {

	

	    public static double power(double say1, double say2) {
	        return Math.exp(say2 * Math.log(say1));
	    }

	
	public static void main(String[] args) {
		 System.out.println(power(3.5, 5.6)); 

	}

}