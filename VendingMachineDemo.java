public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        
        machine.selectItem();
        machine.insertCoin();
        machine.dispenseItem();
        
        machine.setOutOfOrder();
        machine.selectItem();
        machine.insertCoin();
        machine.dispenseItem();
    }
}