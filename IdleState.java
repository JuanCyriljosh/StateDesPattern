public class IdleState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Item selected. Please insert a coin.");
        machine.setState(new ItemSelectedState());
    }
    public void insertCoin(VendingMachine machine) {
        System.out.println("Please select an item first.");
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("No item selected.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}