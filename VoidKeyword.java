public class VoidKeyword {
    public static void Rankings(){
        int rank = 100;
        if (rank<=100) {
            System.out.println("A+");
        }
        else if (rank<=80) {
            System.out.println("B");
        }
        else if (rank<=70) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
    public static void main(String[] args) {
        Rankings();
    }
}
