package Principal;

import Salud1.Persona;

public class Inicio1 {
    public static void main(String[] args) {
        //crear un objeto de la clase persona
        Persona Luisa=new Persona();
        //invocar un método de la clase persona
        Luisa.pedirDatos();
        Luisa.mostrarPersona();
        Luisa.calcularImc();
    }
}
