package myPackage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLateInitializer","handler"})
public class Student {
	@Id
	int id;
	String name;
	String course;
	public int getId() {
		return id;
	}
	public Student(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		
		this.course = course;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}