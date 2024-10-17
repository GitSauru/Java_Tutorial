public class ExtendedAbstractClass extends AbstractClass {
    ExtendedAbstractClass(String eName, String eAddress, int eID){
        super(eName, eAddress, eID);
    }

    public void jobrole(){
        System.out.println("This is an abstract method");
    }

    public static void main(String[] args) {
        ExtendedAbstractClass eb = new ExtendedAbstractClass("Monica", "Pune", 464);
        eb.jobrole();
        eb.department();
        eb.printemployeedetails();
    }
}
