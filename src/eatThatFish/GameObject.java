package eatThatFish;

public abstract class GameObject { //추상 클래스
    protected int distance; //한번 이동 거리
    protected int x,y ; //현재 위치(화면 맵 상의 위치)

    public GameObject(int startX, int startY, int distance) //초기 위치와 이동거리 설정
    {
        this.x = startX;
        this.y = startY;
        this.distance = distance;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public boolean collide(GameObject p) //이 객체가 객체 p와 충돌했으면 true 리턴
    {
        if(this.x == p.getX() && this.y == p.getY())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    protected abstract void move();
    protected abstract char getShape();
}
