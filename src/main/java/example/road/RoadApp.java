package example.road;

import java.util.List;

public class RoadApp {
  public static void main(String[] args) throws InvalidVelocityException {
    Taxi taxi = new Taxi();
    taxi.run(100);

    Bicycle bicycle = new Bicycle();
    bicycle.run(25);

    PoliceCar policeCar = new PoliceCar();
    policeCar.run(100);

    Road road = new Road();
    System.out.println(road.toString());

    road.add(taxi);
    road.add(bicycle);
    road.add(policeCar);
    System.out.println(road.toString());
  }
}
