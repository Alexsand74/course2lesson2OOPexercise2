public class Main {
    public static void main(String[] args) {

//        ServiceStation[] transportTehno = new ServiceStation[] {
//                 new Bicycle("bicycle1", 2),
//                 new Bicycle("bicycle2", 2),
//                 new Bicycle("bicycle3", -1),
//
//                 new Car("car1", 4),
//                 new Car("car2", 2),
//
//                 new Truck("truck1", 6),
//                 new Truck("truck2", 8),
//        };
//
//        for (ServiceStation type : transportTehno) {
//        type.ServiceMaintenanceOne();
//        }

        System.out.println();
        System.out.println( "**********************************************************************************************");
        System.out.println( "  РЕШЕНИЕ ВТОРОЕ БЕЗ МАССИВА СОЗДАЕМ ПОЛНЫЙ ОБЪЕКТ В КОТОРОМ МОЖЕТ СОСТОЯТЬ НАШ ТЕКУЩИЙ ОЪЕКТ ");

        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();

        station.serviceMaintenance(car);
        station.serviceMaintenance(car2);
        station.serviceMaintenance(truck);
        station.serviceMaintenance(truck2);
        station.serviceMaintenance(bicycle);
        station.serviceMaintenance(bicycle2);

    }
    }
