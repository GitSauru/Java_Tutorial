public class MyCalculation extends Calculation {
    public void Multiplication(int a, int b){
        int c;
        c = a*b;
        System.out.println("Multiplication of a and b is: "+c);
    }

    public static void main(String[] args) {
        MyCalculation mc = new MyCalculation();
        mc.Addition(45, 88);
        mc.Subtraction(4987, 986);
        mc.Multiplication(55, 8);
    }
    
}
