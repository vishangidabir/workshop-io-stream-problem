package com.bridglabz;

import java.io.FileWriter;
import java.io.IOException;

public class FileModify {
    public static void main(String[] args) throws IOException {

        FileWriter filewriter = new FileWriter("C:\\Java\\Test.txt");

        filewriter.write("Good Morning Sir!");

        filewriter.append("\nWelcome to Bridgelabz!");

        filewriter.close();
    }

}
