public class Truck extends Vehicle {

  /**
  * The plate number string.
  */
  private String plateNumber;

  /**
  * The truck constructor.
  */
  public Truck() {
    super();
  }

  /**
  * The accelerate method.
  *
  * @return speed.
  */
  public int accelerate() {
    super.accelerate();
    return super.accelerate();
  }

  /**
  * The brake method.
  *
  * @return speed.
  */
  public int brake() {
    return super.brake();
  }

  /**
  * The provideAir method.
  *
  * @return Honk Honk!
  */
  public String provideAir() {
    return "Honk Honk!";
  }

  /**
  * The plateInfo method.
  *
  * @param plateNum the new plate number.
  * @param color the color of the truck.
  */
  public void plateInfo(final String plateNum,
  final String color) {
    plateNumber = plateNum;
    this.color = color;
  }

  /**
  * The getPlate method.
  *
  * @return plateNumber.
  */
  public String getInfo() {
    final String info = plateNumber + " and is " + color;
    return info;
  }
}
