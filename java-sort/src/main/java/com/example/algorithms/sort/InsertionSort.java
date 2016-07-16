package com.example.algorithms.sort;

public class InsertionSort<T extends Comparable<T>> implements Sort<T> {

	public void sortAscending(T[] data) {
		if (data == null) {
			return;
		}

		for (int k = 1; k < data.length; k++) {
			T key = data[k];
			int i = k - 1;
			while (i >= 0 && data[i].compareTo(key) > 0) {
				data[i + 1] = data[i];
				i--;
			}
			data[i + 1] = key;
		}
	}

	public void sortDescending(T[] data) {
		if (data == null) {
			return;
		}

		for (int k = 1; k < data.length; k++) {
			T key = data[k];
			int i = k - 1;
			while (i >= 0 && data[i].compareTo(key) < 0) {
				data[i + 1] = data[i];
				i--;
			}
			data[i + 1] = key;
		}
	}
}
