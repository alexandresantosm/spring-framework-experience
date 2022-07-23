package polymorphism;

public class RunApp {
  
  public static void main(String[] args) {
    
    MotherClass[] classes = new MotherClass[]{new ChildClass1(), new ChildClass1(), new MotherClass()};
    
    for (MotherClass c : classes) {
      c.method1();
    }

    System.out.println("");

    ChildClass2 childClass2 = new ChildClass2();
    childClass2.method2();
  }

}
