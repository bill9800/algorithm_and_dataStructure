package sort.sort_basic;
import java.util.*;
public class SortTester{

	public static void sortTest(Sort kindOfSort){
		//Test descending odd order
		int[] testArr1 = new int[]{7,6,5,4,3,2,1};
		System.out.println("Test descending odd order: "+Arrays.toString(testArr1));
		kindOfSort.sort(testArr1);
		System.out.println("result: "+Arrays.toString(testArr1));

		//Test descending even order
		int[] testArr2 = new int[]{6,5,4,3,2,1};
		System.out.println("Test descending even order: "+Arrays.toString(testArr2));
		kindOfSort.sort(testArr2);
		System.out.println("result: "+Arrays.toString(testArr2));

		//Test random order

		int[] testArr3 = new int[]{8,8,6,8,61,23,4,4,348,97,9,4};
		System.out.println("Test random order: "+Arrays.toString(testArr3));
		kindOfSort.sort(testArr3);
		System.out.println("result: "+Arrays.toString(testArr3));


	}



}