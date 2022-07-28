package com.bridglabz;

import java.io.File;

public class FileDelete {

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Java\\Test.txt");

            if (file.delete()) {
                System.out.println("File deleted");
            } else {
                System.out.println("File exists");
            }
        } catch (Exception e) {
            System.out.println("Error Checked");
        }
    }
}
