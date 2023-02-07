public enum FieldType {
        GROUND,
        WALL,
        TREASURE,
        EXIT;

        public static String getSign(FieldType type){
            if(type == GROUND)
                return ".";
            if(type == WALL)
                return "X";
            if(type == TREASURE)
                return "T";
            if(type == EXIT)
                return "E";
            return "";
        }
    }


