import package1.B;

public class Main {
    public static void main(String[] args) {
//        2022-09-27
        System.out.println("----- 상속 -----");

        Point p = new Point();
        p.set(1, 2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("red");
        cp.showColorPoint();

//        문제1) 클래스 SumSub와 MultiDiv을 생성하고, Sumsub에는 멤버 변수 num1, num2 멤버 메서드 sum(),sub()를 가지도록 하며
//        MultiDiv에는 멤버 변수 result, 멤버 메서드 multi(), div() 를 가지도록 하고, 마지막으로 Calculator 클래스를 생성하여
//        두 개의 클래스 모두를 상속 받아 모든 기능을 사용할 수 있는 클래스로 작성하고, 각각 사칙연산을 수행하시오

//        1. SumSub > MultiDiv > Calculator 순서대로 상속받기
//        2.Calculator클래스는 나머지 연산을 위한 멤버 메서드 other()를 가지고 있음

        Calculator cal = new Calculator();

        cal.num1 = 5;
        cal.num2 = 3;

        cal.result = cal.sum();
        System.out.println(cal.num1 + " + " + cal.num2 +"의 덧셈은 : " + cal.result);
        cal.result = cal.sub();
        System.out.println(cal.num1 + " - " + cal.num2 +"의 뺄셈은 : " + cal.result);
        cal.result = cal.multi();
        System.out.println(cal.num1 + " * " + cal.num2 +"의 곱셈은 : " + cal.result);
        cal.result = cal.div();
        System.out.println(cal.num1 + " / " + cal.num2 +"의 나눗셈은 : " + cal.result);
        cal.result = cal.other();
        System.out.println(cal.num1 + " % " + cal.num2 +"의 나머지는 : " + cal.result);

//        문제2) 234p 실습문제 1
        System.out.println("----super----");

        NamedCircle w = new NamedCircle(5, "waffle");
        w.show();
                                                    System.out.println("\n\n");

        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

        System.out.println("모델 : " + dmbCellPhone.model);
        System.out.println("색상 : " + dmbCellPhone.color);

        System.out.println("채널 : " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("나야");
        dmbCellPhone.sendVoice("거기 잘 지내니");
        dmbCellPhone.hengUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();

        System.out.println("\n");

        Student std = new Student("홍길동" , "123456-1234567", 1);

        System.out.println("학생의 이름은 : " + std.name + "\t주민번호는 : " + std.ssn + "\t학생 출석번호는 : " + std.studentNo);

        System.out.println("\n");

        int r = 10;
        Calculator1 calculator1 = new Calculator1();
        System.out.println("원 면적 : " + calculator1.areaCircle(r));
        System.out.println(calculator1.sum());
        System.out.println(calculator1.sub());
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적 : " + computer.areaCircle(r));
        System.out.println(computer.sum());
        System.out.println(computer.sub());
        System.out.println();



        System.out.println("\n");
        SupersonicAirplaneEx supersonicAirplaneEx = new SupersonicAirplaneEx();
        supersonicAirplaneEx.execute();

        System.out.println("\n");

        B b = new B();
        b.method();
    }
}