public class Truck extends Vehicle {

  private String plateNumber;

  public Truck() {
    super();
  }

  public int accelerate() {
    super.accelerate();
    return(super.accelerate());
  }

  public int brake() {
    return(super.brake());
  }

  public String provideAir() {
    return("Honk Honk!");
  }

  public void plateInfo(final String plateNum) {
    plateNumber = plateNum;
  }

  public String getPlate() {
    return plateNumber;
  }
}