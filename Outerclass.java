 abstract class AnonymousInnerClass {
    public abstract void display();

}

public class Outerclass {
public static void main(String[] args) {
    AnonymousInnerClass obj = new AnonymousInnerClass() {
        public void display(){
            System.out.println("Print the statement");
        }
    };
    obj.display();{
        
    }
}
    
}