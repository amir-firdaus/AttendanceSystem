package model;

import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@Column(name="name")
	String name;
	@Column(name="password")
    String password;
	@Column(name="section")
    String section;
	@Column(name="course")
    String course;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
    
    public void displayDashboard(String name,String course, String section) {
    	System.out.print(name);
    	System.out.print(course);
    	System.out.print(section);
    }
    
    public void getUser() {
    	User u = new User();
    	System.out.print(u);
    }
    
//    public void getClass() {
//    	Class cl = new Class(course,section);
//    	System.out.print(cl);
//    }
    
    public void displaySuccessfulMessage() {
    	System.out.println("Successful");
    }
    
    public void displayErrorMessage() {
    	System.out.println("Error!");
    }
    
    public void updateUserList() {
    	User u = new User();
    	
    }

}
