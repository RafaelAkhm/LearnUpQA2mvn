import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StaticTest {
    @Test

    public void NumbersOutPlayers() {
        int[] speedOfPlayers = {3, 0, 0, 4, 1};

        int expected = 3;
        int actual = Statistic.speedPlOut(speedOfPlayers);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void MassOutPlayers() {
        int[] speedOfPlayers = {3, 0, 0, 4, 1};

        int[] expected = {3, 4, 1};
        int[] actual = Statistic.massOutPlayers(speedOfPlayers);


    }
    @Test

    public void MassStayPlayers() {
        int[] speedOfPlayers = {3, 0, 0, 4, 1};

        int[] expected = {0, 0};
        int[] actual = Statistic.massOutPlayers(speedOfPlayers);


    }

    @Test

    public void MAX_SPEED() {
        int[] speedOfPlayers = {3, 0, 0, 4, 1};

        int[] expected = {4};
        int[] actual = Statistic.MAX_SPEED(speedOfPlayers);


    }

}

