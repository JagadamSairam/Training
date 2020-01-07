
 /*Write a Program to accept the age of the user and then, display the category of the
   user. Based on the age, the categories of the users are:
	05-12 Children
	13-19 Teenagers
	20-35 Young adults
	36-45 Mature adults
	46-55 Elders
	56 and above Seniors
	*/



import java.util.*;
class Age{
public static void main(String[] args){
int age;
Scanner s= new Scanner(System.in);
System.out.prinlnt("Enter Age");
age=s.nextInt();
if(age>=5 && age<=12)
System.out.println("Children");
else if(age>=13 && age<=19)
System.out.println("Teenegers");
else if(age>=20 && age<=35)
System.out.println("Young Elders");
else if(age>=536 && age<=45)
System.out.println("Mature Elders");
else if(age>=46 && age<=55)
System.out.println("Elders");
else
System.out.println("Seniors");
}
}
