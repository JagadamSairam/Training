/*
Write a Program that accepts the length and breadth of a
   rectangle and displays its area and perimeter*/



import java.util.*;

class AreaPerimeter{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int area,perimeter,length,breadth;
System.out.println("Enter the length");
length=s.nextInt();
System.out.println("Enter the breadth");
breadth=s.nextInt();
area=length*breadth;
perimeter=2*(length+breadth);
System.out.println("Area is "+ area);
System.out.println("Perimeter is "+ perimeter);
}
}

