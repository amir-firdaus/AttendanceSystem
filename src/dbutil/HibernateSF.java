package dbutil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Student;

public class HibernateSF {
	
	static SessionFactory sf = null;

	public static SessionFactory getSession() {
		if(sf == null) {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			config.addAnnotatedClass(Student.class);
			
			sf = config.buildSessionFactory();
		}
		return sf;
	}

}
