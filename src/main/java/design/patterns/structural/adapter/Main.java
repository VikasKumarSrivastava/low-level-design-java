package design.patterns.structural.adapter;

import design.patterns.structural.adapter.adapter.DocumentAdapter;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        Document drivingLicence = new DrivingLicence("ishant", "sharma", 24);
        Document voterCard = new DrivingLicence("Gaurav", "kumar", 25);

        System.out.println(drivingLicence.getAge());
        System.out.println(drivingLicence.getFirstName());
        System.out.println(drivingLicence.getLastName());

        Document rashanCard = new DocumentAdapter(new RashanCard("Deepak bhist", 32));
        System.out.println(rashanCard.getAge());
        System.out.println(rashanCard.getFirstName());
        System.out.println(rashanCard.getLastName());
    }
}
