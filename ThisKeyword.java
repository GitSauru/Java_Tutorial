public class ThisKeyword {
    int num = 10;

    ThisKeyword(){
      System.out.println("Default Constructor");
    }

    ThisKeyword(int num){
        //Invoking the default constructor
        this();
        this.num=num;
    }

    public void greet(){
        System.out.println("Public class example");
    }

    public void print(){
        int num=20;
        System.out.println("Local variable: "+num);
        System.out.println("Instance variable: "+this.num);
    }

    public static void main(String[] args) {
        ThisKeyword obj1 = new ThisKeyword();
        obj1.greet();
        ThisKeyword obj2 = new ThisKeyword(30);
        obj2.print();
    }
}
