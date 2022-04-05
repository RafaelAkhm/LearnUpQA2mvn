import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
                Statistic.isGreenLight = false;
                int[] speedOfPlayer = new int[3];
                speedOfPlayer[0] = 0;
                speedOfPlayer[1] = 3;
                speedOfPlayer[2] = 2;
                int numberOfDropouts = Statistic.numberOfDropouts(speedOfPlayer);
                System.out.println("Количество выбывших игроков " + numberOfDropouts);
                int[] speedsOfDropped = Statistic.speedsOfDropped(speedOfPlayer);
                System.out.println("Скорость выбывающих " + Arrays.toString(Statistic.speedsOfDropped(speedOfPlayer)));
                int[] speedsOfNotDropped = Statistic.speedsOfNotDropped(speedOfPlayer);
                System.out.println("Скорость не выбывающих " + Arrays.toString(Statistic.speedsOfNotDropped(speedOfPlayer)));
                int[] MAX_SPEED = Statistic.MAX_SPEED(speedOfPlayer);
                System.out.println("Скорости игроков выбывшие по превышению максимальной скорости " + Arrays.toString(Statistic.MAX_SPEED(speedOfPlayer)));
       
        }

}
