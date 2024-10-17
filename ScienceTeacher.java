interface Person {}

class Employee implements Person {}

public class ScienceTeacher extends Employee {

    public static void main(String[] args) {
        Employee e = new Employee();
        ScienceTeacher sc = new ScienceTeacher();

        System.out.println(e instanceof Person);
        System.out.println(sc instanceof Employee);
        System.out.println(sc instanceof Person);
    }
}
