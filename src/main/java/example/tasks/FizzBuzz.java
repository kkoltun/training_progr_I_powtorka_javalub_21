package example.tasks;

import java.util.stream.IntStream;

public class FizzBuzz {
  public static void main(String[] args) {
    new FizzBuzz().getFizzBuzzWithStreams();
  }

  public void getFizzBuzzWithConcat() {
    for (int i = 0; i <= 100; ++i) {
      boolean isDivisibleBy3 = i % 3 == 0;
      boolean isDivisibleBy5 = i % 5 == 0;

      String message = ""
          .concat(isDivisibleBy3 ? "Fizz" : "")
          .concat(isDivisibleBy5 ? "Buzz" : "")
          .concat(!isDivisibleBy3 && !isDivisibleBy5 ? String.valueOf(i) : "");

      System.out.println(message);
    }
  }

  public void getFizzBuzzWithStreams() {
    // Todo PIERWSZY BREAKPOINT USTAW W TEJ METODZIE
    // Daj mi kolejno liczby od 1 do 100...
    IntStream.rangeClosed(0, 100)
        // ... kazda liczbe zamien na String stosujac te funkcje ...
        .mapToObj(number -> FizzBuzz.applyFizzBuzz(number))
        // ... i na kazdym Stringu wykonaj te funkcje.
        .forEach(fizzBuzzed -> FizzBuzz.print(fizzBuzzed));
  }

  private static String applyFizzBuzz(int number) {
    // Todo DRUGI BREAKPOINT USTAW W TEJ METODZIE
    boolean isDivisibleBy3 = number % 3 == 0;
    boolean isDivisibleBy5 = number % 5 == 0;

    String fizzBuzzed = "";
    if (isDivisibleBy3 && isDivisibleBy5) {
      fizzBuzzed = "FizzBuzz";
    } else if (isDivisibleBy3) {
      fizzBuzzed = "Fizz";
    } else if (isDivisibleBy5) {
      fizzBuzzed = "Buzz";
    } else {
      fizzBuzzed = String.valueOf(number);
    }
    return fizzBuzzed;    
  }

  // Metoda stworzona po to by ustawic w niej breakpoint i zobaczyc jak sie wykonuje program
  private static void print(String text) {
    // Todo TRZECI BREAKPOINT USTAW W TEJ METODZIE
    System.out.println(text);
  }
  
}
