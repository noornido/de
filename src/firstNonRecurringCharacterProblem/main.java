package firstNonRecurringCharacterProblem;

import java.util.HashMap;
import java.util.Map;

public class main {//35

	public static void main(String[] args) {
//		String s = "pk zkaae o nenz LpOo";
//		int j;
//		for(int i = 0; i <= s.length() - 1; i++){
//			for(j = (i + 1) % s.length(); j != i ; j = (j + 1) % s.length()){
//				if(s.charAt(i) == s.charAt(j)){
//					break;
//				}
//			}
//			if(j == i){
//				System.out.println(s.charAt(i));
//				return;
//		}
//		}
		var s = "Opk zkaae o nenz pOZo";
		Map<Character, Integer> map = new HashMap<>();
		var charArray = s.toCharArray();

		for(var chars : charArray) {
			var count = 0;
			if(map.containsKey(chars)) {
				count = map.get(chars);
				map.put(chars, count + 1);
			}
			else {
				map.put(chars, count + 1);
			}
		}
		for(var chars : charArray) {
			if(map.get(chars) == 1) {
				System.out.println(chars);
				return;
			}
		}
				
				
	}
}