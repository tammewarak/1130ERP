package basicPrograms;

public class ToPrintOddNumbers {

	public static void main(String[] args) {
		// Print Odd numbers 1 - 100
		
		int i = 1;
		while (i<=100) {
			
			if (i%2 != 0) {
				System.out.println(i);
			}
			
			i++;
			
		}

	}

}
