package web.model;

public class Car {
    private String carBrand;
    private String model;
    private int serialNumber;

    public Car() {
    }

    public Car(String carBrand, String model, int serialNumber) {
        this.carBrand = carBrand;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Car:" +
                "carBrand ='" + carBrand + '\'' +
                ", model ='" + model + '\'' +
                ", serialNumber =" + serialNumber +
                '.';
    }
}
