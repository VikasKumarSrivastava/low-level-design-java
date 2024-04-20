package design.patterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        PhoneState phoneState = new OnPhoneState();
        phoneState.pressPowerButton();

        phoneState = new OffPhoneState();
        phoneState.pressPowerButton();
    }
}
