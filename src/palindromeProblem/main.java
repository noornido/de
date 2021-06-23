package palindromeProblem;

public class main {
	
	public static boolean isPalindrome(String word) {
		
		for(int i = 0; i <= word.length() / 2; i++) {
			
			if(word.charAt(i) != word.charAt((word.length() - 1) - i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		String word = "skpks";
		System.out.println(isPalindrome(word));

	}

}
