package Interface;

public class ImplEx {
    public static void main(String[] args)
    {
        System.out.println("구현체 ImplC의 객체 impl은 모든 메서드 사용 가능" );
        ImplC impl = new ImplC();

        impl.methodA();
        impl.methodB();
        impl.methodC();

        System.out.println("\nInterFaceA의 변수에 대입 시");
        InterfaceA ifA = impl;
        ifA.methodA();

        System.out.println("\nInterFaceB의 변수에 대입 시");
        InterfaceB ifB = impl;
        ifB.methodB();

        System.out.println("\nInterFaceC의 변수에 대입 시");
        InterfaceC ifC = impl;
        ifC.methodA();
        ifC.methodB();
        ifC.methodC();



    }
}
