import java.util.Scanner;
public class funcionesflota {
    
    static Scanner sc = new Scanner(System.in);
    
    private static int[] ejeX;
	private static char[] ejeY = new char[]{65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};
    private static int tamañoMapa = 10;

    //Aquí creamos el mapa con su respectivo tamaño
	public static char[][] crearmapa(int tamaño) {
		char[][] m = new char[tamaño][tamaño];
		ejeX = new int[tamaño];
		int cont = 1;
		for (int i = 0; i < ejeX.length; i++) {
			ejeX[i] = cont++;
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = 45;
			}
		}
		creacionbarcos.insertarbarcos(m, creacionbarcos.getnumLanchas(), creacionbarcos.getnumBuques(), creacionbarcos.getnumCruceros());
        return m;
    }

    //Imprime el mapa por consola
	public static void mostrarmapa(char[][] mapa) {
		System.out.print("\n ");
		for (int i = 0; i < mapa.length; i++) {
			System.out.print("  " + ejeX[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < mapa.length; i++) {
            System.out.print(ejeY[i] + "  ");
			for (int j = 0; j < mapa.length; j++) {
				if (j >= 10) {
					if (j == 10) {
						System.out.print(" ");
					}
					System.out.print(mapa[i][j] + "    ");
				}else {
					System.out.print(mapa[i][j] +  "   ");
				}
			}
			System.out.println("");
		}
	}



	public static int getTamañoMapa() {
		return tamañoMapa;
    }
}
    