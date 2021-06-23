package firstRecurringCharacterProblem;

public class main {

	static char printFirstRecChar(String s) {
		
		char firstRecChar;
        for(int i = 1; i < s.length(); i++)
        {
        	for(int j = i - 1; /*j <= 0 is wrong*/ j != -1; j--)
        	{
        		if(s.charAt(i) == s.charAt(j))
        		{
        			firstRecChar = s.charAt(i);
        		    return firstRecChar;
        		}
        	}
        }
		System.out.print("No recurring character in this string");
        return '.';
        
	}
	
	public static void main(String[] args) {

//		String s = "dbca";
//		char c = printFirstRecChar(s);
//		System.out.println(c);
	
	}

}
