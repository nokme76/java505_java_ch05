package java101w;

import java101w.SmartPhone;

public class PhoneEx {
    public static void main(String[] args)
    {
        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
//  java101w.Phone 클래스는 추상 클래스 이므로 new 키워드를 통해 객체를 생성 할 수 없음
//    java101w.Phone phone = new java101w.Phone("홍길동")
}
