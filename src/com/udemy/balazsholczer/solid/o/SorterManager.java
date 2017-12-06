package com.udemy.balazsholczer.solid.o;

public class SorterManager {

	public void doSort(Sorter sorter) {
		if (sorter.type == SortType.INSERTIONSORT) {
			sorter.sort();
		}
	}
}
