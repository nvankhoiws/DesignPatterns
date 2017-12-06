package com.udemy.balazsholczer.solid.dependency_inversion_principle;

public interface Database {
	public void connect();
	public void disconnect();
}
