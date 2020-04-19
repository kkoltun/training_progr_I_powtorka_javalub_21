package example.people;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
  @Test
  void shouldNotAllowBirthdateInFuture() {
    // Given
    Person person = new Person("Adam", "Kowalski");
    LocalDate dateInFuture = LocalDate.now().plusYears(2);

    // When
    Executable setDateInFuture = () -> {
      person.setDateOfBirth(dateInFuture);
    };

    // Then
    assertThrows(IllegalArgumentException.class, setDateInFuture);
  }
}