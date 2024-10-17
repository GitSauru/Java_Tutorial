public class MethodOverloading {
    public void Addition(){
        int a=10; int b=20;
        System.out.println(a+b);
    }

    public void Addition(int a, int b){
        System.out.println(a+b);
    }

    //public void Addition() //This is not allowed as there is already one method with same parameter
    
    public int Addition(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.Addition();
        mo.Addition(5, 56);
        int abc = mo.Addition(55, 65, 33);
        System.out.println(abc);
    }
}
