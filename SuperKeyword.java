class Person{
    String name = "Saurabh";
}


public class SuperKeyword extends Person {
    String name = "Monica";

    public void display(){
        System.out.println("My name is: "+super.name);
        System.out.println("Madam's name is: "+name);
    }

    public static void main(String[] args) {
        SuperKeyword SC = new SuperKeyword();
        SC.display();
    }
}



