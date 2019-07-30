package structural.pattern.decorator;

public class BasicPhone  implements Phone {

    @Override
    public void call() {
        System.out.println("Basic call function ");
    }
}
