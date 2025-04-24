package task1;

/*
* Task 1
Requirement
A smart‑city traffic‑management platform coordinates dozens of intersections (traffic
lights) and emergency vehicles. Intersections periodically report congestion levels and
signal‑phase status; emergency vehicles broadcast pre‑emption requests when
approaching. A central traffic‑control hub must:
•receive messages from all participants,
•route congestion updates only to neighbouring intersections (to facilitate adaptive
timing),
•broadcast emergency pre‑emption commands to multiple intersections along a vehicle’s
route,
•keep participants decoupled so new device types can join without altering existing classes.
Build a messaging framework that enables this indirect communication while supporting
runtime registration and deregistration of participants.
* */

// I will use the Mediator pattern, as it is useful for many-to-many communication, works like a Controller class
// (centralized logic)
public class Client {
    public static void main(String[] args) {
        Mediator trafficControlHub = new TrafficControlHub();

        Vehicle fordMustang = new Ford(trafficControlHub, "Ford Mustang", Route.denver);
        Vehicle fordExplorer = new Ford(trafficControlHub, "Ford Explorer", Route.new_york);
        Vehicle subaruForester = new Subaru(trafficControlHub, "Subaru Forester", Route.houston);
        Vehicle subaruOutback = new Subaru(trafficControlHub, "Subaru Outback", Route.los_angeles);
        Vehicle subaruLegacy = new Subaru(trafficControlHub, "Subaru Legacy", Route.houston);
        trafficControlHub.addVehicle(fordMustang);
        trafficControlHub.addVehicle(fordExplorer);
        trafficControlHub.addVehicle(subaruForester);
        trafficControlHub.addVehicle(subaruOutback);
        trafficControlHub.addVehicle(subaruLegacy);
        System.out.println();


        trafficControlHub.broadcastEmergencyMessage(Route.houston, "There are a bunch of cats crossing the road!! Be careful... ");
        trafficControlHub.broadcastEmergencyMessage(Route.los_angeles, "There is tornado on the way to LA, please wait.");
        trafficControlHub.sendMessage(fordMustang, subaruForester, "hello hello Subaru Forester");
        trafficControlHub.receiveMessages(subaruOutback, subaruLegacy, "hello subaru legacy");
    }
}