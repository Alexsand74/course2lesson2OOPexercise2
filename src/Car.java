public class Car extends Bicycle  {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void check() {
        if (this != null) {
            System.out.println("Обслуживаем " + this.modelName);
            for (int i = 0; i < this.wheelsCount; i++) {
                this.updateTyre();
            }
            this.checkEngine();
            }
    }

}
