package package1;

public class Car {
    public static final String color = "Black";
    int mileage = 20;
    
    protected void display(){
          System.out.println("Color: "+color+", mileage: "+mileage);
    }

    public void ownerdetails(){
        System.out.println("This car is brought by: ");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }

}
