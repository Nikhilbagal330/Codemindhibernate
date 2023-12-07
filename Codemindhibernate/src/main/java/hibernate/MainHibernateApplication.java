package hibernate;

import java.util.*;
import org.hibernate.Session;

public class MainHibernateApplication {
	
	public static void main(String[] args) {
		System.out.println("this is my hibernate project ");
		
		//save my Student object using session Factory
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Scanner sc=new Scanner(System.in);
	
		String id,name,city,course;
		id=sc.nextLine();
		name=sc.nextLine();
		city=sc.nextLine();
		course=sc.nextLine();
		
		Student st1 = new Student();
		st1.setId(id);
		st1.setName(name);
		st1.setCity(city);
		st1.setCourse(course);
		st1.setSchool("VVPS");
		session.save(st1);
		
		
//		Student st2 = new Student();
//		st1.setId("56474");
//		st1.setName("nikhil");
//		st1.setCity("Bhopal");
//		st1.setCourse("maths");
//		st1.setSchool("VVPS");
//		session.save(st2);

		
		//Student st  = session.load(Student.class, "457");
		
		System.out.println(st1);
//		System.out.println(st2);
		
		// Any class's object is this. that class should be @Entity
		
		session.getTransaction().commit();
		
		HibernateUtil.shutdown();
		
		

	}

}