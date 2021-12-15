final class Vehicles {

  /**
  * Prevent instantiation
  * Throw an exception IllegalStateException.
  * if this ever is called
  *
  * @throws IllegalStateException
  *
  */
  private Vehicles() {
    throw new IllegalStateException("Cannot be initated.");
  }

  /**
  * The starting main() function.
  *
  * @param args Name of file containing a
  string of numbers.
  */
  public static void main(final String[] args) {
    Bike bike = new Bike();
    Truck truck = new Truck();
    System.out.println("Bike speed is now " + bike.accelerate());
    System.out.println("Truck speed is now " + truck.accelerate());
    System.out.println("The bike's bell goes " + bike.ringBell());
    System.out.println("The truck's horn goes " + truck.provideAir());
  }
}
