package com.anahuac.software.comportamiento.strategy;

import java.util.Arrays;

public class MergeSort implements SortingAlgorithm{

	@Override
	public void sort(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Merge Sort");
        System.out.println(Arrays.toString(arr));
	}

}
