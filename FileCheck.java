package com.bridglabz;

import java.io.File;

public class FileCheck {

    public static void main(String[] args) {
        File file = new File("C:\\Java\\Test.txt");

        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File missing");
        }
    }
}

