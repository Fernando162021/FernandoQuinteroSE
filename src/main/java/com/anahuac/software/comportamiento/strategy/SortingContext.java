package com.anahuac.software.comportamiento.strategy;

public class SortingContext {
	private SortingAlgorithm sortingAlgorithm;

    public void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void executeSort(int[] arr) {
        sortingAlgorithm.sort(arr);
    }
}
