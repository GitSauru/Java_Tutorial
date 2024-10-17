public abstract class AbstractClass {

    String eName;
    String eAddress;
    int eID;

    AbstractClass(String eName, String eAddress, int eID){
        this.eName = eName;
        this.eAddress = eAddress;
        this.eID = eID;
    }

    public void department(){
        System.out.println("This employee is working for L&D department");
    }
    
    public abstract void jobrole();

    public void printemployeedetails(){
        System.out.println("Name: "+eName);
        System.out.println("Address: "+eAddress);
        System.out.println("Employye id: "+eID);
    }

    
}  
