package com.example.algorithms.sort;

import java.util.LinkedList;

public class MergeSort<T extends Comparable<T>> implements Sort<T> {

	public void sortAscending(T[] data) {
		if (data == null) {
			return;
		}

		mergeSort(data, 0, data.length - 1);
	};

	/**
	 * Sort data using merge sort algorithm.
	 * 
	 * @param data
	 *            the whole data
	 * @param left
	 *            the left-hand index, inclusive
	 * @param right
	 *            the right-hand index, inclusive
	 */
	private void mergeSort(T[] data, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(data, left, mid);
			mergeSort(data, mid + 1, right);
			mergeWithArray(data, left, mid, right);
			// mergeWithList(data, left, mid, right);
		}
	}

	/**
	 * Merges sorted data left..mid and mid..right.
	 * 
	 * @param data
	 *            the whole data
	 * @param left
	 *            the left-hand index, inclusive
	 * @param mid
	 *            the mid index
	 * @param right
	 *            the right-hand index, inclusive
	 */
	private void mergeWithArray(T[] data, int left, int mid, int right) {
		Object[] a1 = new Object[mid - left + 1];
		Object[] a2 = new Object[right - mid];

		for (int i = left; i <= mid; i++) {
			a1[i - left] = data[i];
		}
		for (int i = mid + 1; i <= right; i++) {
			a2[i - (mid + 1)] = data[i];
		}

		int i1 = 0;
		int i2 = 0;

		for (int i = left; i <= right; i++) {
			if (i1 >= a1.length) {
				data[i] = (T) a2[i2];
				i2++;
			} else if (i2 >= a2.length) {
				data[i] = (T) a1[i1];
				i1++;
			} else if (((T) a1[i1]).compareTo(((T) a2[i2])) > 0) {
				data[i] = (T) a2[i2];
				i2++;
			} else {
				data[i] = (T) a1[i1];
				i1++;
			}
		}
	}

	/**
	 * Merges sorted data left..mid and mid..right.
	 * 
	 * @param data
	 *            the whole data
	 * @param left
	 *            the left-hand index, inclusive
	 * @param mid
	 *            the mid index
	 * @param right
	 *            the right-hand index, inclusive
	 */
	private void mergeWithList(T[] data, int left, int mid, int right) {
		LinkedList<T> l1 = new LinkedList<T>();
		LinkedList<T> l2 = new LinkedList<T>();
		for (int i = left; i <= mid; i++) {
			l1.addLast(data[i]);
		}
		for (int i = mid + 1; i <= right; i++) {
			l2.addLast(data[i]);
		}

		for (int i = left; i <= right; i++) {
			if (l1.isEmpty()) {
				data[i] = l2.removeFirst();
			} else if (l2.isEmpty()) {
				data[i] = l1.removeFirst();
			} else if (l1.getFirst().compareTo(l2.getFirst()) > 0) {
				data[i] = l2.removeFirst();
			} else {
				data[i] = l1.removeFirst();
			}
		}
	}

	public void sortDescending(T[] data) {
		throw new UnsupportedOperationException();
	};

}
