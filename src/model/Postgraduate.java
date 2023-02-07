package model;

import java.util.Scanner;

public class Postgraduate {
	String name;
    String password;
    int id;
    String section;
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
    
    public void chooseCourse(String course) {
    	Scanner sc= new Scanner(System.in);  
    	String c = sc.next();
    }
    
    public void chooseSection(String section) {
    	Scanner sc= new Scanner(System.in);  
    	String s = sc.next();
    }
    
    public void viewAttendance() {
    	
    }
    
    public void getReport() {
    	
    }
    


}
