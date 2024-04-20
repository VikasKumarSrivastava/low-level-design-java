package design.patterns.structural.adapter;

import lombok.Getter;

@Getter
public class RashanCard {
    private String fullName; // eg. "first-name last-name"
    private int age;

    public RashanCard(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
