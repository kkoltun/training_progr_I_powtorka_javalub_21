package example.people;

import java.util.ArrayList;
import java.util.List;

public class Group {
  private List<Person> people = new ArrayList<>();

  /**
   * Adds a person to the group.
   * 
   * @param person person to be added.
   * @throws IllegalArgumentException when person is null.
   */
  public void addPerson(Person person) throws IllegalArgumentException {
    if (person == null) {
      throw new IllegalArgumentException("Person is null!");
    }
    people.add(person);
  }

  /**
   * Finds people with passed name.
   * 
   * @param firstName first name to search.
   * @return people with the specified name.
   */
  public List<Person> findByFirstName(String firstName) {
    List<Person> peopleWithThisName = new ArrayList<>();
    for (Person person : people) {
      if (person.getFirstName().equals(firstName)) {
        peopleWithThisName.add(person);
      }
    }
    return peopleWithThisName;
  }

  @Override
  public String toString() {
    return "Group{" +
        "people=" + people +
        '}';
  }
}
