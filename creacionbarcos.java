import java.util.Scanner;

public class creacionbarcos {

//Definimos el número de barcos
    private static int numLanchas = 5;
    private static int numBuques = 3;
    private static int ntotal= 8;

//Aquí crearemos la lancha
    private static void insertarlancha(char[][] mapa){
        int posLancha[] = funcionrandom.puntoAleatorio(funcionesflota.getTamañoMapa());
        int posCreacionX = posLancha[0];
        int posCreacionY = posLancha[1];
        boolean check = false;
		while (!check) {
			try {
				if (mapa[posCreacionX][posCreacionY] == 45) {;						
						mapa[posCreacionX][posCreacionY] = 76;
						check = true;
				} else {
					int nuevaPosicion[] = funcionrandom.puntoAleatorio(funcionrandom.getTamañoMapa());
					posCreacionX = nuevaPosicion[0];
					posCreacionY = nuevaPosicion[1];
				}
			}catch (Exception e) {
				int nuevaPosicion[] = funcionrandom.puntoAleatorio(funcionesflota.getTamañoMapa());
				posCreacionX = nuevaPosicion[0];
				posCreacionY = nuevaPosicion[1];
				check = false;
			}
		}
	}
//buque
private static void insertarbuque(char[][] mapa) { // 3 en horizontal
    int posicionBuque[] = funcionrandom.puntoAleatorio(funcionesflota.getTamañoMapa());
    int posCreacionX = posicionBuque[0];
    int posCreacionY = posicionBuque[1];
    boolean check = false;
    while (!check) {
        try {
            if (mapa[posCreacionX][posCreacionY] == 45 && mapa[posCreacionX][posCreacionY + 1] == 45 && mapa[posCreacionX][posCreacionY + 2] == 45) {					
                    mapa[posCreacionX][posCreacionY] = 66;
                    mapa[posCreacionX][posCreacionY + 1] = 66;
                    mapa[posCreacionX][posCreacionY + 2] = 66;
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


    //aquí insertamos los barcos
    public static void insertarbarcos(char[][] mapa, int numLanchas, int numBuques){
        for(int i = 0 ; i<numLanchas ; i++){
            insertarlancha(mapa);
        }
        for(int i = 0 ; i<numBuques ; i++){
            insertarbuque(mapa);
        }
        ntotal = numLanchas + numBuques;
    }

    //getter y seters
    public static int getnumLanchas() {
		return numLanchas;
	}
    public static int getnumBuques(){
        return numBuques;
    }

	public static void setnLanchas(int numLanchas) {
		creacionbarcos.numLanchas = numLanchas;
	}
    public static void setnBuques(int numBuques){
        creacionbarcos.numBuques = numBuques;
    }
}