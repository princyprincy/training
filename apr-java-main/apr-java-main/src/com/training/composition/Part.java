package com.training.composition;

public class Part {
	private int id;
	private String name;
	public Part() {
		
	}
	public Part(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public String toString() {
		return "id : " + id + " name : " + name;
	}

}
 