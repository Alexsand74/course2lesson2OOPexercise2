public abstract class Transport implements ServiceStationInterfase {
    public String modelName;
    public int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        if (wheelsCount > 0){
        this.wheelsCount = wheelsCount;}
        else { this.wheelsCount = 0; }
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}
