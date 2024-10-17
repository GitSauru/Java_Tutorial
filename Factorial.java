import java.util.Scanner;

public class Factorial {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to calculate factorial: ");

        int x = sc.nextInt();

        int result = fact(x);
        System.out.println("Factorial = "+result);

    }

    public static int fact(int a){//0
       if(a > 0){
        return a * fact(a -1);//5*4*3*2*1*1
       }else{
        return 1;
       }
    }

    
}
