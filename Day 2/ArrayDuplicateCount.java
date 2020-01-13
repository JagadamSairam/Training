import java.util.*;
class Main{
    public static void main(String[] args){
int j,i,size;
int []arr;
Scanner s=new Scanner(System.in);
System.out.println("Enter Size of an array");
size=s.nextInt();
arr=new int[size];
//int[] numbers = new int[]{7,2,6,1,4,7,4,5,4,7,7,3,1};
for(i=0;i<size;i++)
arr[i]=Integer.parseInt(s.nextLine());

int temp = 0;
for (i=0; i < size; ++i) {
    for (j=1; j<(size-i); ++j) {
        if (arr[j-1] > arr[j]) {
            temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
        }
    }
}
int numDup = 0, dupCount = 0;
int previous = -1;
for (i=0; i<size; ++i) {
    if (arr[i] == previous) {
        ++numDup;
        if (numDup == 1)
            ++dupCount;
    }
    else {
        previous = arr[i];
        numDup = 0;
    }
}
System.out.println("\nNumber of duplicates values: " + dupCount);
}
}