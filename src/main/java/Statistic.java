public class Statistic {

    public static boolean isGreenLight = false;
    public static int numberOfDropouts(int[] speedOfPlayer) {
        int countOfPlayers = 0;
        for (int i = 0; i != speedOfPlayer.length; ++i) {
            if (isPlayerDroppedOut(speedOfPlayer[i])) {
                ++countOfPlayers;
            }
        }
        return countOfPlayers;
    }
    public static boolean isPlayerDroppedOut(int speedOfPlayer) {
        if (isGreenLight == false) {
            if (speedOfPlayer != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public static int[] speedsOfDropped(int[] speedOfPlayer) {
        int cnt = numberOfDropouts(speedOfPlayer);
        int[] result = new int[cnt];
        int resultCount = 0;
        for (int i = 0; i != speedOfPlayer.length; ++i) {
            if (isPlayerDroppedOut(speedOfPlayer[i])) {
                result[resultCount] = speedOfPlayer[i];
                ++resultCount;
            }
        }
        return result;
    }
    public static int[] speedsOfNotDropped(int[] speedOfPlayer) {
        int cnt = speedOfPlayer.length - numberOfDropouts(speedOfPlayer);
        int[] result = new int[cnt];
        int resultCount = 0;
        for (int i = 0; i != speedOfPlayer.length; ++i) {
            if (isPlayerDroppedOut(speedOfPlayer[i]) == false) {
                result[resultCount] = speedOfPlayer[i];
                ++resultCount;
            }
        }
        return result;
    }
    static int[] MAX_SPEED(int[] speedOfPlayer) {
        int cnt = 0;
        int[] result = new int[1];
        int resultCount = 0;
        for (int i = 0; i < speedOfPlayer.length; ++i) {
            if (speedOfPlayer[i] > 2) {
                result[resultCount] = speedOfPlayer[i];
              ++resultCount;
            }
        }
        return result;

    }

}
