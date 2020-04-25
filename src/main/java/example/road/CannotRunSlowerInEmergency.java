package example.road;

public class CannotRunSlowerInEmergency extends InvalidVelocityException {
  public CannotRunSlowerInEmergency(String message) {
    super(message);
  }
}
