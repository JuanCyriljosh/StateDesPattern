public class OutOfOrderState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Machine is out of order. Cannot select item.");
    }
    public void insertCoin(VendingMachine machine) {
        System.out.println("Machine is out of order. Cannot insert coin.");
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Machine is out of order. Cannot dispense item.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is already out of order.");
    }
}