package abc;

import abc.res.*;

public class RunMe {

  public static void main(String[] args) {
    test_JSON_Schema();

    test_Enum_Null();
    test_Enum_Init();
    //test_Enum_JDK9();
  }

  private static void test_JSON_Schema() {
    Test test = Test.create("id", 1.0, 1);
    System.out.println(test.write().toJson());
  }

  private static void test_Enum_Null() {
    EnumTest enumTest = EnumTest.create(null);
    System.out.println(enumTest.write().toJson());
  }

  private static void test_Enum_Init() {
    EnumTest enumTest = EnumTest.create(EnumTest.ind.y);
    System.out.println(enumTest.write().toJson());
  }

//  private static void test_Enum_JDK9() {
//    EnumTest enumTest = EnumTest.create(EnumTest.ind._);
//    System.out.println(enumTest.write().toJson());
//  }

}
