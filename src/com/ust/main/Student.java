package com.ust.main;

public  class Student implements Comparable<Student> {
	
	String name;
	int id;
	int totalmarks;
	
	
	

	@Override
	public int compareTo(Student e) {
		return id - e.getId();
	}
	@Override
	public int hashCode() {
		System.out.println("id: " + id);
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		System.out.println("equals id: " + id);
		return name.equals(s.getName()) && totalmarks==s.gettotalmarks();
	}

	
	public Student(int id, String name, int totalmarks) {
		super();
		this.id = id;
		this.name = name;
		this.totalmarks = totalmarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int gettotalmarks() {
		return totalmarks;
	}
	public void settotalmarks(int  totalmarks) {
		this.totalmarks = totalmarks;
	}
	@Override
	public String toString() {
		return "\nEmp [id=" + id + ", name=" + name + ", totalmarks=" + totalmarks + "]";
	}

	
}

	
	
	
	

		
		
		
		
		
		
		
		
		
	
