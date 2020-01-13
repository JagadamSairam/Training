/*Problem Statement
The management of LearnMore University is planning to automate the University management system. Therefore, Steve Wilkinson, the programmer, has decided to create a Java program that accepts the student details, such as the first name, last name, age, course enrolled, and student ID. In addition, he also needs to accept the employee details, such as first name, last name, age, salary, department name, designation, and employee ID. Steve must ensure the reusability of code. The program must offer a choice to accept either the student's or employee's details. Help Steve to develop the program.*/



import java.util.*;
class Both{
public static void main(String[] args){
int num;
Scanner sc=new Scanner(System.in);
Student st=new Student();
Employee emp=new Employee();
System.out.println("What Do u want 1.Student 2.Employee Details");
num=sc.nextInt();
switch(num){
case 1:
st.getStudentDetails();
st.display();
break;
case 2:
emp.getEmployeeDetails();
emp.display();
break;
default:
System.out.println("There are no other than this");
}
}
}

class Student{
String fname,lname,course;
int age,id;
public void getStudentDetails(){
Scanner s=new Scanner(System.in);
System.out.println("Enter Student details");
System.out.println("Enter Student firstname");
fname=s.nextLine();
System.out.println("Enter Student lastname");
lname=s.nextLine();
System.out.println("Enter Student age");
age=Integer.parseInt(s.nextLine());
System.out.println("Enter Student id");
id=Integer.parseInt(s.nextLine());
System.out.println("Enter Student course");
course=s.nextLine();
}


public void display(){
System.out.println("name "+fname+""+lname+""+"\nAge is "+age+"\nid is"+id+"\n course is "+course); 
}

}

class Employee extends Student{
String efname,elname,department,designation;
int empage,empid;
float salary;

public void getEmployeeDetails(){

Scanner s=new Scanner(System.in);
System.out.println("Enter Employee details");
System.out.println("Enter Employee first name");
efname=s.nextLine();
System.out.println("Enter Employee last name");
elname=s.nextLine();
System.out.println("Enter Employee id");
empid=Integer.parseInt(s.nextLine());
System.out.println("Enter Employee age");
empage=Integer.parseInt(s.nextLine());
System.out.println("Enter Employee department");
department=s.nextLine();

System.out.println("Enter Employee designation");
designation=s.nextLine();
System.out.println("Enter Employeesalary");
}
public void display(){
System.out.println("name is "+efname+""+elname+""+"\nAge is "+empage+"\nid is"+empid+"\n Department is "+department+"\nDesignation was"+designation+"\nsalary was"+salary); 
}

}
