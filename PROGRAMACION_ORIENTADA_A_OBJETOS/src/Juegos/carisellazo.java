package Juegos;

import java.util.Random;
import java.util.Scanner;

public class carisellazo implements juego{
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
        System.out.println(nombreJugador+" elija cara o sello \n cara=1 \n sello=2");
        opcion=Capturar.nextInt();
        //instaciar clase ramdom
        Random aleatorio=new Random();
        resultadoJuego=aleatorio.nextInt(2+1);
    }
    public void finalizarJuego() {
        if (resultadoJuego==1 && opcion==1) {
            System.out.println("El resultado fue cara el ganador fue: " + nombreJugador);
        }
        else if (resultadoJuego==2 && opcion==2) {
            System.out.println("El resultado fue sello el ganador fue: " + nombreJugador);
        }
        else if (resultadoJuego==1 && opcion==2){
            System.out.println("El resultado fue cara "+nombreJugador+" usted perdió");   
        }
        else if (resultadoJuego==2 && opcion==1){
            System.out.println("El resultado fue sello "+nombreJugador+" usted perdió");   
        }
    }
    
}

