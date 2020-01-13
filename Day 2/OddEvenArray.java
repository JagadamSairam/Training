/*6. Write a program in C to separate odd and even integers in separate arrays.
Test Data : 
Input the number of elements to be stored in the array :5 
Input 5 elements in the array : 
element - 0 : 25 
element - 1 : 47 
element - 2 : 42 
element - 3 : 56 
element - 4 : 32 
Expected Output : 
The Even elements are : 
42 56 32 
The Odd elements are : 
25 47*/





import java.util.*;
class OddEvenArray{
public static void main(String[] args){
int arr1[],earr[],oarr[],size,i,j=0,k=0,l,m;
Scanner s= new Scanner(System.in);
System.out.println("Enter the Size of an Array");
size= s.nextInt();

arr1=new int[size];

System.out.println("Enter Array Elements");

for(i=0;i<size;i++)
arr1[i]=s.nextInt();

for(i=0;i<size;i++)
if((arr1[i]%2) ==0)
j++;

k=size-j;
l=0;
m=0;
earr=new int[j];
oarr=new int[k];
for(i=0;i<size;i++){
if((arr1[i]%2)==0){
earr[l]=arr1[i];
l++;
}
else{
oarr[m]=arr1[i];
m++;
}
}
System.out.println("The Even Array is ");
for(i=0;i<j;i++)
System.out.print(earr[i]);

System.out.println("The Odd Array is \n");
for(i=0;i<k;i++)
System.out.print(oarr[i]);

}
}



