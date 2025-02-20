public class DispensingState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Currently dispensing. Please wait.");
    }
    public void insertCoin(VendingMachine machine) {
        System.out.println("Currently dispensing. Cannot insert coin.");
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Item dispensed. Returning to idle state.");
        machine.setState(new IdleState());
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}