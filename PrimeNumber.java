import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.: ");

        int Number = sc.nextInt();
        boolean isPrime = true;

        for(int i=2; i<Number; i++){
            if(Number%i==0){
                isPrime = false;
                break;
            }
        
        }

        if(isPrime){
            System.out.println(Number+" is a Prime number");
        }else{
            System.out.println(Number+" is Not a Prime number");
        }

        sc.close();
       

    }
}
