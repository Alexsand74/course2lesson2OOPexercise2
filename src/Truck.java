public class Truck extends Car implements ServiceStationInterfase {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

      public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void check() {
       if (this != null) {
           System.out.println("Обслуживаем " + this.modelName);
           for (int i = 0; i < this.wheelsCount; i++) {
               this.updateTyre();
           }
           this.checkEngine();
           this.checkTrailer();
       }
    }
}
