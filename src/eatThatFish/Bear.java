package eatThatFish;


import java.util.Scanner;

public class Bear extends GameObject{

    Scanner scan = new Scanner(System.in);


    public Bear()
    {
        super(1,1,1);
    }


    @Override
    public void move()
    {
        System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(d) >>");
        String userSelec = scan.next();
        if (userSelec.equals("a")) //왼쪽 이동
        {
            y--;
        }
        else if (userSelec.equals("s")) //아래 이동
        {
            x++;
        }
        else if (userSelec.equals("w"))//위쪽 이동
        {
            x--;
        }
        else if (userSelec.equals("d"))//오른쪽 이동
        {
            y++;
        }
        else
        {
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    @Override
    public char getShape()
    {
        return 'B';
    }


}