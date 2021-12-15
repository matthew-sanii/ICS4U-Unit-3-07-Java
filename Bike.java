public class Bike extends Vehicle {
  
  private int cadence = 3;

  public Bike() {
    super();
  }

  public int accelerate() {
    return(super.accelerate());
  }

  public int brake() {
    return(super.brake());
  }

  public String ringBell() {
    return("Ding!");
  }

  public void setCadence(final int cadance) {
    cadence = cadance;
  }

  public int getCadence() {
    return cadence;
  }
}