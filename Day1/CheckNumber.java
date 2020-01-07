
/*Write a Program that accepts a number and checks whether it's positive, negative, or
   zero*/

import java.util.*;

class CheckNumber{
public static void main(String[] args){
int num;
Scanner s=new Scanner(System.in);
System.out.println("Enter any Number");
num=s.nextInt();
if(num>0)
System.out.println("Positive Number");
else if(num==0)
System.out.println("Zero");
else
System.out.println("Negative Number");
}
}