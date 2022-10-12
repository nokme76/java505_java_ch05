package eatThatFish;

public class Fish extends GameObject{

    public Fish()
    {
        super(6,10,1);
    }
        int i = 0;

    @Override
    public void move()
    {
        i++;
        if (i>3)
        {
            int randomMove = (int)(Math.random()*4)+1;
            if (randomMove == 1) //왼쪽 이동
                {
                    y--;
                    if (y<0)
                    {
                        y = 0;
                    }
                }
                else if (randomMove == 2) //아래 이동
                {
                    x++;
                    if (x>9)
                    {
                        x = 9;
                    }
                }
                else if (randomMove == 3)//위쪽 이동
                {
                    x--;
                    if (x<0)
                    {
                        x = 0;
                    }
                }
                else//오른쪽 이동
                {
                    y++;
                    if (y>19)
                    {
                        y = 19;
                    }
                }
                if (i == 5)
                {
                    i = 0;
                }
        }
    }


    @Override
    public char getShape(){return '&';}
}
