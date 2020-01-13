/*7.Write a program in C to sort elements of array in ascending order.
Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 7 
element - 2 : 4 
element - 3 : 5 
element - 4 : 9 
Expected Output : 
Elements of array in sorted ascending order: 
2 4 5 7 9*/


import java.util.*;
class AscendingArray{
public static void main(String[] args){
int size,arr[],i,j;
Scanner s= new Scanner(System.in);
System.out.println("Enter the size of an array");
size=s.nextInt();
arr=new int[size];

System.out.println("enter array elements");
for(i=0;i<size;i++)
arr[i]=s.nextInt();


for(i=0;i<size;i++){
for(j=i+1;j<size;j++){
if(arr[i]>arr[j]){
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}

}

for(i=0;i<size;i++)
System.out.println(arr[i]);

}
}