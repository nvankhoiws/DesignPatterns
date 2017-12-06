package com.udemy.balazsholczer.solid.o;

public class Mergesort extends Sorter {

	public Mergesort() {
		super.type = SortType.INSERTIONSORT;
	}

	@Override
	public void sort() {
		System.out.println("Sorting with mergesort...");
	}

}
