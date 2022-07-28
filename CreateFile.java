package com.bridglabz;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Java\\Test.txt");

            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File exists");
            }
        } catch (Exception e) {
            System.out.println("Error Checked");
        }
    }
}
