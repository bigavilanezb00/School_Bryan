package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
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
    }
}
