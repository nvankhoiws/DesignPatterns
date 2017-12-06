package com.udemy.balazsholczer.solid.o;

public class InsertionSort extends Sorter {

	public InsertionSort() {
		super.type = SortType.INSERTIONSORT;
	}

	@Override
	public void sort() {
		System.out.println("Sorting with insertion sort...");
	}

}
