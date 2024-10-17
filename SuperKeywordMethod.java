class SuperMethod{
    String name = "Saurabh";

    public void display(){
        System.out.println("My name is: "+name);
    }
}

public class SuperKeywordMethod extends SuperMethod {
    String name = "Monica";
    
    public void display(){
        System.out.println("Madam's name is: "+name);
        System.out.println("Again my name is: "+super.name);
    }

    public void finaldisplay(){
       super.display();
    }

    public static void main(String[] args) {
        SuperKeywordMethod sc = new SuperKeywordMethod();
            sc.display();
            sc.finaldisplay();
    }
}
