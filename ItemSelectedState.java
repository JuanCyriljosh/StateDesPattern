public class ItemSelectedState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected. Insert a coin.");
    }
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin inserted. Dispensing item...");
        machine.setState(new DispensingState());
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insert coin first.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}