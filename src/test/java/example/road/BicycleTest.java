package example.road;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BicycleTest {
  private Bicycle bicycle;

  @BeforeEach
  void setup() {
    bicycle = new Bicycle();
  }

  @Test
  void shouldRunSlowerThan40() throws InvalidVelocityException {
    // Given
    double expectedVelocity = 38;

    // When
    bicycle.run(expectedVelocity);
    double actualVelocity = bicycle.getVelocity();

    // Then
    assertEquals(expectedVelocity, actualVelocity);
  }

  @Test
  void shouldNotRunFasterThan40() throws InvalidVelocityException {
    // Given
    double requestedVelocity = 120;
    double expectedVelocity = 40;

    // Then
    bicycle.run(requestedVelocity);
    double actualVelocity = bicycle.getVelocity();

    // Given
    assertEquals(expectedVelocity, actualVelocity);
  }

  @Test
  void shouldNotAllowNegativeVelocity() {
    // When
    Executable tryToRunWithNegativeVelocityLambda = () -> bicycle.run(-10);
    Executable tryToRunWithNegativeVelocity = new Executable() {
      @Override
      public void execute() throws Throwable {
        bicycle.run(-10);
      }
    };

    // Then
    assertThrows(InvalidVelocityException.class, tryToRunWithNegativeVelocity);
  }
}