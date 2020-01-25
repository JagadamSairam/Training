package com.array;
import java.util.*;
public class TransposeMatrix {
 public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int matrix[][],tmatrix[][],row,col,i,j;
	System.out.println("Enter Number Of Rows and Columns for a matrix");
	row=s.nextInt();
	col=s.nextInt();
	matrix=new int[row][col];
	System.out.println("Enter Matrix Elements");
	for(i=0;i<row;i++) {
		for(j=0;j<col;j++) {
		matrix[i][j]=s.nextInt();
		}
	}
	tmatrix=new int[col][row];
	for(i=0;i<row;i++)
		for(j=0;j<col;j++)
			tmatrix[j][i]=matrix[i][j];

	for(i=0;i<row;i++) {
		for(j=0;j<col;j++) {
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println("");
	}
	System.out.println("The Transpose Matrix is ");
	for(i=0;i<col;i++)
	{
		for(j=0;j<row;j++) {
			System.out.print(tmatrix[i][j]+" ");
		}
		System.out.println(" ");
	}
 
 }
}
