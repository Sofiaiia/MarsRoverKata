import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MarsRoverKataTest {

    @Test
    public void StartPoint(){
        MarsRoverKata MRK = new MarsRoverKata();
        MRK.startPosition(1,2,'N');

        Assert.assertEquals(1, MRK.getX());
        Assert.assertEquals(2, MRK.getY());
        Assert.assertEquals('N', MRK.getDirection());
    }

    @Test
    public void wrongStartPoint(){
        MarsRoverKata MRK = new MarsRoverKata();

        NumberFormatException exeption = assertThrows(NumberFormatException.class, () ->{
            MRK.startPosition(-1,2,'N');
        });
        Assert.assertEquals("Not accepted value", exeption.getMessage());

        NumberFormatException exeption2 = assertThrows(NumberFormatException.class, () ->{
            MRK.startPosition(1,2,'U');
        });
        Assert.assertEquals("Not accepted value", exeption2.getMessage());
    }

    @Test
    public void commands(){
        MarsRoverKata MRK = new MarsRoverKata();
        MRK.startPosition(1,2,'N');

        Assert.assertEquals("L,B,R,F,L,F,R", MRK.moveRover("L,B,R,F,L,F,R"));
    }

    @Test
    public void moveForwardBackwards(){
        MarsRoverKata MRK = new MarsRoverKata();
        MRK.startPosition(1,2,'N');
        MRK.moveRover("F,B,F,F,B");

        Assert.assertEquals(3,MRK.getY());

        MarsRoverKata MRK2 = new MarsRoverKata();
        MRK2.startPosition(1,2,'S');
        MRK2.moveRover("F,B,F,F,B");

        Assert.assertEquals(1,MRK2.getY());
    }

    @Test
    public void rotate(){
        MarsRoverKata MRK = new MarsRoverKata();
        MRK.startPosition(1,2,'N');
        MRK.moveRover("L,R,R");

        Assert.assertEquals('E',MRK.getDirection());

        MarsRoverKata MRK2 = new MarsRoverKata();
        MRK2.startPosition(1,2,'S');
        MRK2.moveRover("R,R,R");

        Assert.assertEquals('E',MRK2.getDirection());

    }

    @Test
    public void wrapping(){
        MarsRoverKata MRK = new MarsRoverKata();
        MRK.startPosition(1,2,'N');
        MRK.moveRover("F,F,F,F");

        Assert.assertEquals(1,MRK.getY());

    }

    @Test
    public void testOtherCommand(){
        MarsRoverKata MRK = new MarsRoverKata();
        MRK.startPosition(1,2,'N');
        MRK.moveRover("F,hokus pokus,B");

        Assert.assertEquals(2,MRK.getY());

    }

}
