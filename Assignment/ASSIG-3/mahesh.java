class Vehicle {
    // STATIC: Shared by all instances of Vehicle
    static int totalVehicles = 0;    
    // FINAL: Value cannot be changed after initialization (Constant)
    final String brand;

    // Parent Constructor
    Vehicle(String brand) {
        this.brand = brand;
        totalVehicles++; // Updates the shared static counter
    }

    // FINAL METHOD: Subclasses cannot override this method
    final void showBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }

    void honk() {
        System.out.println("Beep beep!");
    }
}

// Child Class
class Car extends Vehicle {
    int maxSpeed;

    Car(String brand, int maxSpeed) {
        // SUPER: Invokes the parent class constructor
        super(brand); 
        this.maxSpeed = maxSpeed;
    }

    @Override
    void honk() {
        // SUPER: Calls the parent's honk() method before adding its own behavior
        super.honk(); 
        System.out.println("Vroom vroom!");
    }
}

// Main Driver Class

public class mahesh {
    class Vehicle {
    // STATIC: Shared by all instances of Vehicle
    static int totalVehicles = 0;    
    // FINAL: Value cannot be changed after initialization (Constant)
    final String brand;

    // Parent Constructor
    Vehicle(String brand) {
        this.brand = brand;
        totalVehicles++; // Updates the shared static counter
    }

    // FINAL METHOD: Subclasses cannot override this method
    final void showBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }

    void honk() {
        System.out.println("Beep beep!");
    }
}

// Child Class
class Car extends Vehicle {
    int maxSpeed;

    Car(String brand, int maxSpeed) {
        // SUPER: Invokes the parent class constructor
        super(brand); 
        this.maxSpeed = maxSpeed;
    }

    @Override
    void honk() {
        // SUPER: Calls the parent's honk() method before adding its own behavior
        super.honk(); 
        System.out.println("Vroom vroom!");
    }
}

// Main Driver Class

}
