package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	
	
	@Column(name = "id")
	@Id
	private int stdId;
	
	
	@Column(name="name")
	private String stdName;
	
	@Column(name = "age")
	private int stdAge;
	
	
	@Column(name = "marks")
	private int stdMarks;
	
	public Students() {
		// TODO Auto-generated constructor stub
	}

	public Students(int stdId, String stdName, int stdAge, int stdMarks) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.stdMarks = stdMarks;
	}

	public int getStdMarks() {
		return stdMarks;
	}

	public void setStdMarks(int stdMarks) {
		this.stdMarks = stdMarks;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdAge() {
		return stdAge;
	}

	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}

	@Override
	public String toString() {
		return "Students [stdId=" + stdId + ", stdName=" + stdName + ", stdAge=" + stdAge + ", stdMarks=" + stdMarks
				+ "]";
	}

}
