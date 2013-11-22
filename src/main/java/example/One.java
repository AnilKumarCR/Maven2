package example;

public class One {
  String message = "foo";
  String abc="";

  public String foo() {
    return message;
  }

  public void uncoveredMethod() {
    System.out.println(foo());
  }
}
