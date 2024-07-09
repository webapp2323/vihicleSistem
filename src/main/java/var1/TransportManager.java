package var1;

import java.util.ArrayList;
import java.util.List;
/*
5.	Клас TransportManager:
o	Зберігає список транспортних засобів.
o	Містить методи для додавання та видалення транспортних засобів з цього списку.
o	Містить методи для запуску та зупинки всіх транспортних засобів у списку.
o	Містить метод для відображення інформації про всі транспортні засоби у списку.


поліморфізм застосовується при використанні методів launch(), stop(), acceleration() і inhibition() у списку транспортних засобів.

Використання методів у списку транспортних засобів:
Список vehicles містить об'єкти різних типів транспортних засобів: Bicycle і Bus.
Коли ми викликаємо методи launch(), stop(), acceleration() і inhibition() на об'єктах у списку vehicles, виконується реалізація методу, визначена в конкретному класі транспортного засобу (Bicycle або Bus).
Наприклад, якщо ми викликаємо vehicles[0].launch(), то для об'єкта Bicycle буде виконаний метод launch(), визначений у класі Bicycle. Аналогічно, для об'єкта Bus буде виконаний метод launch(), визначений у класі Bus.

Це стає можливим завдяки поліморфізму. Незважаючи на те, що всі об'єкти в списку vehicles мають спільний батьківський клас Transport, кожен об'єкт викликає свою власну реалізацію методу, визначену в конкретному підкласі.

Застосування поліморфізму дозволяє писати більш гнучкий і масштабований код. Ми можемо працювати з різними типами транспортних засобів, використовуючи єдиний інтерфейс, визначений у батьківському класі Transport. Це полегшує додавання нових типів транспортних засобів у майбутньому, оскільки вони можуть бути включені до загального списку vehicles без необхідності змінювати існуючий код.
 */
public class TransportManager {
    private List<Transport> transportList;

    public TransportManager() {
        this.transportList = new ArrayList<>();
    }

    public void addToList(Transport transport) {
        transportList.add(transport);
    }

    public void removeTransport(Transport transport) {
        transportList.remove(transport);
    }

    public void displayTransportList() {
        System.out.println("Transport List:");
        for (Transport transport : transportList) {
            System.out.println("Manufacturer: " + transport.getManufacturer());
            System.out.println("Model: " + transport.getModel());
            System.out.println("Year: " + transport.getYear());

            if (transport instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) transport;
                System.out.println("Ring: " + bicycle.getRing());
            } else if (transport instanceof Bus) {
                Bus bus = (Bus) transport;
                System.out.println("Passenger Capacity: " + bus.getPassengerCapacity());
            }

            System.out.println("Launch: " + transport.launch());
            System.out.println("Stop: " + transport.stop());
            System.out.println("Acceleration: " + transport.acceleration());
            System.out.println("Inhibition: " + transport.inhibition());
            System.out.println();
        }
    }

    public void launchTransports() {
        for (Transport transport : transportList) {
            double launchTime = transport.launch();
            System.out.println(transport.getManufacturer() + " " + transport.getModel() + " launched in " + launchTime + " seconds.");
        }
    }

    public void stopTransports() {
        for (Transport transport : transportList) {
            double stopTime = transport.stop();
            System.out.println(transport.getManufacturer() + " " + transport.getModel() + " stopped in " + stopTime + " seconds.");
        }
    }

    public void accelerateTransports() {
        for (Transport transport : transportList) {
            double accelerationTime = transport.acceleration();
            System.out.println(transport.getManufacturer() + " " + transport.getModel() + " accelerated in " + accelerationTime + " seconds.");
        }
    }

    public void inhibitTransports() {
        for (Transport transport : transportList) {
            double inhibitionTime = transport.inhibition();
            System.out.println(transport.getManufacturer() + " " + transport.getModel() + " inhibited in " + inhibitionTime + " seconds.");
        }
    }

    public String printAllVehicles() {
        if (transportList.isEmpty()) {
            System.out.println("Transport list is empty.");
            return "false-->список порожній";
        }

        displayTransportList();
        return "true-->успішне виведення інформації про всі транспортні засоби";
    }

    public void launchAll() {
        if (transportList.isEmpty()) {
            System.out.println("Transport list is empty. No vehicles to launch.");
            return;
        }

        launchTransports();
    }

    public void stopAll() {
        if (transportList.isEmpty()) {
            System.out.println("Transport list is empty. No vehicles to stop.");
            return;
        }

        stopTransports();
    }
}