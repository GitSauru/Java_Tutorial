 class Outer_Demo {
    // Private inner class
    private class InnerOuter_Demo {
        // Non-static method
        public void Print() {
            System.out.println("This is Inner Class demo");
        }
    }

    // Method to create an instance of the inner class and call its method
    public void display_inner() {
        InnerOuter_Demo inner = new InnerOuter_Demo();
        inner.Print();
    }
}

// Separate public class with the main method
 public class InnerClass {
    public static void main(String[] args) {
        Outer_Demo demo = new Outer_Demo();
        demo.display_inner();
    }
}

