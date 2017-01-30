package oik.designpatterns.command.objects;

public class GarageDoor {
    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println("Garage door is open");
    }

    public void down() {
        System.out.println("Garage door is close");
    }

    public void lightOn() {
        System.out.println("Garage light is on");
    }

    public void lightOff() {
        System.out.println("Garage light is off");
    }
}
