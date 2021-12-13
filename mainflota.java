import java.util.Scanner;
public class mainflota{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Aquí definimos todas las variables main;
        char[][] mapa = funcionesflota.crearmapa(funcionesflota.getTamañoMapa());


        //Debajo de esto insertaremos las funciones
        funcionesflota.mostrarmapa(mapa);


    }
}