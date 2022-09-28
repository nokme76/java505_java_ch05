package lastWordGame;

import java.util.Scanner;

public class Player {

    Scanner scan = new Scanner(System.in);
    public String name;



    public String  getWordFromUser()
    {
        return scan.next();
    }


    public boolean checkSuccess(char firstChar, char lastChar)
    {
        if (lastChar == firstChar)
        {
            return true;
        }
        return false;
    }

}
