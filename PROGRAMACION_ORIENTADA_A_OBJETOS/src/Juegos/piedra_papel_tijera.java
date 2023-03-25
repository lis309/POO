package Juegos;

import java.util.Random;
import java.util.Scanner;

public class piedra_papel_tijera implements juego{
    //atributos
    private int opcion=0;
    private String nombreJugador;
    private int resultadoJuego=0;

    //instaciar clase scanner para capturar datos
    Scanner Capturar=new Scanner(System.in);
   
    public void iniciarJuego() {
        //solicitar datos
        System.out.println("Digite su nombre");
        nombreJugador=Capturar.next();
    }
    public void jugarJuego() {
        System.out.println(nombreJugador+" elija su juego \n piedra=1 \n papel=2 \n tijera=3");
        opcion=Capturar.nextInt();
        //instaciar clase ramdom
        Random aleatorio=new Random();
        resultadoJuego=aleatorio.nextInt(3+1);
    }
    public void finalizarJuego() {
        if (resultadoJuego==1 && opcion==1 || resultadoJuego==2 && opcion==2 || resultadoJuego==3 && opcion==3) {
            System.out.println("Hubo empate");
        }
        else if (resultadoJuego==2 && opcion==3 || resultadoJuego==3 && opcion==1 || resultadoJuego==1 && opcion==2) {
            System.out.println("El ganador fue: " + nombreJugador);
        }
        else if (resultadoJuego==1 && opcion==3 || resultadoJuego==2 && opcion==1 || resultadoJuego==3 && opcion==2) {
            System.out.println("El ganador fue: La maquina");
        }
    }
    
}
