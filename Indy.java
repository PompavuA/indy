public class Indy{
    private int x;
    private int y;
    private int steps = 0;
    private boolean hasTreasure = false;
    public Indy(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(Character direction, map Map){
        if(direction == 'w' && Map.canIndyMoveTo(getX()-1, getY()) == true){
            this.x-=1;
            steps++;
        }
        if(direction == 's' && Map.canIndyMoveTo(getX()+1, getY()) == true){
            this.x+=1;
            steps++;
        }
        if(direction == 'a' && Map.canIndyMoveTo(getX(), getY()-1) == true){
            this.y-=1;
            steps++;
        }
        if(direction == 'd' && Map.canIndyMoveTo(getX(), getY()+1) == true){
            this.y+=1;
            steps++;
        }
        if(Map.tryTakeTreasure(getX(), getY()) == true)
            hasTreasure = true;
    }

    public void gameStats(){
        if(getHasTreasure() == true)
            System.out.format("# of steps: %d and Indy has treasure\n", steps);
        else
            System.out.format("# of steps: %d and indy does not have the treasure\n", steps);
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public boolean getHasTreasure(){
        return this.hasTreasure;
    }
}