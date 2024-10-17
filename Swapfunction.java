public class Swapfunction {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping, a:"+a+" and b: "+b);
        swapFunction(a,b);
    }

    public static void swapFunction(int n1, int n2){
        int n3=n1;
        n1=n2;
        n2=n3;
        System.out.println("Values after swapping of a: "+n1+" and b:"+n2);
    }
}