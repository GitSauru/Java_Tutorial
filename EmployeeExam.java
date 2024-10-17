class Name{
 String Firstname;
 String Middlename;
 String Lastname;

    public Name(String fname, String mname, String lname){
        this.Firstname = fname;
        this.Middlename = mname;    
        this.Lastname = lname;
    }
}

public class EmployeeExam { 
    public static void main(String[] args) {
        
        Name n = new Name("Saurabh", "Ganesh", "Kale");
        Name n1  = new Name("Uttam", "Kumar", "Singh");

        EmployeeDisplay ex = new EmployeeDisplay(25,n);
        ex.display();

        EmployeeDisplay ex1 = new EmployeeDisplay(27,n1);
        ex1.display();
       
    }
    
    
}

 class EmployeeDisplay {
    int a;
    Name n;

    EmployeeDisplay(int age, Name name){
        a = age;
        n = name;
    }

    public void display(){
        System.out.println("Age: "+a);
        System.out.println("Full name: "+n.Firstname+" "+n.Middlename+" "+n.Lastname);
    }

}
