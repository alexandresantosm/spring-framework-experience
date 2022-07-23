package interfaces;

public class Calculator implements MathOperation {

  @Override
  public void add(double operator1, double operator2) {
    System.out.println(operator1 + operator2);  
  }

  @Override
  public void subtract(double operator1, double operator2) {
    System.out.println(operator1 - operator2);  
  }

  @Override
  public void multiply(double operator1, double operator2) {
    System.out.println(operator1 * operator2);
  }

  @Override
  public void divide(double operator1, double operator2) {
    System.out.println(operator1 / operator2);  
  }
  
}
