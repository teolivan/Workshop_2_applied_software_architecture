package task1;

import java.util.ArrayList;

/*
* A central traffic‑control hub must:
•receive messages from all participants,
•route congestion updates only to neighbouring intersections (to facilitate adaptive
timing),
•broadcast emergency pre‑emption commands to multiple intersections along a vehicle’s
route,
•keep participants decoupled so new device types can join without altering existing classes.
Build a messaging framework that enables this indirect communication while supporting
runtime registration and deregistration of participants.
* */

// Concrete Mediator/Controller class
// Responsible for communication and logic
public class TrafficControlHub implements Mediator{
    public ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();


    @Override
    public void receiveMessages(Vehicle sender, Vehicle receiver, String message) {
        System.out.println(receiver + " received message from: " + sender.getName());
        System.out.println("Message: " + message);
        sender.sendMessage(receiver);
        receiver.receiveMessage(sender);
    }

    @Override
    public void broadcastEmergencyMessage(Route route, String message) {
        for(int i = 0; i < vehicles.size(); i++) {
            if(vehicles.get(i).getRoute() == route) {
                System.out.println(vehicles.get(i).getName() + " received message : " + message + " on route to: " + route);
                vehicles.get(i).receiveRouteMessage(this);
            }
        }
    }

    @Override
    public void sendMessage(Vehicle sender, Vehicle receiver, String message) {

    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
