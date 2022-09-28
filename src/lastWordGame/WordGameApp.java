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
        String word = "아버지";

        int i = 0;
        while(true)
        {
            for (int j = 0 ;j<p.length;j++)
            {
                if (i == p.length)
                {
                    i = 0;
                }
            }
            int lastIndex = word.length() -1; //마지막 문자 인덱스
            char lastChar = word.charAt(lastIndex);// 마지막 문자
            System.out.print(p[i].name + ">>");
            String userWord = p[i].getWordFromUser();
            char firstChar = userWord.charAt(0); // 첫번째 문자


            if (p[i].checkSuccess(firstChar, lastChar) == false)
            {
                System.out.print(p[i].name + "이 졌습니다.");
                break;
            }
            else
            {
                word = userWord;
                i++;
            }

        }


    }


    public static void main(String[] args){




        run();

    }

}
