public class creacionbarcos {

    // Definimos el número de barcos
    private static int numLanchas = 5;
    private static int numBuques = 3;
    private static int numCrucero = 1;
    private static int numPortaaviones = 1;

    // 5 lanchas, 3 barcos, 1 crucero y 1 portaaviones
    // crucero = z
    // portaaviones = p

    // Aquí crearemos la lancha
    private static void insertarlancha(char[][] mapa) { //solo 1 posicion
        int posLancha[] = funcionrandom.puntoAleatorio(funcionesflota.getTamañoMapa());
        int posCreacionX = posLancha[0];
        int posCreacionY = posLancha[1];
        boolean check = false;
        while (!check) {
            try {
                if (mapa[posCreacionX][posCreacionY] == '-') {
                    ;
                    mapa[posCreacionX][posCreacionY] = 'L';
                    check = true;
                } else {
                    int nuevaPosicion[] = funcionrandom.puntoAleatorio(funcionrandom.getTamañoMapa());
                    posCreacionX = nuevaPosicion[0];
                    posCreacionY = nuevaPosicion[1];
                }
            } catch (Exception e) {
                int nuevaPosicion[] = funcionrandom.puntoAleatorio(funcionesflota.getTamañoMapa());
                posCreacionX = nuevaPosicion[0];
                posCreacionY = nuevaPosicion[1];
                check = false;
            }
        }
    }

    // buque
    private static void insertarbuque(char[][] mapa) { // 3 en horizontal
        int posicionBuque[] = funcionrandom.puntoAleatorio(funcionesflota.getTamañoMapa());
        int posCreacionX = posicionBuque[0];
        int posCreacionY = posicionBuque[1];
        boolean check = false;
        while (!check) {
            try {
                if (mapa[posCreacionX][posCreacionY] == '-' && mapa[posCreacionX][posCreacionY + 1] == '-'
                        && mapa[posCreacionX][posCreacionY + 2] == '-') {
                    mapa[posCreacionX][posCreacionY] = 'B';
                    mapa[posCreacionX][posCreacionY + 1] = 'B';
                    mapa[posCreacionX][posCreacionY + 2] = 'B';
                    check = true;
                } else {
                    int nuevaPosicion[] = funcionrandom.puntoAleatorio(funcionesflota.getTamañoMapa());
                    posCreacionX = nuevaPosicion[0];
                    posCreacionY = nuevaPosicion[1];
                }
            } catch (Exception e) {
                int nuevaPosicion[] = funcionrandom.puntoAleatorio(funcionesflota.getTamañoMapa());
                posCreacionX = nuevaPosicion[0];
                posCreacionY = nuevaPosicion[1];
                check = false;
            }
        }
    }

    // crucero == Z
    private static void insertarcrucero(char[][] mapa) { // 4 en horizontal
        int posCrucero[] = funcionrandom.puntoAleatorio(funcionesflota.getTamañoMapa());
        int posCreacionX = posCrucero[0];
        int posCreacionY = posCrucero[1];
        boolean check = false;
        while (!check) {
            try {
                if (mapa[posCreacionX][posCreacionY] == '-' && mapa[posCreacionX][posCreacionY + 1] == '-' && mapa[posCreacionX][posCreacionY + 2] == '-'
                && mapa[posCreacionX][posCreacionY + 3] == '-') {
                    mapa[posCreacionX][posCreacionY] = 'Z';
                    mapa[posCreacionX][posCreacionY + 1] = 'Z';
                    mapa[posCreacionX][posCreacionY + 2] = 'Z';
                    mapa[posCreacionX][posCreacionY + 3] = 'Z';
                    check = true;
                } else {
                    int nuevaPosicion[] = funcionrandom.puntoAleatorio(funcionesflota.getTamañoMapa());
                    posCreacionX = nuevaPosicion[0];
                    posCreacionY = nuevaPosicion[1];
                }
            } catch (Exception e) {
                int nuevaPosicion[] = funcionrandom.puntoAleatorio(funcionesflota.getTamañoMapa());
                posCreacionX = nuevaPosicion[0];
                posCreacionY = nuevaPosicion[1];
                check = false;
            }
        }
    }

    //portaaviones == P
    private static void insertarportaavions(char[][] mapa) { // 4 en horizontal
        int posportaavions[] = funcionrandom.puntoAleatorio(funcionesflota.getTamañoMapa());
        int posCreacionX = posportaavions[0];
        int posCreacionY = posportaavions[1];
        boolean check = false;
        while (!check) {
            try {
                if (mapa[posCreacionX][posCreacionY] == '-' && mapa[posCreacionX+1][posCreacionY] == '-' && mapa[posCreacionX+2][posCreacionY] == '-'
                && mapa[posCreacionX+3][posCreacionY] == '-'&& mapa[posCreacionX+4][posCreacionY] == '-') {
                    mapa[posCreacionX][posCreacionY] = 'P';
                    mapa[posCreacionX+1][posCreacionY] = 'P';
                    mapa[posCreacionX+2][posCreacionY] = 'P';
                    mapa[posCreacionX+3][posCreacionY] = 'P';
                    mapa[posCreacionX+4][posCreacionY] = 'P';
                    check = true;
                } else {
                    int nuevaPosicion[] = funcionrandom.puntoAleatorio(funcionrandom.getTamañoMapa());
                    posCreacionX = nuevaPosicion[0];
                    posCreacionY = nuevaPosicion[1];
                }
            } catch (Exception e) {
                int nuevaPosicion[] = funcionrandom.puntoAleatorio(funcionesflota.getTamañoMapa());
                posCreacionX = nuevaPosicion[0];
                posCreacionY = nuevaPosicion[1];
                check = false;
            }
        }
    }
    // aquí insertamos los barcos
    public static void insertarbarcos(char[][] mapa, int numLanchas, int numBuques, int numCrucero, int numPortaaviones) {
        for (int i = 0; i < numLanchas; i++) {
            insertarlancha(mapa);
        }
        for (int i = 0; i < numBuques; i++) {
            insertarbuque(mapa);
        }
        for (int i = 0; i < numCrucero; i++) {
            insertarcrucero(mapa);
        }
        for (int i = 0 ; i < numPortaaviones ; i++){
            insertarportaavions(mapa);
        }
    }

    // get y set para los barcos
    public static int getnumLanchas() {
        return numLanchas;
    }

    public static int getnumBuques() {
        return numBuques;
    }

    public static int getnumCruceros() {
        return numCrucero;
    }
    public static int getnumPortaaviones(){
        return numPortaaviones;
    }

    public static void setnLanchas(int numLanchas) {
        creacionbarcos.numLanchas = numLanchas;
    }

    public static void setnBuques(int numBuques) {
        creacionbarcos.numBuques = numBuques;
    }

    public static void setnCrucero(int numCrucero) {
        creacionbarcos.numCrucero = numCrucero;
    }
    public static void setnPortaaviones(int numPortaaviones){
        creacionbarcos.numPortaaviones = numPortaaviones;
    }
}
