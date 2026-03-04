import java.util.Scanner;
public class SalesCalculator{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

double totalSales = 0;
double itemValue;

System.out.print("Enter item value: ");
itemValue = input.nextDouble();

while (itemValue != -1) {

totalSales += itemValue;

System.out.print("Enter item value: ");
itemValue = input.nextDouble();
}

double earnings = 200 + (0.09 * totalSales);

System.out.println("\nTotal sales: $" + totalSales);
System.out.println("Total earnings: $" + earnings);

       
}
}
//mValue = input.nextDouble();
//}
//
//double earnings = 200 + (0.09 * totalSales);
//
//System.out.println("\nTotal sales: $" + totalSales);
//System.out.println("Total earnings: $" + earnings);
//
//    }
//}
