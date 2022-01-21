package basicPrograms;

public class FindTheLargest {

	public static void main(String[] args) {
		// Write a program to find out largest number out of given two values
		
		int a = 30;
		int b = 30;
		
		if (a > b) {
			System.out.println("A is the largest number..: " + a);
		} 
		else if (b > a){
			System.out.println("B is the largest number..: " + b);
		}
		else {
			System.out.println("Both A and B are equal..: " + b);
		}

	}

}
