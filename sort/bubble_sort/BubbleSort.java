package sort.bubble_sort;
import sort.sort_basic.*;
import java.util.*;

/*
 *	BubbleSort
 *	
 *  Do two element comparison from left to right, swap the larger element to right.   
**/
public class BubbleSort extends Sort{
	public void sort(int[] A){
		bubbleSort(A);
	}
	private static void bubbleSort(int[] A){
		int arrSize = A.length;
		for(int i=0;i<arrSize;i++){
			boolean sorted = true; //stop earlier if the array is already sorted
			for(int j=0;j<arrSize-1;j++){
				if(A[j+1]<A[j]){
					swap(A,j,j+1);
					sorted = false;//if some element are swaped, keep doing bubblesort
				}
			}
			if(sorted){return;}
		}
	}
	
	/*
		swap two element in array according to the index
		@param A  input array
		@param firstIdx  first one index 
		@param secondidx  the index we want to swap with the first index
	**/
	private static void swap(int[] A,int firstIdx,int secondIdx){
		int temp = A[firstIdx];
	 	A[firstIdx] = A[secondIdx];
	 	A[secondIdx] = temp;
	}


}