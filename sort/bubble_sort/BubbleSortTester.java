package sort.bubble_sort;
import sort.sort_basic.*;
import java.util.*;

/*
 *	BubbleSortTester
 *  
 *  tester for bubble sort
**/

public class BubbleSortTester extends SortTester{
	/*
		Main method

		@param args  input from terminal
	**/
	public static void main(String[] args) {
		System.out.println("Test bubble sort:");
		BubbleSort bubbleSort = new BubbleSort();
		sortTest(bubbleSort);
	}
}