import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Car car = new Car();

        Country germany = new Country("Germany", 'G');
        Country poland = new Country("Poland", 'P');
        Country france = new Country("France", 'F');
        Country italy = new Country("Italy", 'I');
        Country england = new Country("England", 'E');

        Market business = new Market("Business", new ArrayList<>(Arrays.asList(poland, france, italy)));
        Market cargo = new Market("Cargo", new ArrayList<>(Arrays.asList(england, france, germany)));
        Market transport = new Market("Transport", new ArrayList<>(Arrays.asList(france, italy, germany)));
        Market taxi = new Market("Taxi", new ArrayList<>(Arrays.asList(poland, italy, england)));
        Market bus = new Market("Bus", new ArrayList<>(Arrays.asList(england, france, italy)));

        Dimension d1 = new Dimension(100, 200, 300);
        Dimension d2 = new Dimension(150, 200, 400);
        Dimension d3 = new Dimension(200, 400, 600);
        Dimension d4 = new Dimension(50, 100, 200);
        Dimension d5 = new Dimension(70, 150, 150);
        Dimension d6 = new Dimension(100, 200, 300);
        Dimension d7 = new Dimension(600, 800, 1000);
        Dimension d8 = new Dimension(100, 200, 200);
        Dimension d9 = new Dimension(300, 400, 500);
        Dimension d10 = new Dimension(30, 80, 90);

        Producer bmw_i3 = new Producer("BMW", "i3");
        Producer bmw_x3 = new Producer("BMW", "X3");
        Producer bmw_m2 = new Producer("BMW", "M2");
        Producer bmw_5 = new Producer("BMW", "series5");
        Producer kia_ceed = new Producer("KIA", "Ceed");
        Producer ford_escort = new Producer("Ford", "Escort");
        Producer ford_focus = new Producer("Ford", "Focus");
        Producer audi_a5 = new Producer("Audi", "A5");
        Producer skoda_fabia = new Producer("Skoda", "Fabia");
        Producer renault_megane = new Producer("Renault", "Megane");

        Car bmw1 = new Car(bmw_i3, true, taxi, "standard", List.of(d1));
        Car bmw2 = new Car(bmw_x3, true,transport, "premium", List.of(d2));
        Car bmw3 = new Car(bmw_m2, true,business, "premium", List.of(d10));
        Car bmw4 = new Car(bmw_5, false, transport, "medium", List.of(d7));
        Car bmw5 = new Car(bmw_5, true, cargo, "premium", List.of(d7));
        Car bmw6 = new Car(bmw_x3, false, taxi, "medium", List.of(d7));
        Car kia1 = new Car(kia_ceed, false, bus, "standard", List.of(d4));
        Car ford1 = new Car(ford_focus, true, taxi, "standard", List.of(d8));
        Car ford2 = new Car(ford_escort, false, bus, "standard", List.of(d5));
        Car audi1 = new Car(audi_a5, true, business, "premium", List.of(d3));
        Car audi2 = new Car(audi_a5, false, taxi, "medium", List.of(d3));
        Car skoda1 = new Car(skoda_fabia, false, cargo, "standard", List.of(d6));
        Car renault1 = new Car(renault_megane, false, transport, "standard", List.of(d9));
        Car renault2 = new Car(renault_megane, false, taxi, "standard", List.of(d9));
        Car renault3 = new Car(renault_megane, true, cargo, "standard", List.of(d7));

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(bmw1);
        cars.add(bmw2);
        cars.add(bmw3);
        cars.add(bmw4);
        cars.add(bmw5);
        cars.add(bmw6);
        cars.add(kia1);
        cars.add(ford1);
        cars.add(ford2);
        cars.add(audi1);
        cars.add(audi2);
        cars.add(skoda1);
        cars.add(renault1);
        cars.add(renault2);
        cars.add(renault3);

        car.chooseCarsWithParameters("BMW", true, 300, cars);
        car.printLocations();
    }
}
