package com.udemy.balazsholczer.solid.opened_closed_principle;

public class SorterManager {

	public void doSort(Sorter sorter) {
		if (sorter.type == SortType.INSERTIONSORT) {
			sorter.sort();
		}
	}
}
