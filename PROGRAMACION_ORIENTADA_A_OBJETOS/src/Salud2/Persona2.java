package Salud2;

import java.util.Scanner;

public class Persona2 {
        //atributos de la clase persona
        private int documento,edad=0;
        private String nombre,sexo,apellido,tipoDoc;
    
        //método constructor vacio
        public Persona2() { 
        }

        //Instanciar la clase scanner
        Scanner Capturar=new Scanner(System.in);

        //métodos de la clase persona
        public void pedirDatos2(){
            //solicitar y capturar datos
            System.out.println("Digite su tipo de documento");
            tipoDoc=Capturar.next();
            System.out.println("Digite su número de documento");
            documento=Capturar.nextInt();
            System.out.println("Digite su nombre");
            nombre=Capturar.next();
            System.out.println("Digite su apellido");
            apellido=Capturar.next();
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

        public void mostrarPersona2(){
            System.out.println("Su tipo de documento es: "+tipoDoc);
            System.out.println("Su número de documento es: "+documento);
            System.out.println("Su nombre es: "+nombre);
            System.out.println("Su apellido es: "+apellido);
            System.out.println("Su edad es: "+edad);
            System.out.println("Su sexo es: "+sexo);
            
        }
    
        public Double calcularImc2(Double peso, Double estatura) {
            Double pesoActual;
            pesoActual=peso/(estatura*estatura);
            return pesoActual; 
        }
    
}
