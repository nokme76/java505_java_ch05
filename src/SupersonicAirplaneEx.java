public class SupersonicAirplaneEx {

    public void execute()
    {
        SupersonicAirplane sa = new SupersonicAirplane();

        sa.takeOff();
        sa.fly();
        sa.flymode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flymode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
