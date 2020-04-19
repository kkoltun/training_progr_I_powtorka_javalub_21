package example.people;

import java.time.LocalDate;
import java.time.Month;

public class PeopleApp {
  public static void main(String[] args) {
    LocalDate myBirthday = LocalDate.of(1992, Month.NOVEMBER, 21);

    Person person1 = new Person("A", "B", myBirthday);
    Person person2 = new Person("A", "B", myBirthday.plusYears(2));
    Person person3 = new Person("B", "B", myBirthday.minusDays(150));

    Group group = new Group();
    group.addPerson(person1);
    group.addPerson(person2);
    group.addPerson(person3);

    System.out.println(group.toString());
  }
}
