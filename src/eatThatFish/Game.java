package eatThatFish;

import java.util.Scanner;

public class Game {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        char gameMap[][] = new char[10][20];

        for (int i = 0; i<gameMap.length; i++)
        {
            System.out.println();
            for (int j = 0; j<gameMap[i].length; j++)
            {
                gameMap[i][j] = '-';
            }
        }

        Bear b = new Bear();
        Fish f = new Fish();
        gameMap[b.x][b.y] = b.getShape();
        gameMap[f.x][f.y] = f.getShape();



        for (int i = 0; i<gameMap.length; i++)
        {
            System.out.println();
            for (int j = 0; j<gameMap[i].length; j++)
            {
                System.out.print(gameMap[i][j]);
            }
        }

        while(true)
        {
            b.move();
            f.move();

            for (int i = 0; i<gameMap.length; i++)
            {
                System.out.println();
                for (int j = 0; j<gameMap[i].length; j++)
                {
                    gameMap[i][j] = '-';
                }
            }
            gameMap[f.x][f.y] = f.getShape();
            gameMap[b.x][b.y] = b.getShape();


            for (int i = 0; i<gameMap.length; i++)
            {
                System.out.println();
                for (int j = 0; j<gameMap[i].length; j++)
                {
                    System.out.print(gameMap[i][j]);
                }
            }
            if (b.collide(f))
            {
                System.out.print("\n곰은 생선을 찢어");
                break;
            }
        }

    }
}
