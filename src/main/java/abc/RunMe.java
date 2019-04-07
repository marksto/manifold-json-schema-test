package abc;

import abc.res.*;

public class RunMe {
  public static void main(String[] args) {
    Test good = Test.create("id", 1.0, 1);
    System.out.println(good.write().toJson());
  }
}
