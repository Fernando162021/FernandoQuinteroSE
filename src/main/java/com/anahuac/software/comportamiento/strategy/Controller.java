package com.anahuac.software.comportamiento.strategy;

public class Controller {
	public static void main(String[] args) {
		int[] arr = {5, 2, 7, 1, 9};
		
		SortingContext sortingContext = new SortingContext();
		
		BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();
        InsertionSort insertionSort = new InsertionSort();
        
        sortingContext.setSortingAlgorithm(bubbleSort);
        sortingContext.executeSort(arr.clone());
        System.out.println();
        
        sortingContext.setSortingAlgorithm(quickSort);
        sortingContext.executeSort(arr.clone());
        System.out.println();
        
        sortingContext.setSortingAlgorithm(mergeSort);
        sortingContext.executeSort(arr.clone());
        System.out.println();

        sortingContext.setSortingAlgorithm(insertionSort);
        sortingContext.executeSort(arr.clone());
        System.out.println();
	}
}
