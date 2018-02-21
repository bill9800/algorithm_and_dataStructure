import java.util.*;
/*
 * MergeSortTester
 * 
 * test the funciotn of mergesort
**/
public class MergeSortTester{
	/*
		Main method

		@param args  input from terminal
	**/

	public static void main(String[] args) {
		//Test descending odd order
		int[] testArr1 = new int[]{7,6,5,4,3,2,1};
		System.out.println("Test descending odd order: "+Arrays.toString(testArr1));
		MergeSort.mergeSort(testArr1,0,testArr1.length-1);
		System.out.println("result: "+Arrays.toString(testArr1));

		//Test descending even order
		int[] testArr2 = new int[]{6,5,4,3,2,1};
		System.out.println("Test descending even order: "+Arrays.toString(testArr2));
		MergeSort.mergeSort(testArr2,0,testArr2.length-1);
		System.out.println("result: "+Arrays.toString(testArr2));

		//Test random order

		int[] testArr3 = new int[]{8,8,6,8,61,23,4,4,348,97,9,4};
		System.out.println("Test random order: "+Arrays.toString(testArr3));
		MergeSort.mergeSort(testArr3,0,testArr3.length-1);
		System.out.println("result: "+Arrays.toString(testArr3));


	}

}	

