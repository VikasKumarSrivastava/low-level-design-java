package design.patterns.structural.adapter;

import lombok.Getter;

import java.util.Date;


public class VoterCard implements Document{
    private String firstName;
    private String lastName;
    private int age;

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
