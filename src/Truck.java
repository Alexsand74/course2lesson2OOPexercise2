public class Truck extends Car {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
          this.comparison();
            this.checkEngine();
            this.checkTrailer();
        }
 }



