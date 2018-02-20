import java.util.*;

/*
 *	Classic merge sort function 
 *  
 *  Input should be a random int array, output will be a sorted int array 
**/

public class MergeSort{
	/*
		Main method
		test function to ensure the function of mergesort method
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



	/*
		This recursive mergeSort method is used to do the divide and conquer algorithm

		@param A  the array we want to sort
		@param p  the index of the first element we want to sort in A array
		@param r  the index of the last element we want to sort in Aarray
	**/
	public static void mergeSort(int[] A,int p,int r){
		if(p<r){
			int mid = (p+r)/2;
			mergeSort(A,p,mid);
			mergeSort(A,mid+1,r);
			combine(A,p,mid,r);
		}

	}

	/*
		The combine method is used to compare two sorted parts in the array and merge them into one sorted part

		@param A  the array we refer to do combine
		@param p  the index of the first element we want to combine
		@param mid  the index of the middle element we want to combine
		@param r  the index of the last element we want to combine
	**/
	private static void combine(int[] A,int p,int mid,int r){
		//create a tempory int to store the result
		int[] tempArr = new int[r-p+1];
		int lastLoc = -1; //store the last sorted index of tempArr, add 1 before each addition
		int startIdx = p; //store the start index as a reference to copy back tempArr to A
		int q = mid+1; //q is the start index of the second part;
		
		//do comparsion util one part is empty, and add all other part to the end
		while( p<=mid && q<=r ){ 
			if(A[p]<A[q]){ //left part is smaller
				lastLoc++;
				tempArr[lastLoc] = A[p];
				p++;
			}else if(A[p]>A[q]){ //right part is smaller
				lastLoc++;
				tempArr[lastLoc] = A[q];
				q++;
			}else{ // both part are the same, choose left part to add
				lastLoc++;
				tempArr[lastLoc] = A[p];
				p++;
			}

		}
		
		//store remained part into tempArr
		if(p>mid){ //left part is empty
			for(int i=q;i<r+1;i++){
				lastLoc++;
				tempArr[lastLoc] = A[i]; 
			}
		}else{//right part is empty
			for(int i=p;i<mid+1;i++){
				lastLoc++;
				tempArr[lastLoc] = A[i];
			}
		}

		// copy tempArr back to A
		int tempIdx = 0;
		for(int i=startIdx;i<r+1;i++){
			A[i] = tempArr[tempIdx];
			tempIdx++;
		}

	}

}