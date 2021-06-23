import java.util.Scanner;

public class main {

	static int stringCompare(String s1, String s2)
	{
		int diff = 0;
		for(int i = 0; i <= 4; i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
			{
				diff++;
			}		
		}
		return diff;
	}
	
	static void display(int [] array)
	{
		for(int i = 0; i<= array.length - 1; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	static int min(int [] array) {//returns min of array- done in 6mins:40s
		
		int min = array[0];
		int i = 0;
		while(i != array.length - 1)
		{
			if(array[i + 1] < min)
			{
				min = array[i + 1];
			}	
			i++;
		}
		return min;
	}
	
	static void sort(int [] array)
	{
	   int min;
	   int [] tempArray = array.clone();
	   int temp;
	   int minIndex = 0;
	   
		   for(int j = 0; j <= tempArray.length - 1; j++)
		   {
			min = min(tempArray);
			while(minIndex <= tempArray.length - 1)
			{
				if(tempArray[minIndex] == min)
				{
					break;
				}
				minIndex++;
			}
			//array[j] = array[minIndex];//kont 3ml bug deh
			array[j] = tempArray[minIndex];
			tempArray[minIndex] = Integer.MAX_VALUE;
			minIndex = 0;
			
		   }
	}
	static int circIndex = 0;
	static void addToCircArray(int [] array, int number)// done in 10 mins
	{
		array[circIndex] = number;
		circIndex = (circIndex + 1) % array.length;	
	}
	
	static void test() {
		int x = 4;
		System.out.println(x);
	}
	public static void main(String[] args) {
		

		    int [] m = {48, 130, 8, 730, 750};
		   // display(m);
		    //System.out.println("-----------------------");
		    //sort(m);
		    //display(m);
		    //String s1 = "otarp";
		    //String s2 = "smlrt";
		    //System.out.println( stringCompare(s1, s2));
		    //int [] circArray = new int[5];
		    //addToCircArray(circArray, 1);
		    //addToCircArray(circArray, 2);
		    //display(circArray);
		    test();
		    


		    



		    
		    
		    
	}

}
