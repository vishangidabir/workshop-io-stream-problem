package com.bridglabz;

import java.io.File;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {

        try{
            File file = new File("C:\\Java\\Test.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error cleared");
        }
    }
}
