package eatThatFish;

public class Fish extends GameObject{

    public Fish()
    {
        super(15,5,1);
    }

    @Override
    public void move()
    {
        for (int i = 0; i<5; i++ )
        {
            if (i>2)
            {
                int randomMove = (int)(Math.random()*4)+1;

                if (randomMove == 1) //왼쪽 이동
                {
                    y--;
                }
                else if (randomMove == 2) //아래 이동
                {
                    x++;
                }
                else if (randomMove == 3)//위쪽 이동
                {
                    x--;
                }
                else//오른쪽 이동
                {
                    y++;
                }
            }
        }
    }

    @Override
    public char getShape(){return '&';}
}
