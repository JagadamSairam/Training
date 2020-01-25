package com.array;
import java.util.*;
public class Add2dArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter The size of the matrices (n m)");
		int n,m,matrix1[][],matrix2[][],i,j,matrix[][];
		
		n=s.nextInt();
		m=s.nextInt();
		
	matrix1=new int[m][n];
	matrix2= new int[m][n];
	matrix= new int[m][n];
	System.out.println("Enter Matrix one elements");
	for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
			matrix1[i][j]=s.nextInt();
		}
	}
	System.out.println("Enter Matrix two elements");
	for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
			matrix2[i][j]=s.nextInt();
		}
	}
	
	for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
			matrix[i][j]=matrix1[i][j]+matrix2[i][j];
		}
	}
	System.out.println("The Resultant Matrixis ");
	for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
			System.out.print(matrix[i][j]+"   ");
		}
		System.out.println(" ");
	}

	}

}
