import java.util.*;
class SortingString{
public static void main(String[] args){
String names[]={"neena","meeta","geeta","reena","Seeta"};
int i,j;
for(i=0;i<(names.length)-1;i++){
int min=i;
for(j=i+1;j<(names.length);j++){
if(names[j].toLowerCase().compareTo(names[min].toLowerCase())<0)
min=j;
String temp=names[i];
names[i]=names[j];
names[j]=temp;
}
for(int k=0;k<names.length;k++)
System.out.print(names[k]+" ");
System.out.println("\n");
}

}
}