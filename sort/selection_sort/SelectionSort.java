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
		if(currentIdx==arrSize-1){ //base case: have done the search for all index in A
			return;
		}
		int min = Integer.MAX_VALUE;
		int minIdx = currentIdx;
		for(int i=currentIdx;i<arrSize;i++){//find the minimum in unsorted part
			if(A[i]<min){
				min = A[i];
				minIdx = i;
			}
		}
		//swap the number 
		A[minIdx] = A[currentIdx];
		A[currentIdx] = min;
		selectionSort(A,currentIdx+1);
	}

} 