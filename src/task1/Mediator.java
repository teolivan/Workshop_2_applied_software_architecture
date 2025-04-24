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


// Controller class. Provides centralized logic.
// Defines methods for communication
public interface Mediator {
    public void receiveMessages(Vehicle sender, Vehicle receiver, String message);

    public void broadcastEmergencyMessage(Route route, String message);

    public void sendMessage(Vehicle sender, Vehicle receiver, String message);

    void addVehicle(Vehicle vehicle);
}
