public class App {
    public static void main(String[] args) throws Exception {
        
        var car1 = new Car();

        car1.setColor("Amarelo");
        car1.setModel("Ferrari");
        car1.setTankCapacity(65);

        System.out.println(car1.getColor());
        System.out.println(car1.getModel());
        System.out.println(car1.getTankCapacity());
        System.out.println(car1.fullTankValue(7.58));

        System.out.println();

        var car2 = new Car("Banco", "VW Kombi", 45);

        System.out.println(car2.getColor());
        System.out.println(car2.getModel());
        System.out.println(car2.getTankCapacity());
        System.out.println(car2.fullTankValue(7.58));        

    }
}
