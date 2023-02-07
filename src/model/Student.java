package model;

import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(name="name")
	String name;
	@Column(name="course")
    String course;
	@Column(name="section")
    String section;
	
    

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
    
    public void chooseCourse(String course) {
    	Scanner sc= new Scanner(System.in);  
    	String c = sc.next();
    }
    
    public void chooseSection(String section) {
    	Scanner sc= new Scanner(System.in);  
    	String s = sc.next();
    }

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", section=" + section + "]";
	}
    
  
    

    

}
