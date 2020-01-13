/*3. Write a program in C to copy the elements of one array into another array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 15 
element - 1 : 10 
element - 2 : 12 
Expected Output : 
The elements stored in the first array are : 
15 10 12 
The elements copied into the second array are : 
15 10 12 */


import java.util.*;
class ArrayCopy{
public static void main(String[] args){
int size,arr1[],arr2[],i,j;
Scanner s= new Scanner(System.in);
System.out.println("Enter the size of an array");
size=s.nextInt();
arr1=new int[size];
arr2=new int[size];
System.out.println("Enter Array values");
for(i=0;i<size;i++)
arr1[i]=s.nextInt();

j=0;

for(i=0;i<size;i++){
arr2[j]=arr1[i];
j++;
}
for(i=0;i<size;i++)
System.out.print(arr2[i]);

System.out.println("");
for(i=0;i<size;i++)
System.out.print(arr1[i]);
}
}