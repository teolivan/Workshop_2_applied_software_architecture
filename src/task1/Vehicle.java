package task1;

public abstract class Vehicle {
    Mediator mediator;
    String name;
    Route route;
    public Vehicle(Mediator mediator, String name, Route route) {
        this.mediator = mediator;
        this.name = name;
        this.route = route;
        System.out.println(name + " created on the way to " + route);
    }

    public String getName() {
        return this.name;
    }

    public Route getRoute() {
        return this.route;
    }

    public void receiveRouteMessage(Mediator mediator) {
        System.out.println("Route message received on route " + this.route);
    }

    public void receiveMessage(Vehicle sender) {
        System.out.println("Message received from: " + sender.getName());
    }

    public void sendMessage(Vehicle receiver) {
        System.out.println("Message sent to: " + receiver.getName());
    }
}
