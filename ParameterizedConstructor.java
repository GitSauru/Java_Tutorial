public class ParameterizedConstructor {
    
    int x;

    ParameterizedConstructor(int i){
        int x = i;
        System.out.println("The value of x is: "+x);
    }

    public static void main(String[] args) {
        ParameterizedConstructor C = new ParameterizedConstructor(10);
        ParameterizedConstructor C2 = new ParameterizedConstructor(20);
    }
}
