package java101w;

import java101w.Animal;

public class Cat extends Animal {
    public Cat(String kind)
    {
        super(kind);
//        this.kind ="포유류";
    }

    @Override
    public void sound()
    {
        System.out.println("야옹");
    }
}
