 /*Consider a scenario where all candidates have to take two tests before appearing for an
   interview. A candidate is selected for the interview round, based on the scores of the two
   tests. The individual score in each test should be greater than 75, and the average
   score for the two tests should be a minimum of 80. A call letter for the interview is to
   be sent to candidates who have been selected, and a rejection letter is to be sent to
   the rest*/


import java.util.*;
class Interview{
public static void main(String[] args){
int round1,round2;
Scanner s=new Scanner(System.in);
System.out.println("Enter the Round 1 marks");
round1=s.nextInt();
System.out.println("Enter the round 2 marks");
round2=s.nextInt();
if((round1>75) && (round2>75))
{
if(((round1+round2)/2)>=80){
System.out.println("You are Selected");
}
else
System.out.println("You are rejected");
}
else
System.out.println("You are rejected");
}
}
