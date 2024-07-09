package var1;


    /*
Клас Bicycle:
Наслідує основний клас.
Має додаткову характеристику, яка властива велосипедам, наприклад, наявність дзвінка.
Реалізує специфічну поведінку для велосипедів.

наслідування застосовується у :

Клас Bicycle успадковує від класу Transport:
Клас Bicycle розширює функціональність базового класу Transport, додаючи власну характеристику ring.
Клас Bicycle також реалізує абстрактні методи launch(), stop(), acceleration() і inhibition() з класу Transport.
*/
    class Bicycle extends Transport {
        private String ring;

        public Bicycle(String manufacturer, String model, int year, String ring) {
            this.manufacturer = manufacturer;
            this.model = model;
            this.year = year;
            this.ring = ring;
        }

        @Override
        public double launch() {
            // Implement specific launch behavior for bicycles
            return 2.0;
        }

        @Override
        public double stop() {
            // Implement specific stop behavior for bicycles
            return 2.5;
        }

        @Override
        public double acceleration() {
            // Implement specific acceleration behavior for bicycles
            return 4.0;
        }

        @Override
        public double inhibition() {
            // Implement specific inhibition behavior for bicycles
            return 3.0;
        }

        public String getRing() {
            return ring;
        }
    }


