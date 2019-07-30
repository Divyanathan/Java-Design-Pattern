package structural.pattern.decorator;

public class SmartPhone extends PhoneDecorator implements VideoCall {

    public SmartPhone(Phone pPhone) {
        super(pPhone);
    }


    @Override
    public void call() {
        mPhone.call();
        System.out.println("Smart phone call function with Video");
        videoCall();
    }

    @Override
    public void videoCall() {
        System.out.println("Video call function");
    }
}
