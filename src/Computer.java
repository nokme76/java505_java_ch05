public class Computer extends Calculator1{
    @Override
    double areaCircle(double r)
    {
        System.out.println("Computer 객체의 areaCircle() 실행");
        System.out.println("수정된 메소드의 내용임");
        return Math.PI * r * r;
    }

    @Override
    int sum()
    {
        System.out.println("오버라이딩 하여 출력하기 : " + (10 + 20));
        return 20 + 10;
    }


//    @Override 적지 않아도 작동은 하지만 수정 시 부모 클래스의 메소드를 재정의 한게 아닌
//    새로운 메소드가 되버림 오버로딩
    int sub()
    {
        System.out.println("오버라이딩 하여 출력하기 : " + (10 - 3));
        return 10 - 3;
    }
}
