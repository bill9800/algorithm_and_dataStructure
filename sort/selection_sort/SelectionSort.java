package sort.selection_sort;
import sort.sort_basic.*;
import java.util.*;
/*
	classic selection sort
**/

public class SelectionSort extends Sort{
	/*
		sort supclass method for user
		@param A  input int array
	**/
	public void sort(int[] A){
		selectionSort(A,0);
	}

	/*
		select the minium number and swap it with the first unsorted index
		@param A  input int array 
		@param currentIdx  the current first index to do one step selection sort
	**/
	private static void selectionSort(int[] A, int currentIdx){
		int arrSize = A.length;
		for(int i=0;i<arrSize-1;i++){//find the index of the min value
			int minIdx = i;
			for(int j=i+1;j<arrSize;j++){
				if(A[j]<A[minIdx]){
					minIdx = j;
				}
			}
			//swap the number 
			int temp = A[minIdx];
			A[minIdx] = A[i];
			A[i] = temp;
		}

	}

} 