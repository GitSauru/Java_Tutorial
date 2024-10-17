public class MethodLocalOuterClass {
   
    int num=10;

    public void OuterClass(){
      class Innerclass {
           public void display(){
            System.out.println("This is Method local outer class example "+ num);
           }
      }
        Innerclass demo = new Innerclass();
        demo.display();
    }
    public static void main(String[] args) {
        MethodLocalOuterClass obj = new MethodLocalOuterClass();
        obj.OuterClass();
    }
   
}
