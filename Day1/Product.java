/*You have to write a Program that accepts the product name and quantity as input
   and displays the total price using the unit prices already stored in the system.*/



import java.util.*;
class Product{
public static void main(String[] args){
String pname;
int quantity,price;
Scanner s=new Scanner(System.in);
System.out.println("Products");
System.out.println("1.Banana 2.Apple 3.Grapes");
System.out.println("Enter the Product name");
pname=s.nextLine();
System.out.println("How Many quantities that you want ");
quantity=Integer.parseInt(s.nextLine());

if(pname.equals("Banana")){
price=quantity*10;
System.out.println("The Price is"+price+"rs/-");
}
else if(pname.equals("Apple")){
price=quantity*14;
System.out.println("The Price is"+price+"rs/-");
}
else if(pname.equals("Grapes")){
price=quantity*19;
System.out.println("The Price is"+price+"rs/-");
}
else
System.out.println("The Product Was Not available ");
}
}