package structural.pattern.proxy;

public class Account implements Operation {

    @Override
    public void create() {
        System.out.println("Creating Account");
    }

    @Override
    public void modify() {
        System.out.println("modifying Account details");
    }

    @Override
    public void deposit() {
        System.out.println("Depositing  Amount");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw  Amount");
    }

    @Override
    public void transfer() {
        System.out.println("Transfer  Amount");
    }

    @Override
    public void delete() {
        System.out.println("Delete Account");
    }
}
