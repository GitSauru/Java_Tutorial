import java.util.Scanner;

public class InputUser {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter first number: ");
        // int firstNumber = sc.nextInt();

        // System.out.print("Enter second number: ");
        // int secondNumber = sc.nextInt();

        // int addition = firstNumber + secondNumber;

        // System.out.println("Addition of numbers is : "+ addition);


        String lines = sc.nextLine();

        System.out.println(lines);

        System.out.print("Enter index number: ");
        int indexNumber = sc.nextInt();
        
        char output = lines.charAt(indexNumber);

        System.out.println(output);


        sc.close();
    }
}
