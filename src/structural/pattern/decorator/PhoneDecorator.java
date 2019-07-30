package structural.pattern.decorator;

abstract class PhoneDecorator implements Phone {

    Phone mPhone;

    public PhoneDecorator(Phone pPhone) {
        mPhone = pPhone;
    }
}
