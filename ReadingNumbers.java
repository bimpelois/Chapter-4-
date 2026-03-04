import java.util.Scanner;
public class ReadingNumbers{
public static void main(String[]args){
Scanner input= new Scanner(System.in);
System.out.print("Enter integers");
int number=input.nextInt();

int sum=0;
while (sum < number){
      System.out.print("Enter value");
      int value = input.nextInt();
      sum = sum + value;
      System.out.println("Initial sum: " + sum);
        }
System.out.println("total sum");
}
}


//int sum=0;
//while(number>=value){
//    
//    sum= value + number;
//System.out.println("")
//}
//
