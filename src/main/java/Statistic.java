public class Statistic {
    static int speedPlOut(int[] speedOfPlayers) {


        boolean isRedLight = false;
        int speedPlOut = 0;
        if (isRedLight = true) {
            for (int e : speedOfPlayers) {
                if (e > 0) speedPlOut++;
            }

        }
        return speedPlOut;


    }

    static int[] massOutPlayers(int[] speedOfPlayers) {
        boolean isRedLight = false;
        int[] massOutPlayers = {3, 4, 1};
        for (int i = 0; i < massOutPlayers.length; i++) {
            if (isRedLight == false && massOutPlayers[i] > 0) {
                massOutPlayers = massOutPlayers;
            }
        }
        return massOutPlayers;
    }

    static int[] massStayPlayers(int[] speedOfPlayers) {
        boolean isRedLight = false;
        int[] massStayPlayers = new int[2];
        for (int i = 0; i < massStayPlayers.length; i++) {
            if (isRedLight == false && massStayPlayers[i] == 0) {
                massStayPlayers = massStayPlayers;
            }
        }
        return massStayPlayers;
    }
}
