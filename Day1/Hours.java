
/*Write a Program to accept hours and number of resources and display the total
   number of productive hours. (Total number of productive hours = hours * number of
   resources)*/

import java.util.*;
class Hours{
public static void main(String[] args){
int hours,resorces,total;
Scanner s= new Scanner(System.in);
System.out.println("Enter Hours");
hours= s.nextInt();
System.out.println("Enter No of Resources");
resorces=s.nextInt();
total=hours*resorces;
System.out.println("Thge Total no of hours is "+ total);
}
}
