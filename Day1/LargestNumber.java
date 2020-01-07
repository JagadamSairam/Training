/* Write a Program to accept three numbers and to display the largest of the three numbers.
*/



import java.util.*;
class LargestNumber{
public static void main(String[] args){
int num1,num2,num3;
Scanner s= new Scanner(System.in);
System.out.println("Enter Three numbers");
num1=s.nextInt();
num2=s.nextInt();
num3=s.nextInt();
if((num1>num2) && (num1>num3)){
System.out.println("Num 1 is Largest Number");
}
else if((num2>num1) && (num2>num3)){
System.out.println("Num 2 is Largest");
}
else System.out.println("Number 3 is largest");
}
}