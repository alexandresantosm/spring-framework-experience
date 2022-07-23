package inheritance;

public class RunApp {
  
  public static void main(String[] args) {
    
    Employee employee = new Employee();

    //Upcast
    
    Employee manager = new Manager();
    Employee salesperson = new Salesperson();
    Employee janitor = new Janitor();
    
    //Downcast
    
    //Manager manager_ = new Employee();
    Salesperson salesperson_ = (Salesperson) new Employee();
  }

}
