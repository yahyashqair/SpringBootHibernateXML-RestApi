package com.exampleboot.demo.repo;
import com.exampleboot.demo.model.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class CrudDepartment {

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
    Department creatDepartment(String Name){
        Department department = new Department();
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        department.setName(Name);
        session.save(department);
        tr.commit();
        session.close();
        return department;
    }


    /*
     *   Remove Student
     *  */
    void removeDepartment(int id ){
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        Department department=session.find(Department.class,id);
        session.remove(department);
        tr.commit();
        session.close();
    }
    /*
     *   update Student
     *  */
    void updateDepartment(int id ,String name){
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        Department department=session.find(Department.class,id);
        department.setName(name);
        session.update(department);
        tr.commit();
        session.close();
    }
    public Department findDepartment(int id ){
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        Department department=session.find(Department.class,id);
        tr.commit();
        session.close();
        return department ;
    }
}