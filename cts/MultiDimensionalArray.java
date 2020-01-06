import java.util.*;
class MultiDimensionalArray{
public static void main(String[] args){
int i,j,k=0;
int arr[][] = new int[10][];
arr[0]=new int[10];
arr[1]=new int[10];
arr[2]=new int[10];
arr[3]=new int[10];
arr[4]=new int[10];
arr[5]=new int[10];
arr[6]=new int[10];
arr[7]=new int[10];
arr[8]=new int[10];
arr[9]=new int[10];

Scanner s= new Scanner(System.in);


for(i=0;i<10;i++){
for(j=0;j<10;j++){
arr[1][j]=k;
k++;
}
}

for(i=0;i<10;i++){
for(j=0;j<10;j++){
System.out.println(arr[i][j]);
}
}

}

}