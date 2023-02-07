public class Game {
    private Indy indy;
    private map Map;
    private FieldType fieldType[][];
    
    public Game(){
        Map = new map(fieldType);
        indy = new Indy(2, 2);
    }

    public boolean gameContinues(){
        if(Map.getFieldType(indy.getX(),indy.getY()) == FieldType.EXIT && indy.getHasTreasure() == true)
            return false;
        else
            return true;
    }

    public void moveIndy(Character direction){
        indy.move(direction, Map);
    }

    public void HUD(){
        System.out.println("Map:");
        Map.revealMap(indy);
        indy.gameStats();
        System.out.print("w - up, a - left, s - down, d - right\n");
        if(Map.getFieldType(indy.getX(),indy.getY()) == FieldType.EXIT)
            if(indy.getHasTreasure() == true)
                System.out.print("Indy left with treasure");
            else
                System.out.print("Indy will not leave without treasure");
    }
}
