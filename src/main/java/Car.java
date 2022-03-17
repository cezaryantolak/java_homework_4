import java.util.ArrayList;
import java.util.List;

public class Car {

    private Producer producer;
    private boolean isAutomaticGear;
    private Market market;
    private String segment;
    private List<Dimension> dimensions;
    private ArrayList<Car> chosenCars = new ArrayList<>();

    public Car() {
    }

    public Car(Producer producer, boolean isAutomaticGear, Market market,
               String segment, List<Dimension> dimensions)  {
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public void chooseCarsWithParameters(String producerName, boolean isAutomaticGear, int trunkCapacity, List<Car> cars) {
        for (Car i : cars) {
            if (i.getProducer().getModel().equals(producerName)) {
                if (i.isAutomaticGear() == isAutomaticGear) {
                    if (i.getDimensions().get(0).getTrunkCapacity() > trunkCapacity) {
                        chosenCars.add(i);
                    }
                }
            }
        }
    }

    public void printLocations() {
        for (Car car : chosenCars) {
            System.out.println(car.getMarket().getCountries().get(0).getCountryName() + " - " + car.getMarket().getCountries().get(0).getCountrySign());
        }
    }
}
