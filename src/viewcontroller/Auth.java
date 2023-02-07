package viewcontroller;

import org.hibernate.Session;

import dbutil.HibernateSF;
import model.Student;

public class Auth {
	String role;
	  
	  public String Authenticate(String name)
	  {
		  Session session = HibernateSF.getSession().openSession();
		  int id=1;
		  for(int i=0;i<5;i++)
		  {
			  Student s = session.get(Student.class,id);
			  if(name.equals(s.getName())) {
				  role="student";
				  break;
				    
			  }
			  id++;
			  
		  }
			  

		  return role; 

}
}
