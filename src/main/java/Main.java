
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
        System.out.println("Скорость выбывающих " + Arrays.toString(speedsOfDropped));
        int[] speedsOfNotDropped = Statistic.speedsOfNotDropped(speedOfPlayer);
        System.out.println("Скорость не выбывающих " + Arrays.toString(speedsOfNotDropped));
        int[] speedsOfNotDropped = Statistic.MAX_SPEED(speedOfPlayer);
        System.out.println("Скорости игроков выбывшие по превышению максимальной скорости " + Arrays.toString(MAX_SPEED));
    }
}
       
