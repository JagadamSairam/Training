/*5. Write a program in C to find the maximum and minimum element in an array. 
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 45 
element - 1 : 25 
element - 2 : 21 
Expected Output : 
Maximum element is : 45 
Minimum element is : 21 */



import java.util.*;
class MinimumMaximumArray{
public static void main(String[] args){
int min,max,size,arr[],i;
Scanner s=new Scanner(System.in);
System.out.println("Enter Size of an Array");
size=s.nextInt();
arr=new int[size];
System.out.println("Enter array values");
for(i=0;i<size;i++)
arr[i]=s.nextInt();

min=arr[0];

for(i=1;i<size;i++)
if(arr[i]<=min)
min=arr[i];

max=arr[0];

for(i=1;i<size;i++)
if(arr[i]>=max)
max=arr[i];


System.out.println("Minimum vakue is "+min);
System.out.println("Maximum vakue is "+max);
}
}
