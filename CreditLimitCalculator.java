import java.util.Scanner;
public class CreditLimitCalculator{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

System.out.print("Enter account number: ");
int accountNumber=input.nextInt();

System.out.print("Enter beginning balance: ");
int beginningBalance=input.nextInt();

System.out.println("Enter total of all items charged: ");
int charges=input.nextInt(); 

System.out.println("Enter total credits applied: ");
int creditApplied=input.nextInt();

System.out.println("Enter allowed credit limit: ");
int allowedCreditLimit=input.nextInt();

int newBalances= beginningBalance  + charges - credits;

System.out.println("new balance: " + newbalance);

if(newbalance > creditlimit){
System.out.println("you have exceeded your cridit limit");
}

else{
System.out.println("Exit Now");
}
}
}



