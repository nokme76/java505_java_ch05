package Interface;

public class Driver2Ex {
    public static void main(String [] args)
    {
        System.out.println("각각 객체를 생성하여 실행");
        Bus2 bus2 = new Bus2();
        Taxi2 taxi2 = new Taxi2();

        bus2.run();
        taxi2.run();

//        익명객체는 가능
        Vehicle2 vehicle2 = new Vehicle2() {
            @Override
            public void run() {
                System.out.println("차량이 달립니다.");
            }
        };

        vehicle2.run();

        System.out.println("\n부모 인터페이스 타입의 변수에 자식 객체를 대입");
        vehicle2 = bus2;
        vehicle2.run();
        vehicle2 = taxi2;
        vehicle2.run();

        System.out.println("\n인터페이스 변수를 매개변수로 사용 시");
        Driver2 driver2 = new Driver2();
        driver2.drive(bus2);
        driver2.drive(taxi2);



        System.out.println("\n----------자동 타입변환, 강제 타입변환, instanceof -----=\n");

//        자동 타입 변환, 부모인 Vehicle2 인터페이스 타입의 변수에 자식인 bus2클래스 타입의 객체를 대입
        System.out.println("------------자동타입변환--------------");
        Vehicle2 vehicle21 = new Bus2();
        vehicle21.run();

//        데이터 타입이 다르므로 강제 타입변환을 시도 해야함
//        강제 타입 변환의 조건 : 원본이 자식클래스 타입의 객체일때 해당 클래스 타입으로 변환 시 가능
//        원본 클래스 객체 타입이 변환하려는 클래스 타입의 객체인지 확인 하려면 instanceof 연산자를 사용해야 함
        System.out.println("\n------------강제타입변환--------------");
        Bus2 bus21 = (Bus2) vehicle21;
        bus21.run();

        System.out.println("\n------------instanceof--------------");
        Vehicle2 vehicle22 = new Bus2();
        vehicle22.run();

        if (vehicle22 instanceof Taxi2)
        {
        Taxi2 taxi22 = (Taxi2) vehicle22;
        taxi22.run();
            System.out.println("정상적으로 Taxi2 클래스 타입으로 변경 했습니다.");
        }
        else
        {
            System.out.println("Taxi2 클래스 타입으로 변경 하지 못했습니다.");
        }










    }
}
