public abstract class Transport implements ServiceStationInterfase {
    private String modelName;
    private int wheelsCount;

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
        System.out.println("Меняем покрышку");
    }

}
