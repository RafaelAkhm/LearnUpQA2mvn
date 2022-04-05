import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StaticTest {

    @Test

    public void NumbersOutPlayers() {
        int[] speedOfPlayer = {0, 3, 2 };

        int expected = 2;
        int actual = Statistic.numberOfDropouts(speedOfPlayer);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void MassOutPlayers() {
        int[] speedOfPlayer = {0, 3, 2 };
        int[] expected = {3, 2};
        int[] actual = Statistic.speedsOfDropped(speedOfPlayer);}
    @Test

    public void MassStayPlayers() {
        int[] speedOfPlayer = {0, 3, 2 };
        int[] expected = {0};
        int[] actual = Statistic.speedsOfNotDropped(speedOfPlayer);}

    @Test

    public void MAX_SPEED() {
        int[] speedOfPlayer = {0, 3, 2};
        int[] expected = {3};
        int[] actual = Statistic.MAX_SPEED(speedOfPlayer);}
}
