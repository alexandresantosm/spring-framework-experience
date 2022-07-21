public class Car extends Vehicle {
  String color;
  String model;
  int tankCapacity;
  
  public Car () {}

  public Car (String color, String model, int tankCapacity) {
    this.color = color;
    this.model = model;
    this.tankCapacity = tankCapacity;
  }

  public double fullTankValue (double fuelValue) {
    return getTankCapacity() * fuelValue;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getTankCapacity() {
    return tankCapacity;
  }

  public void setTankCapacity(int tankCapacity) {
    this.tankCapacity = tankCapacity;
  }
}
