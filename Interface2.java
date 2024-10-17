public class Interface2 implements Interface{
    public void department(){
        System.out.println("This is Interface");
    }
    public void jobrole(){
        System.out.println("Job role");
    }

    public static void main(String[] args) {
        Interface2 IF = new Interface2();
        IF.department();
        IF.jobrole();
    }
}
