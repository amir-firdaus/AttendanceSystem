package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dbutil.HibernateSF;
import model.Student;


@Controller()
public class AttendanceController {
	@RequestMapping("/getAll")
	@ResponseBody()
	public String getAll(){
		
		Session session = HibernateSF.getSession().openSession();
		List<Student> sList = session.createQuery("from Student").list();
		
		return "this is from getAll - program. Program List: " + sList.toString() ;
	}
	
	@RequestMapping("/getById")
	@ResponseBody()
	public String getById(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		Session session = HibernateSF.getSession().openSession();
		Student s = session.get(Student.class, id);
		
		return "this is from getById - program" + s.toString();
	}
	
	@RequestMapping("/add")
	@ResponseBody()
	public void add(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{

		Session session = HibernateSF.getSession().openSession();
		Student s = new Student();
		String name=request.getParameter("name");

		String section=request.getParameter("section");
		
		String course=request.getParameter("course");
		
		
		s.setName(name);
		s.setCourse(course);
		s.setSection(section);
		
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
        session.close();
		
        request.getRequestDispatcher("AttendanceList.jsp").forward(request, response);
		
	}
	
	@RequestMapping("/update")
	//@ResponseBody()
	public void update(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));

		Session session = HibernateSF.getSession().openSession();
		Student s = session.get(Student.class, id);
		
		String name=request.getParameter("name");
		String section=request.getParameter("section");
		String course=request.getParameter("course");

		
		session.beginTransaction();

        Student stud = session.load(Student.class, id);
		stud.setName(name);
		stud.setCourse(course);
		stud.setSection(section);
        session.update(stud);
        session.getTransaction().commit();
        session.close();
	
        request.getRequestDispatcher("AttendanceList.jsp").forward(request, response);
	}

	@RequestMapping("/delete")
//	@ResponseBody()
	public void delete(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		Session session = HibernateSF.getSession().openSession();
		
		int id = Integer.parseInt(request.getParameter("id"));
		session.beginTransaction();
		Student s = session.get(Student.class, id);
		session.delete(s);
		session.getTransaction().commit();
		
		request.getRequestDispatcher("AttendanceList.jsp").forward(request, response);

	}	


}
