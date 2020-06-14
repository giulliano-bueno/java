import cars.Car;
import cars.Truck;

public class Welcome {
        public static void main(String[] args) {
                if (args.length > 0) {
                        Car truck = new Truck(args[0]);
                        System.out.println(truck.getLicensePlate());
                }
        }
}
