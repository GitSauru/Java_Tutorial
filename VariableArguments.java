public class VariableArguments {
    static void display(String... values){
     System.out.println();
     for(String s: values){
        System.out.println(s+ " ");
     }
    }

    public static void main(String[] args) {
        display();
        display("Saurabh", "Monica", "Sharvary");
        display("Hey, How r u?", "Ding Dong", "Let's do it", "We r done");
    }

    // static void display(int... values){
    //     System.out.println("display method");
    //     for(int i: values){
    //         System.out.println(i);
    //     }

    // }

    // public static void main(String[] args) {
    //     display();
    //     display(2,3,4);
    //     display(105,106,540);
    // }
}



