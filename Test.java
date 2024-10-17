class Personclass {
    public void display(){
        System.out.println("Person class");
    }
}

    class Student extends Personclass{
        public void display(){
            System.out.println("I am now a student");
        }
    }

    class Employeeclass extends Student{
        public void display(){
            System.out.println("I am now an Employee");
        }
    }

    public class Test {
    
        public static void main(String[] args) {
            Personclass p = new Student();
            p.display();
            Personclass s = new Student();
            s.display();
            Student e = new Employeeclass();
            e.display();
        }
    }


