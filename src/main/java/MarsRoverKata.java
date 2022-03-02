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

        return commands;
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
