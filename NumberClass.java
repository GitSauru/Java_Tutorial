public class NumberClass {
    public static void main(String[] args) {
        Integer x = 10;
        Integer y = 15;
        Double d = 2.01;
        Float f = 90.15f;

        System.out.println(x);
        System.out.println(x.equals(y));
        System.out.println(x.compareTo(10));
        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(f));
        System.out.println(Math.min(x, y));
        System.out.println(Math.random());
        System.out.printf("The value of e is %.2f", Math.E);
    }
}
