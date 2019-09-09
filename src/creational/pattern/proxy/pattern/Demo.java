package creational.pattern.proxy.pattern;

public class Demo {
    public static void main(String[] args) {
        AccountProxy lAccountProxy = new AccountProxy("Simon","5678");
        lAccountProxy.create();
        lAccountProxy.modify();
        lAccountProxy.delete();
        lAccountProxy.deposit();
        lAccountProxy.withdraw();
        lAccountProxy.transfer();
    }
}
