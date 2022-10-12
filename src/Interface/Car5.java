package Interface;

public class Car5 {
    TireI[] tires = new TireI[4];
//    or
//    TireI[] tires = {
//            new HankookTire2(),
//            new HankookTire2(),
//            new HankookTire2(),
//            new HankookTire2()
//}


    public Car5(){
        for (int i = 0; i < tires.length ; i++) {
            tires[i] = new HankookTire2();
        }
    }

    void run()
    {
        for (TireI item : tires)
        {
            item.roll();
        }
    }
}
