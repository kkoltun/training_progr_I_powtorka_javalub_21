package example.road;

import static java.lang.Math.min;

public class Bicycle implements Runnable {
  private static final double MAXIMAL_VELOCITY = 40;
  private double velocity;

  public void run(double velocity) throws InvalidVelocityException {
    if (velocity < 0) {
      throw new InvalidVelocityException("Invalid velocity passed [" + velocity + "]." +
          " Velocity cannot be < 0");
    }

    this.velocity = min(MAXIMAL_VELOCITY, velocity);
    System.out.println("Bicycle running at speed " + this.velocity + " km/h.");
  }

  public double getVelocity() {
    return velocity;
  }

  public String toString() {
    return "Bicycle running at speed " + velocity + " km/h.";
  }
}
