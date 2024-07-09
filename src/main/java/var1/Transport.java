package var1;
/*
1.	Основний клас Transport:
o	Має містити загальні характеристики транспортних засобів: бренд, модель, рік випуску, швидкість.
o	Містить методи для запуску, зупинки, прискорення та гальмування. Деякі з цих методів мають бути визначені в дочірніх класах.
o	Цей клас не повинен бути інстанційованим напряму, а має використовуватися як основа для інших класів.

абстракція застосована до класу Transport. Цей клас є абстрактним і визначає загальні характеристики та методи, якими повинні володіти всі транспортні засоби:

Абстрактні методи:
launch(): повертає час, необхідний для запуску транспортного засобу.
stop(): повертає час, необхідний для зупинки транспортного засобу.
acceleration(): повертає час, необхідний для прискорення транспортного засобу.
inhibition(): повертає час, необхідний для гальмування транспортного засобу.
Характеристики:
manufacturer: виробник транспортного засобу.
model: модель транспортного засобу.
year: рік виробництва транспортного засобу.

Завдяки наслідуванню, класи Bicycle і Bus успадковують всі властивості та методи з батьківського класу Transport. Це дозволяє уникнути дублювання коду і забезпечує єдине місце для визначення загальної поведінки транспортних засобів.
Таке застосування наслідування робить код більш модульним, гнучким і легким для розширення. Якщо в майбутньому потрібно додати новий тип транспортного засобу, можна просто створити новий клас, що успадковує від Transport, і реалізувати необхідні абстрактні методи.
 */

    public abstract class Transport {
        protected String manufacturer;
        protected String model;
        protected int year;

        public abstract double launch();
        public abstract double stop();
        public abstract double acceleration();
        public abstract double inhibition();

        // Getter and setter methods for the fields
        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
}
