abstract class Incrementation {
  
  private static int count = 0;
  private int id;
  private String name;

  public Incrementation(String name) {
    id = ++count;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
  
  public String toString() {
    return String.format("%s id: %d", name, id);
  }

}