package Interface;

public interface MyInterface {
    void method1();


//    해당 interface를 구현하는 구현체가 여러개 존재할 경우에 구현체의 수정없이 기능을 추가하고자 하는 경우에 사용 하는 것이 디폴트 메서드임
    default void method2(){ //디폴트메서드2 실행부
        System.out.println("MyInterface method2() 실행");
    }
}
