package com.example.algorithms.sort;

public interface Sort<T extends Comparable<T>> {

	public abstract void sortAscending(T[] data);

	public abstract void sortDescending(T[] data);

}