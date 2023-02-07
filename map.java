public class map{

    private FieldType fieldType[][];
    
    public map(FieldType[][] fieldType){
        this.fieldType = new FieldType[3][3];
        this.fieldType[0][0] = FieldType.GROUND;
        this.fieldType[0][1] = FieldType.GROUND;
        this.fieldType[0][2] = FieldType.GROUND;
        this.fieldType[1][0] = FieldType.EXIT;
        this.fieldType[1][1] = FieldType.WALL;
        this.fieldType[1][2] = FieldType.GROUND;
        this.fieldType[2][0] = FieldType.WALL;
        this.fieldType[2][1] = FieldType.TREASURE;
        this.fieldType[2][2] = FieldType.GROUND;
        
    }

    public boolean canIndyMoveTo(int x, int y){
        if(x < 0 || x > 2 || y < 0 || y > 2)
            return false;
        if(fieldType[x][y] == FieldType.WALL)
            return false;
        else
            return true;
    }

    public boolean tryTakeTreasure(int x, int y){
        if(fieldType[x][y] == FieldType.TREASURE){
            fieldType[x][y] = FieldType.GROUND;
            return true;
        }
        else
            return false;
    }

    public void revealMap(Indy indy){
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3;j++){
                if(indy.getX() == i && indy.getY() == j)
                    System.out.print("I");
                else
                    System.out.print(FieldType.getSign(fieldType[i][j]));
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public FieldType getFieldType(int x, int y){
        return fieldType[x][y];
    }

}