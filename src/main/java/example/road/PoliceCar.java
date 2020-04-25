package example.road;

public class PoliceCar implements Runnable {
  private double velocity;
  private boolean isEmergency;

  public void run(double velocity) throws CannotRunSlowerInEmergency {
    if (isEmergency) {
      if (velocity < 100) {
        throw new CannotRunSlowerInEmergency("Invalid velocity passed [" + velocity + "]." +
            " Police car in emergency cannot run this slow.");
      }
    }

    this.velocity = velocity;
  }
}
