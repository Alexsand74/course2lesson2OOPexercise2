public class Bicycle extends Transport  {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
         if (this != null) {
            System.out.println("Обслуживаем " + this.modelName);
            for (int i = 0; i < this.wheelsCount; i++) {
                this.updateTyre();
            }
        }
    }

}
