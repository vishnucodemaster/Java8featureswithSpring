package DefaultandStatic;


//The most common use of interface default methods is to incrementally provide additional functionality to a given type without
//breaking down the implementing classes.
public interface Vehicle {
    
    String getBrand();
    
    String speedUp();
    
    String slowDown();
    
    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }
    
    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }
}

class Car implements Vehicle {

    private String brand;
    
    public Car(String string) {
		// TODO Auto-generated constructor stub
	}

	// constructors/getters
    
    @Override
    public String getBrand() {
        return brand;
    }
    
    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }
    
    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }
    
    public static void main(String[] args) { 
        Vehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
    }
    //allow us to add new methods to an interface that are automatically available in the implementations. 
    //Therefore, we don't need to modify the implementing classes.Here turnalarmon and off is the eg.
}

