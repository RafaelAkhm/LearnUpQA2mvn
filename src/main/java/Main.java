
public class Main {

    public static void main(String[] args) {
        System.out.println("Start game!");
        int[] speedOfPlayers = {3, 0, 0, 4, 1};

        int expected = 3;
        int actual = Statistic.speedPlOut(speedOfPlayers);
        System.out.println("1.Количество выбывающих " + "ОР: " + expected + "; ФР: " + actual);

        int[] expected2 = {3, 4, 1};
        int[] actual2 = Statistic.massOutPlayers(speedOfPlayers);

        System.out.println("2.Массив скоростей выбывших игроков " + "ОР: " + expected2 + ";" + " ФР: " + actual2 + ";");


        int[] expected3 = {0, 0};
        int[] actual3 = Statistic.massStayPlayers(speedOfPlayers);

        System.out.println("3.Массив скоростей оставшихся в игре игроков " + "ОР: " + expected3 + ";" + " ФР: " + actual3 + ";");

        int[] expected4 = {4};
        int[] actual4 = Statistic.MAX_SPEED(speedOfPlayers);

        System.out.println("4.Массив скоростей игроков выбывшие по превышению максимальной скорости " + "ОР: " + expected4 + ";" + " ФР: " + actual4 + ";");
    }
}