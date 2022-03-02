public class MarsRoverKata {

    private int x;
    private int y;
    private char direction;

    public void startPosition(int x, int y, char direction){
        setX(x);
        setY(y);
        setDirection(direction);
    }

    public String moveRover(String commands){
        String[] arr = commands.split(",");
        for (String move: arr) {
            switch (move){
                case "F":
                    moveFrontBack(true);
                    break;
                case "B":
                    moveFrontBack(false);
                    break;
                default:
                    //throw error eller nått
            }
        }

        return commands;
    }

    public void moveFrontBack( boolean moveForward){
        int move = 0;
        if(moveForward){
            move= 1;
        }else{
            move = -1;
        }
        switch (direction){
            case 'N':
                setY(getY() + move);
                break;
            case 'S':
                setY(getY() - move);
                break;
            case 'W':
                setX(getX() - move);
                break;
            case 'E':
                setX(getX() + move);
                break;
            default:
                //throw error eller nått
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getDirection() {
        return direction;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }
}
