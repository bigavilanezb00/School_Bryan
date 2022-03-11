package com.company;

import Entities.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

public class FileAccessor {

    ArrayList<Departaments> llistaDepartaments = new ArrayList<>();
    ArrayList<Subjects> llistaSubjects = new ArrayList();
    ArrayList<Groups> llistaGroups = new ArrayList<>();
    ArrayList<Teachers> llistaTeachers = new ArrayList();
    ArrayList<Sessions> llistaSessions = new ArrayList<>();

    public FileAccessor() {
    }

    public void readDepartamentsFile(String filename) throws IOException {

        int code;
        String name, phone;

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String linea = "";
        while ((linea = br.readLine()) != null) {
            StringTokenizer str = new StringTokenizer(linea, ",");
            code = Integer.parseInt(str.nextToken());
            name = str.nextToken();
            phone = str.nextToken();

            llistaDepartaments.add(new Departaments(code, name, phone));
        }
        br.close();
    }

    public void printDepartaments() {
        for (int i = 0; i < llistaDepartaments.size(); i++) {
            System.out.println(llistaDepartaments.get(i).toString());
        }
    }

    public void readSubjectsFile(String filename) throws IOException {

        String  description;
        int code;

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String linea = "";
        while ((linea = br.readLine()) != null) {
            StringTokenizer str = new StringTokenizer(linea, ",");
            code = Integer.parseInt(str.nextToken());
            description = str.nextToken();

            llistaSubjects.add(new Subjects(code, description));
        }
        br.close();
    }

    public void printSubjects() {
        for (int i = 0; i < llistaSubjects.size(); i++) {
            System.out.println(llistaSubjects.get(i).toString());
        }
    }

    public void readGroupsFile(String filename) throws IOException {

        String  curriculum;
        int course,code;

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String linea = "";
        while ((linea = br.readLine()) != null) {
            StringTokenizer str = new StringTokenizer(linea, ",");
            code = Integer.parseInt(str.nextToken());
            curriculum = str.nextToken();
            course = Integer.parseInt(str.nextToken());

            llistaGroups.add(new Groups(code,curriculum,course));
        }
        br.close();
    }

    public void printGroups() {
        for (int i = 0; i < llistaGroups.size(); i++) {
            System.out.println(llistaGroups.get(i).toString());
        }
    }

    public void readTeachersFile(String filename) throws IOException {

        int id, code_dep;
        String firstname, lastname, email;

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String linea = "";
        while ((linea = br.readLine()) != null) {
            StringTokenizer str = new StringTokenizer(linea, ",");
            id = Integer.parseInt(str.nextToken());
            firstname = str.nextToken();
            lastname = str.nextToken();
            email = str.nextToken();
            code_dep = Integer.parseInt(str.nextToken());
            // System.out.println(id + name + country + year + active);
            llistaTeachers.add(new Teachers(id, code_dep, firstname, lastname, email, llistaDepartaments.get(code_dep - 1)));

        }
        br.close();

    }

    public void printTeachers() {
        for (int i = 0; i < llistaTeachers.size(); i++) {
            System.out.println(llistaTeachers.get(i).toString());
        }
    }



    public void readSessionsFile(String filename) throws IOException {
        String week_day;
        int starts,finishes,id_teacher,code_group,code_subject;

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String linea = "";
        while ((linea = br.readLine()) != null) {
            StringTokenizer str = new StringTokenizer(linea, ",");
            week_day = str.nextToken();
            code_group = Integer.parseInt(str.nextToken());
            code_subject = Integer.parseInt(str.nextToken());
            starts = Integer.parseInt(str.nextToken());
            finishes = Integer.parseInt(str.nextToken());
            id_teacher = Integer.parseInt(str.nextToken());

            llistaSessions.add(new Sessions(week_day,code_group,code_subject,starts,finishes,id_teacher,
                    llistaTeachers.get(id_teacher - 1),
                    llistaSubjects.get(code_subject - 1),
                    llistaGroups.get(code_group - 1)));
        }
    }

    public void printSessions() {
        for (int i = 0; i < llistaSessions.size(); i++) {
            System.out.println(llistaSessions.get(i).toString());
            System.out.println("     "+llistaSessions.get(i).getTeacher().toString());

        }
    }




/*
    public void printRevistes() {
        // TODO
        //
        for (int i = 0; i < llistaRevistes.size(); i++) {
            System.out.println(llistaRevistes.get(i).toString());
        }
    }

    public void readMagazinesFile(String filename) throws IOException {
        int id;
        String titol;
        Date date;
        DateFormat dateformat = new SimpleDateFormat("yyyy-mm-dd");

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String linea = "";
        while ((linea = br.readLine()) != null) {
            StringTokenizer str = new StringTokenizer(linea, ",");
            id = Integer.parseInt(str.nextToken());
            titol = str.nextToken();
            try {
                date = dateformat.parse(str.nextToken());
                // TODO
                // Cal afegir un objecte Magazine a la llista
                llistaRevistes.add(new Revista(id, titol, date));

            } catch (ParseException e) {
                System.err.println(" errada format data al fitxer");
                e.printStackTrace();
            }

        }
        br.close();

    }

    public ArrayList<Revista> readArticlesFile(String filename)
            throws IOException {
        int idArticle, idRevista, idAutor;
        String titol;
        Date data_creacio;
        boolean publicable;
        DateFormat dateformat = new SimpleDateFormat("YYYY-MM-DD");

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String linea = "";
        while ((linea = br.readLine()) != null) {
            StringTokenizer str = new StringTokenizer(linea, ",");
            idArticle = Integer.parseInt(str.nextToken());
            idRevista = Integer.parseInt(str.nextToken());
            idAutor = Integer.parseInt(str.nextToken());
            titol = str.nextToken();
            try {
                data_creacio = dateformat.parse(str.nextToken());
                publicable = Boolean.parseBoolean(str.nextToken());
                // System.out.println(idArticle + ", idrev" + idRevista + ", idaut" + idAutor + ", titol " + titol 	+ data_creacio);
                Article a = new Article(idArticle, titol, data_creacio, publicable,
                        llistaRevistes.get(idRevista-1),
                        llistaAutors.get(idAutor-1));
                //llistaAutors.get(idAutor-1).addArticle(a);
                llistaRevistes.get(idRevista-1).addArticle(a);
                /**
                 System.out.println(llistaRevistes.get(idRevista-1).toString());
                 for (int i = 0; i < llistaRevistes.get(idRevista-1).getArticles()
                 .size(); i++) {

                 System.out.println(llistaRevistes.get(idRevista-1)
                 .getArticle(i).toString());
                 System.out.println(llistaRevistes.get(idRevista-1).getArticle(i).getAutor().toString());

                 }

                // llistaAutors.add(new Autor(id, name, country, year, active));
            } catch (ParseException e) {

                e.printStackTrace();
            }

        }
        br.close();


        return llistaRevistes;
        // TODO
    }
                 **/
}
