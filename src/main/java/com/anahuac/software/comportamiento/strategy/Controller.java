package com.anahuac.software.comportamiento.strategy;

public class Controller {
	public static void main(String[] args) {
		int[] arr = {5, 2, 7, 1, 9};
		
		SortingSelector sortingSelector = new SortingSelector();
		
		BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();
        InsertionSort insertionSort = new InsertionSort();
        
        sortingSelector.setSortingAlgorithm(bubbleSort);
        sortingSelector.executeSort(arr.clone());
        System.out.println();
        
        sortingSelector.setSortingAlgorithm(quickSort);
        sortingSelector.executeSort(arr.clone());
        System.out.println();
        
        sortingSelector.setSortingAlgorithm(mergeSort);
        sortingSelector.executeSort(arr.clone());
        System.out.println();

        sortingSelector.setSortingAlgorithm(insertionSort);
        sortingSelector.executeSort(arr.clone());
        System.out.println();
	}
}
