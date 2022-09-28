package lastWordGame;

import java.util.Scanner;

public class WordGameApp {
    static Scanner scan = new Scanner(System.in);

    public static void run()
    {
        System.out.print("게임에 참가하는 인원은 몇명입니까?>>");
        int playerNumber = scan.nextInt();
        Player p[] = new Player[playerNumber];


        for (int i = 0; i<p.length; i++)
        {
            System.out.print("참가자의 이름을 입력하세요>>");
            Player player = new Player();
            player.name = scan.next();

            p[i] = player;
        }

        System.out.println("시작 단어는 아버지 입니다");

        while(true)
        {
            int i = 0;
            System.out.print(p[i].name + ">>");
            String answer =scan.next();

            p[i].getWordFromUser(answer);

            if (p[i].checkSuccess()== false)
            {
                System.out.println(p[i].name + "이 졌습니다.");
                break;
            }
            i++;


        }


    }


    public static void main(String[] args){




        run();

    }

}
