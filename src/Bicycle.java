public class Bicycle extends Transport  {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        this.comparison(this);
    }
 }


