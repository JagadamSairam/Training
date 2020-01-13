/*1.Write a program in C to read n number of values in an array and display it in reverse order
Test Data : 
Input the number of elements to store in the array :3 
Input 3 number of elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 7
Expected Output : 
The values store into the array are : 
2 5 7 
The values store into the array in reverse are : 
7 5 2 */



import java.util.*;
class ArrayReverse{
public static void main(String[] args){
int size,i,j;
int []arr;
Scanner s= new Scanner(System.in);
System.out.println("Enter the Size of an array");
size=s.nextInt();
System.out.println("Enter the Array Elements");
arr=new int[size];
for(i=0;i<size;i++)
arr[i]=s.nextInt();


for(i=size-1;i>=0;i--){
System.out.println(arr[i]);
}
}
}

