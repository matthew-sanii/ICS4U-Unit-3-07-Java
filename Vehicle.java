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
  private final int maxSpeed;

  /**
  * The value used for the change in speed during accelerate method.
  */
  private final int speedChange;

  /**
  * The no arguments given vehicle constructor.
  */
  public Vehicle() {
    speedChange = 5;
    color = "red";
    maxSpeed = 100;
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
