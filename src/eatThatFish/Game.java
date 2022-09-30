package eatThatFish;

public class Game {
    public static void main(String []args)
    {
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

    }
}
