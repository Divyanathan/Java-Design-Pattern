package structural.pattern.decorator;

public class KeyPadPhone extends PhoneDecorator implements AudioRecorder{

    public KeyPadPhone(Phone pPhone) {
        super(pPhone);
    }

    @Override
    public void call() {
        mPhone.call();
        System.out.println("KeyPad phone Call With Recording audio");
        recordVoice();
    }

    @Override
    public void recordVoice() {
        System.out.println("Recording audio");
    }
}
