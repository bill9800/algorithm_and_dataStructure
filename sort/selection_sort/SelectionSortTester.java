package sort.selection_sort;
import sort.sort_basic.*;
import java.util.*;
/*
 * SelectionSortTester
 * 
 * test the funciotn of selection sort
**/
public class SelectionSortTester extends SortTester{
	/*
		Main method

		@param args  input from terminal
	**/
	public static void main(String[] args) {
		System.out.println("Test selection sort:");
		SelectionSort selectionSort = new SelectionSort();
		sortTest(selectionSort);
	}

}	

