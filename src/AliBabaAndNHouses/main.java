package AliBabaAndNHouses;

import java.util.ArrayList;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		int N = 6;
		int[] values = {9, 2, 1, 5, 1, 9};
		ArrayList<Integer> copy = new ArrayList<>();
		for(var value : values) {
			copy.add(value);
		}
		Arrays.sort(values);
		
        int sum = 0;
        ArrayList<Integer> houseIndices = new ArrayList<>();
		for(int i = N; i >= 1; i--) {
			int maxValue = values[i - 1];
	        int maxValueIndex = copy.indexOf(maxValue) + 1;
	        boolean avoidHouse = (houseIndices.contains(maxValueIndex - 1) || houseIndices.contains(maxValueIndex + 1));
			if(!avoidHouse) {
				houseIndices.add(maxValueIndex);
				sum += maxValue;
				copy.set(maxValueIndex - 1, 0);
			}
			
		}
		
		System.out.println(sum);
		houseIndices.sort(null);
		System.out.println(houseIndices);
		
		
		

	}

}
