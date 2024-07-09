package var1;


    class Main {
        public static void main(String[] args) {
            // Create some vehicles
            Car car = new Car("Toyota", "Camry", 2020, 4);
            Bicycle bicycle = new Bicycle("Specialized", "Roubaix", 2018, "3-tones ");
            Bus bus = new Bus("Volvo", "9700", 2022, 45);

            // Create a TransportManager and add the vehicles
            TransportManager manager = new TransportManager();
            manager.addToList(car);
            manager.addToList(bicycle);
            manager.addToList(bus);

            // Test the TransportManager methods
            System.out.println("All vehicles:");
            System.out.println(manager.printAllVehicles());

            System.out.println("\nLaunching all vehicles:");
            manager.launchAll();

            System.out.println("\nStopping all vehicles:");
            manager.stopAll();

            // Test specific vehicle methods
            System.out.println("\nCar doors: " + car.getDoors());
            System.out.println("Bicycle ring: " + bicycle.getRing());
            System.out.println("Bus passenger capacity: " + bus.getPassengerCapacity());
        }
    }
/*
  клас Transport:
Має містити загальні характеристики транспортних засобів: бренд, модель, рік випуску, швидкість.
Містить методи для запуску, зупинки, прискорення та гальмування. Деякі з цих методів мають бути визначені в дочірніх класах.
Цей клас не повинен бути інстанційованим напряму, а має використовуватися як основа для інших класів.

  Абстракція: Подумайте, які загальні характеристики та методи повинні бути у всіх транспортних засобів, і об'єднайте їх в одному класі.-->тут потрібно використати абстрактний клас для представлення загальних характеристик та методів для всіх транспортних засобів ->

  В цьому абстрактному класі Transport ми визначаємо загальні характеристики, такі як manufacturer, model і year, а також абстрактні методи launch(), stop(), acceleration() і inhibition(), які будуть реалізовані в конкретних підкласах.

  */


