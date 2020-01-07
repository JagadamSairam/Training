
/*Consider an example, where the discount percentage on a TV needs to be decided
   on the basis of the type of TV. If the TV is CRT (C), the discount will be 5% of the
   selling price (SP). If the TV is LCD (L), then the discount will depend on the size of
   the TV screen. For 14 inches screen, the discount is 8% of the SP. For 21 inches
   screen, the discount is 10% of the SP*/



import java.util.*;
class Telivision{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
char type,c,C,l,L;
float sp,csp,lsp;
int inches;
System.out.println("Enter the Type of Tv     CRT(c)   LCD(l)");
type=s.next().charAt(0);
System.out.println("Enter the Selling Price of the TV");
sp=s.nextFloat();
//if((type.equals("c")) || (type.equals("C"))){
if((type=='c') || (type=='C')){
csp=sp-((5*sp)/100);
System.out.println("The Selling Price After Discount is " + csp);
}

//if((type.equals("l")) || (type.equals("L"))){

if((type=='L') || (type=='l')){
System.out.println("Enter How many inchges of that TV:");
inches=s.nextInt();
if(inches==14){
lsp=sp-((8*sp)/100);
}
else if(inches==21)
{
lsp=sp-((10*sp)/100);
}
else
System.out.println("We Have Only !4 and 21 inches Tvs Only");
}
}
}
