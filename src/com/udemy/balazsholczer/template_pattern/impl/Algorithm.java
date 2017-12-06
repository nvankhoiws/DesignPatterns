package com.udemy.balazsholczer.template_pattern.impl;

public abstract class Algorithm {
	
	protected abstract void initialize();
	protected abstract void sorting();
	protected abstract void printResults();
	
	public void sort(){
		initialize();
		sorting();
		printResults();
	}
}
