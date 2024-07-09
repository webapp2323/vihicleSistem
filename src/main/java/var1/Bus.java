package var1;


    /*
Клас Bus:
Наслідує основний клас.
Має додаткову характеристику, яка властива автобусам, наприклад, пасажиромісткість.
Реалізує специфічну поведінку для автобусів.

наслідування застосовується у:
Клас Bus успадковує від класу Transport:
Клас Bus розширює функціональність базового класу Transport, додаючи власну характеристику passengerCapacity.
Клас Bus також реалізує абстрактні методи launch(), stop(), acceleration() і inhibition() з класу Transport.
*/
    class Bus extends Transport {
        private int passengerCapacity;

        public Bus(String manufacturer, String model, int year, int passengerCapacity) {
            this.manufacturer = manufacturer;
            this.model = model;
            this.year = year;
            this.passengerCapacity = passengerCapacity;
        }

        @Override
        public double launch() {
            // Implement specific launch behavior for buses
            return 4.0;
        }

        @Override
        public double stop() {
            // Implement specific stop behavior for buses
            return 5.0;
        }

        @Override
        public double acceleration() {
            // Implement specific acceleration behavior for buses
            return 3.5;
        }

        @Override
        public double inhibition() {
            // Implement specific inhibition behavior for buses
            return 4.5;
        }

        public int getPassengerCapacity() {
            return passengerCapacity;
        }
    }

