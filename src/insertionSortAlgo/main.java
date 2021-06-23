package insertionSortAlgo;

public class main {//in 19 mins 
	
	static void display(int [] array)
	{
		for(int i = 0; i< array.length; i++)
		{
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		int[] array =  {48, 130, 8, 730, 99, 0, 999, -2, 8};
		display(array);
		System.out.println("---------------------------");
		int minIndex;
		//int min;
		//int k;
		for(int i = 0; i < array.length - 1; i++)
		{
			minIndex = i;
			//k = i;
			for(int j = i + 1; j < array.length; j++)
			{
				if(array[j] < array[minIndex])
				{
					minIndex = j;
					//k = j;
				}
		       
			}
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
		
          display(array);
	}

}
