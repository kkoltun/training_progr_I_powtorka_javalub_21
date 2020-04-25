package example.road;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Road {
  private List<Runnable> runnableObjects = new ArrayList<>();

  public void add(Runnable runnable) {
    runnableObjects.add(runnable);
  }

  public List<Runnable> get() {
    return new ArrayList<>(runnableObjects);
//    return Arrays.copyOf(taxis);
  }

  public String toString() {
    StringBuilder message = new StringBuilder();
    message.append("Road with cars:\n");

    for (Runnable runnable : runnableObjects) {
      message.append(runnable.toString()).append("\n");
    }

    return message.toString();
  }
}
