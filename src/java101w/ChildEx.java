package java101w;

import java101w.Child;
import java101w.Parent;

public class ChildEx {
    public static void main(String [] args)
    {
//        java101w.Child child = new java101w.Child();
//
//        java101w.Parent parent = new java101w.Parent();
//        parent.method1();
//        parent.method2();
//

        Parent parent = new Parent();
        parent.method1();
        parent.method2();

        System.out.println("--------------------");

        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();

        System.out.println("--------------------");

//        다형성 : 부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입하여 부모 클래스 타입의 객체 인것처럼 사용하는 것,
//         실제 결과물은 자식 클래스 타입의 객체가 가지고 있는 데이터로 출력
        parent = child;
        parent.method1();
        parent.method2();
//        부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입했을 경우 자동 형변환이 발생하여
//        자식 클래스 타입의 객체가 전용으로 가지고 있던 멤버를 활용할수 없음
//        부모 클래스 멤버만 사용할수 있음
//        parent.method3();







    }
}
