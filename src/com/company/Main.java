package com.company;

import Entities.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.IOException;

public class Main {

    private static SessionFactory factory;

    public static void main(String[] args) {

        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        FileAccessor fileAccessor = new FileAccessor();

        try {
            fileAccessor.readDepartamentsFile("departaments.txt");
            fileAccessor.printDepartaments();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileAccessor.readTeachersFile("teachers.txt");
            fileAccessor.printTeachers();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileAccessor.readSubjectsFile("subjects.txt");
            fileAccessor.printSubjects();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileAccessor.readGroupsFile("groups.txt");
            fileAccessor.printGroups();
        } catch (IOException e) {
            e.printStackTrace();
        }



        try {
            fileAccessor.readSessionsFile("sessions.txt");
            fileAccessor.printSessions();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i=0; i < fileAccessor.llistaDepartaments.size() ;i++) {
            addDepartaments(fileAccessor.llistaDepartaments.get(i));
        }

        for (int i=0; i < fileAccessor.llistaGroups.size() ;i++) {
            addGroups(fileAccessor.llistaGroups.get(i));
        }


        for (int i=0; i < fileAccessor.llistaSubjects.size() ;i++) {
            addSubjects(fileAccessor.llistaSubjects.get(i));
        }

        for (int i=0; i < fileAccessor.llistaTeachers.size() ;i++) {
            addTeachers(fileAccessor.llistaTeachers.get(i));
        }

        for (int i=0; i < fileAccessor.llistaSessions.size() ;i++) {
            addSessions(fileAccessor.llistaSessions.get(i));
        }
    }

     public static void addDepartaments(Departaments departaments) {
         Session session = factory.openSession();
         Transaction tx = null;
         Integer DepartamentsID = null;
         try {
             tx = session.beginTransaction();

             DepartamentsID = (Integer) session.save(departaments);
             tx.commit();
         } catch (HibernateException e) {
             if (tx != null)
                 tx.rollback();
             e.printStackTrace();
         } finally {
             session.close();
         }
     }

    public static void addGroups(Groups groups) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer GroupsID = null;
        try {
            tx = session.beginTransaction();

            GroupsID = (Integer) session.save(groups);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }



    public static void addSubjects(Subjects subjects) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer SubjectsID = null;
        try {
            tx = session.beginTransaction();

            SubjectsID = (Integer) session.save(subjects);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


    public static void addTeachers(Teachers teachers) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer TeachersID = null;
        try {
            tx = session.beginTransaction();

            TeachersID = (Integer) session.save(teachers);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static void addSessions(Sessions sessions) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer SessionsID = null;
        try {
            tx = session.beginTransaction();

            /**SessionsID = (Integer)**/ session.save(sessions);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
