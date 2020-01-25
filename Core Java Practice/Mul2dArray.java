package com.array;

import java.util.Scanner;

public class Mul2dArray {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter The size of the matrices (n m)");
	int n1,m1,m2,n2,m,n,matrix1[][],matrix2[][],i,j,matrix[][],k;
	System.out.println("First Matrx");
	m1=s.nextInt();
	n1=s.nextInt();
	System.out.println("Second Matrix");
	m2=s.nextInt();
	n2=s.nextInt();

	
matrix1=new int[m1][n1];
matrix2= new int[m2][n2];
matrix= new int[m1][n2];
System.out.println("Enter Matrix one elements");
for(i=0;i<m1;i++) {
	for(j=0;j<n1;j++) {
		matrix1[i][j]=s.nextInt();
	}
}
System.out.println("Enter Matrix two elements");
for(i=0;i<m2;i++) {
	for(j=0;j<n2;j++) {
		matrix2[i][j]=s.nextInt();
	}
}

for(i=0;i<m1;i++) {
	for(j=0;j<n2;j++) {
		for(k=0;k<n1;k++) {
			if(n1==m2) {
				matrix[i][j]+=matrix1[i][k]*matrix2[k][j];
			}
		}
	}
}
System.out.print("The Resultant Matrix iss   \n ");
for(i=0;i<m1;i++) {
	for(j=0;j<n2;j++) {
			System.out.print(matrix[i][j]+" ");
	}
	System.out.println(" ");
}

}
}