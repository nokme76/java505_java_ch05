package Interface;

public class MyClassA implements MyInterface{

    @Override
    public void method1() {
        System.out.println("MyClassA의 method1() 실행");
    }

    //필요없는 기능인 method2()를 오버라이드 할 필요없이 Myinterface에 디폴트메서드 실행부를 주고 필요한 MyclassB에서 재정의 하면됨
}
