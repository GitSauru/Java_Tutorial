public class InstanceVariable {
   int c;

public void addition() {
    int a = 10;
    int b = 20;
    c = a+b;
    System.out.println("a+b="+c);
}

public void subtraction() {
    int a = 20;
    int b = 10;
    c = a-b;
    System.out.println("a-b="+c);
}
public static void main(String[] args) {
    InstanceVariable ins = new InstanceVariable();
    ins.addition();
    ins.subtraction();
}
}
