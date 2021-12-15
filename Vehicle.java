public class Vehicle {

  /**
  * The starting speed of the car.
  */
  private int speed = 0;

  /**
  * The empty color string.
  */
  private final String color;

  /**
  * The max speed of the car.
  */
  private final int maxSpeed = 100;

  /**
  * The value used for the change in speed during accelerate method.
  */
  private final int speedChange = 5;

  /**
  * The no arguments given vehicle constructor.
  */
  public Vehicle() {
    color = "red";
  }

  /**
  * The arguments given vehicle constructor.
  *
  * @param colour the color of the vehicle.
  */
  public Vehicle(final String colour) {
    color = colour;
  }

  /**
  * The Accelerate method.
  *
  * @return car speed after accelerating.
  */
  public int accelerate() {
    speed += speedChange;
    if (speed > maxSpeed) {
      return -1;
    } else {
      return speed;
    }
  }

  /**
  * The Brake method.
  *
  * @return car speed after braking.
  */
  public int brake() {
    speed = 0;
    return speed;
  }
}
