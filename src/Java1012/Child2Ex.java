package Java1012;

public class Child2Ex {
    public static void main(String[] args){

//     자동 타입 변환
//     부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입하면 부모 클래스 타입의 멤버만 사용이 가능(자식클래스 타입의 객체가 알맹이)
        Parent2 parent2 = new Child2();
        parent2.field1 = "data1";
        parent2.method1();
        parent2.method2();

//      자식 클래스 멤버는 사용 불가능
//      parent2.field2 = "데이터2";
//      parent2.method3();

        System.out.println("-------자식 클래스 타입 변수에 자식 클래스 타입의 객체 대입----------");
//       부모클래스 멤버 상속으로 사용가능하며 본인 멤버도 사용가능
        Child2 child2 = new Child2();
        child2.field1 = "데이터 1";
        child2.field2 = "데이터 1";
        child2.method1();
        child2.method2();
        child2.method3();

    System.out.println("---------다시 자식 클래스 타입으로 돌아갈때-----------");

//      Child2 child21 = parent2;    오류가남
        Child2 child21 = new Child2();
        child21.field1 = "상속 받은 멤버 변수";
        child21.field2 = "Child2 전용 멤버 변수";
        System.out.println("객체 child21 의 field1 출력 : " + child21.field1);
        System.out.println("객체 child21 의 field2 출력 : " + child21.field2);
        System.out.println(" 객체 child21 의 method1() 실행 ");
        child21.method1();
        System.out.println(" 객체 child21 의 method2() 실행 ");
        child21.method2();
        System.out.println(" 객체 child21 의 method3() 실행 ");
        child21.method3();

        System.out.println("\n부모 객체로 자동 타입 변환\n");

//      부모 클래스 타입의 변수에 자식 클래스 타입 객체 대입
        Parent2 parent21 = child21;
        System.out.println("객체 paren21 의 field1 출력 : " + parent21.field1);
//      에러 (자식 클래스 전용 멤버)
//      System.out.println("객체 paren21 의 field2 출력 : " + parent21.field2);
        System.out.println(" 객체 paren21 의 method1() 실행 ");
        parent21.method1();
        System.out.println(" 객체 paren21 의 method2() 실행 ");
        parent21.method2();
//      System.out.println(" 객체 paren21 의 method3() 실행 ");
//      parent21.method3();

        System.out.println("\n다시 자식 클래스 타입으로 변환\n");

//      자식 클래스 타입의 변수에 부모 클래스 타입의 객체를 대입하면 오류 발생
//      원본 객체를 자식 클래스 타입의 변수로 타입 변환 시 해당 객체의 모든 멤버를 가지고 있는지 알 수 없기 때문에 강제 타입변환을 해야 함
//      Child2 child22 = parent21;
        Child2 child22 = (Child2) parent21;

        child22.field1 = "상속 받은 멤버 변수";
        child22.field2 = "Child2 전용 멤버 변수";
        System.out.println("객체 child22 의 field1 출력 : " + child22.field1);
        System.out.println("객체 child22 의 field2 출력 : " + child22.field2);
        System.out.println(" 객체 child22 의 method1() 실행 ");
        child22.method1();
        System.out.println(" 객체 child22 의 method2() 실행 ");
        child22.method2();
        System.out.println(" 객체 child22 의 method3() 실행 ");
        child22.method3();


        System.out.println("\n다시 자식 클래스 타입으로 변환되는 조건\n");
//      1. 원본이 자식 클래스 타입이어야 해당하는 자식 클래스 타입으로 변환이 가능

////       원본이 부모 클래스 타입
//        Parent2 parent23 = new Parent2();
////       자식 클래스 타입의 변수 선언
//        Child2 child23;
////      자식 클래스 타입의 변수에 부모 클래스 타입의 객체를 대입
////      문법상 오류는 없으나 원본이 자식 클래스 타입의 객체가 아니기 때문에 런타임 에러가 발생함
//        child23 = (Child2) parent23;
////      자식 클래스 탕비의 객체의 멤버 사용
//        child23.method3();

        Parent2 parent24 = new Child2();
        castMethod1(parent24);
        castMethod2(parent24);
        System.out.println("------------------");
        Parent2 parent25 = new Parent2();
        castMethod1(parent25);
        castMethod2(parent25);




    }

    public  static void  castMethod1(Parent2 parent)
    {
//        instanceof 연산자를 사용하면 현재의 객체가 지정한 타입의 객체인지 확인이 가능함
        if (parent instanceof Child2)
        {
            Child2 child = (Child2) parent;
            System.out.println("castMethod1 - Child2 로 변환 성공");
        }
        else
        {
            System.out.println("castMethod1 - Child2 로 변환 되지 않음");
        }
    }

    public  static void  castMethod2(Parent2 parent)
    {
//        원본 객체가 변환하려는 클래스 타입의 객체가 아닐 수 있기 때문에 오류가 발생할 수 있음
            Child2 child = (Child2) parent;
            System.out.println("castMethod2 - Child2 로 변환 성공");
    }
}
