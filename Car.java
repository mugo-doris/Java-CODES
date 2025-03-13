//NAME : Doris Nduta
//REG NO : CT101/G/21006/23
//DATE : 14/03/2025
//ASSIGNMENT: 4 

// Car class demonstrating encapsulation
public class Car {
  // Private fields to enforce encapsulation
  private String licensePlate;
  private boolean isRented;

  //Constructor to initialize the license plate and set the car as available
  public Car(String licensePlate) {
      this.licensePlate = licensePlate;
      this.isRented = false; // Car is available initially
  }

  // Public method to rent the car (only if available)
  public void rentCar() {
      if (!isRented) {
          isRented = true;
          System.out.println("Car with license plate " + licensePlate + " has been rented.");
      } else {
          System.out.println("Car with license plate " + licensePlate + " is already rented.");
      }
  }

  // Public method to return the car (make it available again)
  public void returnCar() {
      if (isRented) {
          isRented = false;
          System.out.println("Car with license plate " + licensePlate + " has been returned.");
      } else {
          System.out.println("Car with license plate " + licensePlate + " was not rented.");
      }
  }

  // Getter method to check if the car is rented
  public boolean isRented() {
      return isRented;
  }

  // Main method to demonstrate functionality
  public static void main(String[] args) {
      // Creating a Car object
      Car myCar = new Car("KDK 238H");

      // Renting the car
      myCar.rentCar(); // Expected: Car gets rented

      // Trying to rent the same car again
      myCar.rentCar(); // Expected: Car is already rented

      // Returning the car
      myCar.returnCar(); // Expected: Car gets returned

      // Checking if the car is rented
      System.out.println("Is the car rented? " + myCar.isRented()); // Expected: false
  }
}
