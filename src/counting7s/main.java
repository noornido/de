package counting7s;

public class main {//done in 16 mins

	public static void main(String[] args) {
		int positiveInteger = -99;
		if(positiveInteger < 0) {
			System.out.println("Wrong input!");
			return;
		}
			
		int numberOfSevens = 0;
		while(positiveInteger != 0) {
			if(positiveInteger % 10 == 7) {
				numberOfSevens++;
			}
			positiveInteger /= 10;	
		}
		System.out.println("Number of 7's in this number is " + numberOfSevens);
	}

}
