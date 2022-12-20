package com.nvd.training.java11.advanced.predicate;

public class Employee {
	private Integer id;
	private Integer age;
	private String gender;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Employee(Integer id, Integer age, String gender) {
		this.id = id;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return this.id.toString() + " - " + this.age.toString();
	}

}