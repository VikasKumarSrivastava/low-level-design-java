package design.patterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();
        parking.addVehicle(new Vehicle("1"));
        parking.addVehicle(new Vehicle("2"));
        parking.addVehicle(new Vehicle("3"));


        VehicleIterator vit = parking.createIterator();
        if (vit.hasNext()) {
            Vehicle vehicle = (Vehicle) vit.next();
            System.out.println(vehicle.getNumber());
        }
    }
}
