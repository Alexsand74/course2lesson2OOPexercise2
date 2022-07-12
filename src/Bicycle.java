public class Bicycle extends TransportAbstract {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        this.comparison(this);
    }
 }


