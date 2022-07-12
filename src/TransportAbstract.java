public abstract class TransportAbstract extends ServiceStation {
    private final String modelName;
    private final int wheelsCount;

    public TransportAbstract(String modelName, int wheelsCount) {
        this.modelName = modelName;
        if (wheelsCount > 0){
        this.wheelsCount = wheelsCount;}
        else { this.wheelsCount = 0; }
    }

     String getModelName() {
        return modelName;
    }

     int getWheelsCount() {
        return wheelsCount;
    }

     void updateTyre() {
        System.out.print(" Меняем покрышку ");
    }

     void comparison ( ) {
         TransportAbstract value = TransportAbstract.this;
        if (value != null) {
            System.out.println();
            System.out.println("Обслуживаем " + value.getModelName());
            for (int i = 0; i < value.getWheelsCount(); i++) {
                value.updateTyre();
            }
        }
        System.out.println();
    }

}
