package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileAccessor fileAccessor = new FileAccessor();

        try {
            fileAccessor.readTeachersFile("teachers.txt");
            fileAccessor.printTeachers();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
