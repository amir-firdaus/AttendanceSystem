package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dbutil.HibernateSF;
import model.User;


@Controller()
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/getAll")
	@ResponseBody()
	public String getAll(){
		
		Session session = HibernateSF.getSession().openSession();
		List<User> uList = session.createQuery("from User").list();
		
		return "this is from getAll - program. Program List: " + uList.toString() ;
	}

	@RequestMapping("/getById")
	@ResponseBody()
	public String getById(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		Session session = HibernateSF.getSession().openSession();
		User u = session.get(User.class, id);
		
		return "this is from getById - program" + u.toString();
	}
	
	@RequestMapping("/add")
	@ResponseBody()
	public String add(HttpServletRequest request, Model model) {

		Session session = HibernateSF.getSession().openSession();
		User u = new User();
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String section=request.getParameter("section");
		String course=request.getParameter("course");
		
		u.setName(name);
		u.setPassword(password);
		u.setCourse(course);
		u.setSection(section);
		
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
        session.close();
		
		return "this is from add - program";
	}
	
	@RequestMapping("/update")
	//@ResponseBody()
	public String update(HttpServletRequest request, Model model) {
		
		int id = Integer.parseInt(request.getParameter("id"));
		Session session = HibernateSF.getSession().openSession();
		User u = session.get(User.class, id);
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String section=request.getParameter("section");
		String course=request.getParameter("course");
		
		session.beginTransaction();

        User user = session.load(User.class, id);
		user.setName(name);
		user.setPassword(password);
		user.setCourse(course);
		user.setSection(section);
        session.update(user);
        session.getTransaction().commit();
        session.close();
	
		return "This is from edit";
	}

	@RequestMapping("/delete")
//	@ResponseBody()
	public String delete(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		Session session = HibernateSF.getSession().openSession();
		
		int id = Integer.parseInt(request.getParameter("id"));
		session.beginTransaction();
		User user = session.get(User.class, id);
		session.delete(user);
		session.getTransaction().commit();
		
		return "This is delete";

	}	
}
