package com.sun;

import java.util.Scanner;

public class ArrayTestCodes {

	public static void main(String[] args) {

		// Filling array from keyboard

		int[][] matrix = new int[2][3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextInt();
			}
		}
		

		// Printing array

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print("  " + matrix[row][column]);
			}
			System.out.println("\n");

		}

		// Summing all elements

		int total = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				total += matrix[row][column];
			}
		}
		System.out.println("Total of samming all elements is " + total + "\n");

		// Summing elements by column

		for (int column = 0; column < matrix[0].length; column++) {
			int total2 = 0;
			for (int row = 0; row < matrix.length; row++)
				total2 += matrix[row][column];
			System.out.println("Sum for column " + column + " is " + total2);
		}

		// System.out.println("\nEnter an element to search ");
		// int key = input.nextInt();
		// int [] matrix2 = new int [3];
		// for(int i=0 ; i<matrix2.length ; i++)
		// {
		// matrix2[i] = matrix[0][i];
		// }
		// int binary = binarySearch(matrix2, key);
		
		input.close();


	}

	// Binary Search for one dimensional array

	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -1 - low;
	}

}
