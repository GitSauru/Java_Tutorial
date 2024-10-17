public class StaticNestedClass {
    private static class InnerStaticNestedClass {
    
        public void display(){
            System.out.println("Inner Nested Class example");
        }
    }
    public static void main(String[] args) {
        StaticNestedClass.InnerStaticNestedClass obj = new StaticNestedClass.InnerStaticNestedClass();
        obj.display();
}
    }
    
