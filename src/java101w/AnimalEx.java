package java101w;

import java101w.Animal;

public class AnimalEx {

    public static void animalSound(Animal animal)
    {
        animal.sound();
    }

    public static void main(String [] args)
    {
        Dog dog = new Dog("멍멍이");
        Cat cat = new Cat("야옹이");

        dog.sound();
        dog.breathe();
        cat.sound();
        cat.breathe();
        System.out.println("------------------------");


//        추상 클래스 타입의 변수를 선언하는 것은 문제가 없음
//        클래스의 형변환
        Animal animal;
        animal = new Dog("멍멍이");
        animal.sound();

        animal = new Cat("고양이");
        animal.sound();

//        다형성
        System.out.println("------------------------");
        animalSound(new Dog("멍멍이"));
        animalSound(new Cat("고양이"));

//        객체 생성이 불가능
//        animal = new java101w.Animal();
    }
}
