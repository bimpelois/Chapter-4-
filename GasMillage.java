import java.util.Scanner;
public class GasMillage{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number of travels: ");

int tripNumber = input.nextInt();

int counter = 1;
double sumOfMilesPerGallon = 0;

while (counter <= tripNumber){

System.out.println("Enter miles driven: ");
int milesDriven = input.nextInt();

System.out.println("Enter gallons of fuel used: ");
int gallons = input.nextInt();

double milesPerGallon = (double) milesDriven/gallons;

System.out.printf("The miles per gallon for trip %d is %.2f%n", counter, milesPerGallon);

sumOfMilesPerGallon += milesPerGallon;

counter++;

 }
     }
          
         }

