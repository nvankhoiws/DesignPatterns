package com.udemy.balazsholczer.solid.opened_closed_principle;

public class Mergesort extends Sorter {

	public Mergesort() {
		super.type = SortType.INSERTIONSORT;
	}

	@Override
	public void sort() {
		System.out.println("Sorting with mergesort...");
	}

}
