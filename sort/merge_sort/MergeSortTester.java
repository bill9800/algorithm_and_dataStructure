package sort.merge_sort;
import sort.sort_basic.*;
import java.util.*;
/*
 * MergeSortTester
 * 
 * test the funciotn of mergesort
**/
public class MergeSortTester extends SortTester{
	/*
		Main method

		@param args  input from terminal
	**/
	public static void main(String[] args) {
		System.out.println("Test merge sort:");
		MergeSort mergeSort = new MergeSort();
		sortTest(mergeSort);
	}

}	

