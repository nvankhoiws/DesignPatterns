package com.udemy.balazsholczer.template_pattern.impl;

public class BubbleSort extends Algorithm{

	private int[] numbers;
	
	public BubbleSort(int[] numbers){
		this.numbers = numbers;
	}
	
	@Override
	protected void initialize() {
		System.out.println("Bubble sort initializing...");
	}

	@Override
	protected void sorting() {
		
		int n = this.numbers.length;
		int temp;
		
		while( n != 0 ){
			
			temp = 0;
			
			for(int i=1;i<n;i++){
				if( numbers[i-1] > numbers[i]){
					int swap = numbers[i-1];
					numbers[i-1] = numbers[i];
					numbers[i] = swap;
					temp = i;
				}
			}
			
			n = temp;
			
		}
	}

	@Override
	protected void printResults() {
		for(int i=0;i<numbers.length;i++){
			System.out.print(numbers[i]+" ");
		}
	}
}
