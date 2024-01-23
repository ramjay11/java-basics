package com.ramjava.java.basique.test2;

import java.util.Scanner;

public class DiagonalMatrix {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // Get the number of rows and columns for the matrix
        System.out.print("Enter the number of rows for the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the matrix: ");
        int columns = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[rows][columns];

        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Display the diagonal elements
        System.out.println("Diagonal Elements:");
        displayDiagonalElements(matrix);

        scanner.close();
    }

    // Method to display the elements of the matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    // Method to display the diagonal elements of the matrix
    private static void displayDiagonalElements(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        if (rows != columns) {
            System.out.println("Matrix is not square, so it doesn't have diagonal elements.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }
}

