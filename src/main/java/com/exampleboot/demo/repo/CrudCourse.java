package com.exampleboot.demo.repo;
import com.exampleboot.demo.model.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class CrudCourse {

    Session makesesstions(){

        SessionFactory factory;
        try {

            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.out.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        Session session = factory.openSession();
        return session;
    }

    /*
     *   Create Course
     *  */
    public Course creatCourse(String Name){
        Course course = new Course();
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        course.setName(Name);
        session.save(course);
        tr.commit();
        session.close();
        return course;
    }


    /*
     *   Remove Student
     *  */
    public void removeCourse(int id ){
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        Course course=session.find(Course.class,id);
        session.remove(course);
        tr.commit();
        session.close();
    }
    /*
     *   update Student
     *  */
    public Course updateCourse(int id ,String name){
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        Course course=session.find(Course.class,id);
        course.setName(name);
        session.update(course);
        tr.commit();
        session.close();
        return course;
    }
     public Course findCourse(int id ){
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        Course course=session.find(Course.class,id);
        tr.commit();
        session.close();
        return course ;
    }

}