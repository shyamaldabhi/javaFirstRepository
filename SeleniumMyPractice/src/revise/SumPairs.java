package revise;

import java.util.List;
import java.util.ArrayList;

public class SumPairs {

	public static void main(String[] args) {
		
		        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
		        int sum = 3;

		        List<int[]> pairs = findPairs(array, sum);
		        for (int[] pair : pairs) {
		            System.out.println(pair[0] + "," + pair[1]);
		        }
		    }

	private static List<int[]> findPairs(int[] array, int sum) {
		 List<int[]> pairs = new ArrayList<>();
	        for (int i = 0; i < array.length; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] + array[j] == sum) {
	                    pairs.add(new int[] { array[i], array[j] });
	                }
	            }
	        }
		return pairs;
	}

	}

