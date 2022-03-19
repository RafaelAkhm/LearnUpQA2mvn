class Color {

    static boolean isReedLight = true;
}


public class Statistic {

    static int speedPlOut(int[] speedOfPlayers) {



        int speedPlOut = 0;
        if (Color.isReedLight) {
            for (int e : speedOfPlayers) {
                if (e > 0) speedPlOut++;
            }

        }
        return speedPlOut;


    }

    static int[] massOutPlayers(int[] speedOfPlayers) {
        int[] massOutPlayers = { 3, 4, 1};
        for (int i = 0; i < massOutPlayers.length; i++) {
            if (Color.isReedLight && massOutPlayers[i] > 0){
                massOutPlayers = massOutPlayers;
            }
        }
        return massOutPlayers;
    }
    static int[] massStayPlayers(int[] speedOfPlayers) {
        int[] massStayPlayers = new int [2];
        for (int i = 0; i < massStayPlayers.length; i++) {
            if (Color.isReedLight && massStayPlayers[i] ==0){
                massStayPlayers = massStayPlayers;
            }
        }
        return massStayPlayers;
    }

    static int[] MAX_SPEED(int[] speedOfPlayers) {
        int max = 3;
        for (int i = 0; i < speedOfPlayers.length; i++) {
            if (Color.isReedLight && speedOfPlayers[i] > max) ;
        }
        return speedOfPlayers;
    }
}
