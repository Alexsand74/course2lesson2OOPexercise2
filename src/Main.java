public class Main {
    public static void main(String[] args) {

        ServiceStation[] transportTehno = new ServiceStation[] {
                 new Bicycle("bicycle1", 2),
                 new Bicycle("bicycle2", 2),
                 new Bicycle("bicycle3", -1),

                 new Car("car1", 4),
                 new Car("car2", 2),

                 new Truck("truck1", 6),
                 new Truck("truck2", 8),
        };

        for (ServiceStation type : transportTehno) {
        type.check();
        }
    }
}