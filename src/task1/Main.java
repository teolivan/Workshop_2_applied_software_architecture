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
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}