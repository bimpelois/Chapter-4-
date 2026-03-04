import java.util.Scanner;
public class RightAngleTriangle{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter integer (1 to 10): ");
int value = input.nextInt();

if(value>=1||value<=10){
System.out.print("value are between 1 to 10:" );
}
else{

for(int number=1; number<=value; number++){
    for(int count=1; count<=number; count++){

System.out.print("*");
}
System.out.println();
}
}
}
}
