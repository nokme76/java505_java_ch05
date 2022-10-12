package Interface;

public class RemoteControlEx {
    public static void main(String[] args)
    {
//        인터페이스 타입의 객체를 생성이 불가능
//        인터페이스 타입의 변수는 생성 가능
        RemoteControl rc;
//        다형성에 의해서 인터페이스 타입의 변수에 자식 클래스 타입의 객체를 대입하는 것이 가능함
        rc = new Television();
        rc.turnOn();
        rc.setVolume(3);
        rc.setVolume(15);
        rc.turnOff();

        System.out.println("-----------------------------");
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(3);
        rc.setMute(true);
        rc.setMute(false);
        rc.setVolume(-5);
        rc.turnOff();

        System.out.println("-----------------------------");
        rc = new RemoteControl() {
            private int volume;
            @Override
            public void turnOn() {
                System.out.println("radio 전원을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("radio 전원을 끕니다.");
            }

            @Override
            public void setVolume(int volume) {

                if (volume > RemoteControl.MAX_VOLUME)
                {
                    this.volume = RemoteControl.MAX_VOLUME;
                }
                else if (volume < RemoteControl.MIN_VOLUME)
                {
                    this.volume = volume;
                }
                else
                {
                    this.volume = volume;
                }
                System.out.println("현재 radio 볼륨은 :" + this.volume);
            }
        };

        rc.turnOn();
        rc.setVolume(50);
        rc.setMute(true);
        rc.turnOff();
//        changeBattery() 는 정적 메서드 이므로 인터페이스명.changeBattery()로 호출 해야 함
//        rc.changeBattery();
        RemoteControl.changeBattery();

        System.out.println("--------------인터페이스 다중 구현---------------");
        SmartTelevision stv = new SmartTelevision();
        stv.turnOn();
        stv.setVolume(30);
        stv.setMute(true);
        stv.setVolume(-50);
        stv.search("naver");
        stv.turnOff();
    }
}
