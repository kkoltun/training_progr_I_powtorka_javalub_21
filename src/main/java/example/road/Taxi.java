package example.road;

public class Taxi implements Runnable {
  private double velocity;

  public Taxi() {
    
  }

  public void run(double velocity) {
    this.velocity = velocity;
    System.out.println("Running at velocity " + velocity);
  }

  public String toString() {
    return "Taxi running " + velocity + " km/h";
  }
}
