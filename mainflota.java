import java.util.Scanner;
public class mainflota{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Aquí definimos todas las variables main;
        char[][] mapauser = funcionesflota.crearmapauser(funcionesflota.getTamañoMapa());
        //char[][] mapabot = funcionesflota.crearmapabot(funcionesflota.getTamañoMapa());

        //Debajo de esto insertaremos las funciones
        funcionesflota.mostrarmapa(mapauser);
        funcionesflota.atacar(mapauser);
        //System.out.println("\n-------------------------------------------------------");
        //funcionesflota.mostrarmapa(mapabot);


    }
}