import java.util.*;

/*
 *	Classic merge sort function 
 *  
 *  Input should be a random int array, output will be a sorted int array 
**/

public class MergeSort{
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
		int leftSize = mid-p+1;
		int rightSize = r-mid;
		int[] leftArr = new int[leftSize]; 
		int[] rightArr = new int[rightSize];

		for(int i = 0; i<leftArr.length;i++){//copy left part
			leftArr[i] = A[i+p];
		}
		for(int i = 0; i<rightArr.length;i++){ //copy right part
			rightArr[i] = A[mid+i+1];
		}

		//do comparsion util one part is empty, and add all other part to the end
		int currentIdx = p;
		int lftIdx = 0;
		int rgtIdx = 0;

		while(lftIdx<leftSize&&rgtIdx<rightSize){ //both part are not empty
			if(leftArr[lftIdx]>rightArr[rgtIdx]){//right part smaller
				A[currentIdx] = rightArr[rgtIdx];
				rgtIdx++;
			}else{//left part smaller or the same, pick left one
				A[currentIdx] = leftArr[lftIdx];
				lftIdx++;
			}
			currentIdx++;
		}

		while(lftIdx<leftSize){//some element are still not scanned in left part
			A[currentIdx] = leftArr[lftIdx];
			lftIdx++;
			currentIdx++;
		}

		while(rgtIdx>rightSize){//some element are still not scanned in right part
			A[currentIdx] = rightArr[rgtIdx];
			rgtIdx++;
			currentIdx++;
		}

	}

}