public class Main {
    public static void main(String[] args) {

        ServiceStationInterfase[] transportTehno = new ServiceStationInterfase[] {
                 new Bicycle("bicycle1", 2),
                 new Bicycle("bicycle2", 2),
                 new Bicycle("bicycle3", -1),

                 new Car("car1", 4),
                 new Car("car2", 2),

                 new Truck("truck1", 6),
                 new Truck("truck2", 8),
        };

    for (ServiceStationInterfase type : transportTehno) {
        type.check();
    }
//        car.check();
//        car2.check();
//        bicycle3.check();
//        bicycle.check();
//        bicycle2.check();
//        truck.check();
//        truck2.check();

    }
}