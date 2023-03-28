package Principal;

import java.util.Scanner;

import Salud.Persona2;

public class Inicio2 {
    public static void main(String[] args) {
        Double peso,estatura,imc;

        //instanciar clase scanner
        Scanner Capturar=new Scanner(System.in);

        //crear un objeto de la clase persona
        Persona2 Jose=new Persona2();

        //invocar método de la clase persona2
        Jose.pedirDatos2();

        //solicitar datos
        System.out.println("Digite su peso en kilos");
        peso=Capturar.nextDouble();
        System.out.println("Digite su estatura en metros");
        estatura=Capturar.nextDouble();
        
        //invocar un método de la clase persona
        //método para mostrar información
        Jose.mostrarPersona2();
        System.out.println("Su peso es: "+peso);
        System.out.println("Su altura es: "+estatura);

        //método para calcular imc con argumentos
        imc=Jose.calcularImc2(peso,estatura);
        
        if (imc<20) {
            System.out.println("Su peso esta por debajo del ideal");
        }
        else if (imc>=20 && imc<=25) {
            System.out.println("Su peso es ideal");
        }
        else if (imc>25) {
            System.out.println("Su peso sobrepasa al peso ideal");
        }

        Capturar.close();
    }
    
}
