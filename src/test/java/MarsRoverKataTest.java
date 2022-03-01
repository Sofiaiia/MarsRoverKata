import org.junit.Assert;
import org.junit.Test;

public class MarsRoverKataTest {

    @Test
    public void StartPoint(){
        MarsRoverKata MRK = new MarsRoverKata();
        MRK.startPosition(1,2,'N');

        Assert.assertEquals(1, MRK.getX());
        Assert.assertEquals(2, MRK.getY());
        Assert.assertEquals('N', MRK.getDirection());
    }
}
