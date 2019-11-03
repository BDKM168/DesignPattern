package designpatterns.adapter;

public class OperationAdapter implements ScoreOperation {
	private QuickSort sortObj; 
	private BinarySearch searchObj;

	public OperationAdapter() {
		sortObj = new QuickSort();
		searchObj = new BinarySearch();
	}

	public int[] sort(int array[]) {  
		return sortObj.quickSort(array); //call QuickSort's quickSort()
	}

	public int search(int array[],int key) {  
		return searchObj.binarySearch(array,key); //call BinarySearch's binarySearch
	}
}
