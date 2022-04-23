public class Engine {
    private String model;
    private String vin;

    public Engine(String model, String vin) {
        this.model = model;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public String getVin() {
        return vin;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
