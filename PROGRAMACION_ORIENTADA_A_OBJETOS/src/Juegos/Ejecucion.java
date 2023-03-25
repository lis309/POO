package Juegos;

public class Ejecucion {
    public static void main(String[] args) {
        //instaciar la clase carisellazo
        carisellazo juego1=new carisellazo();
        //invocar métodos
        juego1.iniciarJuego();
        juego1.jugarJuego();
        juego1.finalizarJuego();

        //instaciar objeto de la clase piedra_papel_tijera
        piedra_papel_tijera juego2=new piedra_papel_tijera();
        //invocar métodos
        juego2.iniciarJuego();
        juego2.jugarJuego();
        juego2.finalizarJuego();


    }
}
