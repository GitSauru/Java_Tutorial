 class SuperConstructor {
    String name;

    SuperConstructor(){
        System.out.println("This is super class constructor");
    }

    SuperConstructor(String name){
        this.name = name;
    }
}

public class SuperclassConstructor extends SuperConstructor{
           int eID;

           SuperclassConstructor(){
            super();
           }

           SuperclassConstructor(String name, int eID){
            super(name);
            this.eID = eID;
           }

           public void display(){
            System.out.println("Ename: "+name+" Eid: "+eID);
           }

           public static void main(String[] args) {
            SuperclassConstructor sp = new SuperclassConstructor();
            SuperclassConstructor sp1 = new SuperclassConstructor("Saurabh", 464);
            sp1.display();
           }
}
