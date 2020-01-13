/*8. Write a program in C to find the second largest element in an array.
Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 9 
element - 2 : 1 
element - 3 : 4 
element - 4 : 6 
Expected Output : 
The Second largest element in the array is : 6 */


import java.util.*;
class SecondLargestArray{
public static void main(String[] args){
int size, arr[],i,j,max,smax=0;

Scanner s=new Scanner(System.in);
System.out.println("Enter Size");
size=s.nextInt();

arr=new int[size];
System.out.println("Enter ArrayValues");
for(i=0;i<size;i++)
arr[i]=s.nextInt();

max=arr[0];

for(i=1;i<size;i++)
if(arr[i]>max)
max=arr[i];

int min=arr[0];


for(i=0;i<size;i++)
if(arr[i]>min&& arr[i]<max)
smax=arr[i];

//System.out.println(max);
System.out.println(smax);
}
}
