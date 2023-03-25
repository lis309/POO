package Figuras_Geometricas;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        String figura;
        float lado,base,altura=0;
        int radio,respuesta=0;

        //instanciar la clase scanner
        Scanner Capturar =new Scanner(System.in);

        

        do {

            //solicitar los datos
            System.out.println("Digite la figura a la que desea conocer su área: \n cuadrado, rectángulo o círculo");
            figura=Capturar.next();
            figura=figura.toLowerCase();

            //condicional para evaluar el área de cada figura según lo haya indicado el usuario
            switch (figura) {
            case "cuadrado":
            //solicitar los datos
            System.out.println("Digite el valor del lado del cuadrado");
            lado=Capturar.nextFloat();

            //crear objeto de la subclase cuadrado
            cuadrado cuadrado=new cuadrado(lado);

            //método para calcular el área
            cuadrado.calcularArea();
                break;
            
            case "rectangulo":
            //solicitar los datos
            System.out.println("Digite el valor de la base del rectángulo");
            base=Capturar.nextFloat();
            System.out.println("Digite el valor de la altura del rectángulo");
            altura=Capturar.nextFloat();

            //crear objeto de la subclase rectángulo
            rectangulo rectangulo=new rectangulo(base, altura);
            
            //método para calcular el área
            rectangulo.calcularArea();
                break;

            case "circulo":
            //solicitar los datos
            System.out.println("Digite el radio del círculo");
            radio=Capturar.nextInt();

            //crear objeto de la subclase cuadrado
            circulo circulo=new circulo(radio);

            //método para calcular el área
            circulo.calcularArea();
                break;
        
            default:
                break;
        }

        //capturar respuesta del usuario
        System.out.println("Desea calcular el área de otra figura: si=1 no=2");
        respuesta=Capturar.nextInt();

        } while (respuesta==1);

        

        Capturar.close();
    }
}