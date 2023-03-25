package Salud1;

import java.util.Scanner;

public class Persona {
    //atributos de la clase persona
    private int documento,edad=0;
    private String nombre,sexo,apellido,tipoDoc;
    private double estatura,peso=0;

    //Instanciar la clase scanner
    Scanner Capturar=new Scanner(System.in);

    //métodos de la clase persona
    public void pedirDatos(){
        //solicitar y capturar datos
        System.out.println("Digite su tipo de documento");
        tipoDoc=Capturar.next();
        System.out.println("Digite su número de documento");
        documento=Capturar.nextInt();
        System.out.println("Digite su nombre");
        nombre=Capturar.next();
        System.out.println("Digite su apellido");
        apellido=Capturar.next();
        System.out.println("Digite su peso en kilos");
        peso=Capturar.nextInt();
        System.out.println("Digite su estatura en metros");
        estatura=Capturar.nextDouble();
        System.out.println("Digite su edad");
        edad=Capturar.nextInt();
        System.out.println("Digite su sexo");
        sexo=Capturar.next();
        if (edad<18) {
            System.out.println("Usted es menor de edad");
        }else{
            System.out.println("Usted es mayor de edad");
        }

    }

    public void mostrarPersona(){
        System.out.println("Su tipo de documento es: "+tipoDoc);
        System.out.println("Su número de documento es: "+documento);
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su apellido es: "+apellido);
        System.out.println("Su peso es: "+peso);
        System.out.println("Su estatura es: "+estatura);
        System.out.println("Su edad es: "+edad);
        System.out.println("Su sexo es: "+sexo);
        
    }

    public void calcularImc() {
        Double pesoActual;
        pesoActual=peso/(estatura*estatura);

        if (pesoActual<20) {
            System.out.println("Su peso esta por debajo del ideal");
        }
        else if (pesoActual>=20 && pesoActual<=25) {
            System.out.println("Su peso es ideal");
        }
        else if (pesoActual>25) {
            System.out.println("Su peso sobrepasa al peso ideal");
        }
    }


}
