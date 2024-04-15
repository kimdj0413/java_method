package lib;

public class SamsungPhone implements PhoneInterface {

    @Override
    public void receiveCall() {
        // TODO Auto-generated method stub
        System.out.println("삼성폰 전화 받다.");
    }

    @Override
    public void sendCall() {
        // TODO Auto-generated method stub
        System.out.println("삼성폰 전화 건다.");
    }
    
}
