package com.array.program;

public class Program9 {
	public static void transposeMatrix(int arr[][]) {
		
		
		int transpose[][] = new int[3][2];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				transpose[i][j] = arr[j][i];
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(transpose[i][j]+" ");

			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = { { 2, 4, 8 }, { 3, 6, 9 } };
		transposeMatrix(arr1);
	}


	}


