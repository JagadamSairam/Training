/*2. Write a program in C to find the sum of all elements of the array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 8 
Expected Output : 
Sum of all elements stored in the array is : 15 */



import java.util.*;
class ArraySum{
public static void main(String[] args){
int size,arr[],i,sum=0;
Scanner s= new Scanner(System.in);
System.out.println("Enter the Size of an array ");

size=s.nextInt();
arr=new int[size];
System.out.println("Enter Array values");
for(i=0;i<size;i++)
arr[i]=s.nextInt();

for(i=0;i<size;i++){
sum+=arr[i];
}
System.out.println("The Sum is "+ sum);

}
}