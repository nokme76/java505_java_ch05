package Interface;

public class DefaultMethodEx {
    public static void main(String []args)
    {
        MyInterface m1 = new MyClassA(); //알맹이는 MyClassA지만 다형성으로 부모인터페이스에 대입
        m1.method1(); //추상메서드 오버라이딩
        m1.method2(); //디폴트메서드 재정의 하지 않음 부모의 메서드 불러옴

        MyInterface m2 = new MyClassB();
        m2.method1(); //오버라이딩
        m2.method2(); //오버라이딩



    }
}
