public class ServiceStation implements ServiceStationInterfase {

    public void ServiceMaintenanceOne (){
        ServiceStationInterfase station = ServiceStation.this;
        station.check();
    }
    public void serviceMaintenance (ServiceStation station) {
        station.check();
    }
 }
