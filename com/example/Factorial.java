
package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Change me.
 *
 * @author Jaydin Madore
 * @version 1.0
 * @since 2024-04-18
 */

// Factorial class
public final class Factorial {

    /** Private constructor to prevent instantiation. */
    private Factorial() {
        throw new UnsupportedOperationException("Cannot instantiate");
    }


    /**
     * This is the main method.
     *
     * @param args Unused
     */
    public static void main(final String[] args) {
        // List of file paths to output to.
        String outputFilePath = "output.txt";
        // List of file paths to read from.
        String readFilePath = "input.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(readFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            String line;
            while ((line = reader.readLine()) != null) {
                int inputNumber = Integer.parseInt(line.trim());
                //This calculates factorial
                int result = factorialCul(inputNumber);
                //This writes output to output.txt
                writer.write(inputNumber + "! = " + result + "\n");
            }
            reader.close();
            writer.close();

        } catch (IOException e) {
            System.err.println("Error reading/writing files: " + e.getMessage());
        }
    }

    private static int factorialCul (int n) {
        //The base case for the recursion function
        if (n == 1)
        //This wll return 1    
        return 1;
        else
            return n * factorialCul(n - 1);
        }
}
