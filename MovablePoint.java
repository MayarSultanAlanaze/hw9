public class MovablePoint {
    int x;
    int y;
    int speedX;
    int speedY;

    public MovablePoint(int x,int y,int speedX,int speedY){
        this.x=x;
        this.y=y;
        this.speedX=speedX;
        this.speedY=speedY;

    }

    public  void moveUp(){
        y-=speedY;
        System.out.println("TO moveUp"+y);
      }

    public  void Down(){
        y+=speedY;
        System.out.println("TO Down"+y);
    }


    public  void left(){
        x-=speedX;
        System.out.println("TO left"+x);
    }

    public  void right(){
        x+=speedX;
        System.out.println("TO right "+x);
    }


}


