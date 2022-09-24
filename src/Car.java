public class Car {

    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int productionYear;
    private final String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand != null && brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model != null && model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color != null && color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry != null && productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
    }

    public String toString() {
        return "Информация об автомобиле: " + brand + " " + model + ", " + productionYear + " год выпуска, сборка в "
                + productionCountry + ", " + color + " цвет кузова, объём двигателя - " + engineVolume + " литра.";

    }
}
