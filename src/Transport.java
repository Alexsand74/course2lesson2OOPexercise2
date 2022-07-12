public abstract class Transport implements ServiceStationInterfase {
    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        if (wheelsCount > 0){
        this.wheelsCount = wheelsCount;}
        else { this.wheelsCount = 0; }
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.print(" Меняем покрышку ");
    }

    public void comparison (Transport value ) {
        if (value != null) {
            System.out.println();
            System.out.println("Обслуживаем " + value.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                value.updateTyre();
            }
        }
        System.out.println();
    }

}
