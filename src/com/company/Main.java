package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{

//        Scanner console = new Scanner(System.in);
//        System.out.println("Input file: ");
//        String inputFileName = console.next();


        // Text File Input
        File inputFile = new File("C:\\Users\\AlanW\\Desktop\\P4\\input.txt");
        Scanner in = new Scanner(inputFile);

        while (in.hasNextDouble()) {
            double value = in.nextDouble();
//            Process value;
        }
        in.close();

        // Text File Output
        PrintWriter out = new PrintWriter("output.txt");
        out.println("Deze tekst is nieuw.");

        out.close();

        //Exception Handling
        int amount = 500;
        int balance = 400;

        if (amount > balance) {
            throw new IllegalArgumentException("Amount exceeds balance.");
        }
        balance = balance - amount;

        // Catching Exceptions
        try {
            //FileNotFoundException
            String filename = "w/e";
            Scanner inner = new Scanner(new File(filename));
            String inputs = inner.next();
            int values = Integer.parseInt(inputs);
        }
        catch (IOException e){
            //NoSuchElementException
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            // NumberFormatException
            System.out.println("Input was not a number");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            // General exception
            System.out.println(e.getMessage());
        }
        finally {
            //close
        }






    }
}
