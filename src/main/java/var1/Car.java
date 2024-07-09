package var1;
 /*
    Клас Car:
Наслідує основний клас.
Має додаткову характеристику, яка властива автомобілям, наприклад, кількість дверей.
Реалізує специфічну поведінку для автомобілів, таку як запуск, зупинка, прискорення та гальмування.
     */

class Car extends Transport {
    private int doors;

    public Car(String manufacturer, String model, int year, int doors) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.doors = doors;
    }

    @Override
    public double launch() {
        // Implement specific launch behavior for cars
        return 5.0;
    }

    @Override
    public double stop() {
        // Implement specific stop behavior for cars
        return 3.0;
    }

    @Override
    public double acceleration() {
        // Implement specific acceleration behavior for cars
        return 7.5;
    }

    @Override
    public double inhibition() {
        // Implement specific inhibition behavior for cars
        return 4.0;
    }

    public int getDoors() {
        return doors;
    }
}

