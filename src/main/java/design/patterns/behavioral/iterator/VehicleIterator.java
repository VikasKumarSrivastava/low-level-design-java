package design.patterns.behavioral.iterator;

import java.util.List;

public class VehicleIterator implements Iterator {
    private List<Vehicle> vehicles;
    int index = 0;

    public VehicleIterator(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public boolean hasNext() {
        if (vehicles.size() == index - 1) {
            return false;
        }
        return true;
    }

    @Override
    public Vehicle next() {
        return vehicles.get(index++);
    }
}
