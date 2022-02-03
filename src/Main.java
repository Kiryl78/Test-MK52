import java.util.Scanner;

public class Main {
       public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
           Calculator calculator = new Calculator();

           int FirstArg;
           System.out.print("MK 52^ Input first operand: ");
           FirstArg = scanner.nextInt();

           char operation;
           do {
               System.out.print("Input operation ");
               operation = scanner.next().charAt(0);
           } while (calculator.areYouIdiotOperation(operation));

           int NextArg;
           do {
               System.out.print("Input next operand: ");
               NextArg = scanner.nextInt();
           } while (calculator.areYouIdiotOperand(NextArg, operation));

           int Result;
           Result = calculator.operation(FirstArg, NextArg, operation);
           System.out.print("MK52: Here we go (rounded): ");
           System.out.println(Result);
       }
}
