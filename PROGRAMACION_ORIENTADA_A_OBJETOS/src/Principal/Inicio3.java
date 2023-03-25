package Principal;

import java.util.Scanner;

import Salud3.Empleado;

public class Inicio3 {
    public static void main(String[] args) {
        int documento,edad,peso,valorHora,horasTrabajadas,honorarios=0;
        String nombre,sexo,apellido,tipoDoc,cargo,departamento;
        double estatura,totalPagar,reiteca=0;


        Scanner Capturar=new Scanner(System.in);

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
        //solicitar datos del empleado
        System.out.println("Digite su cargo");
        cargo=Capturar.next();
        System.out.println("Digite su departamento");
        departamento=Capturar.next();
        System.out.println("Digite las horas trabajas");
        horasTrabajadas=Capturar.nextInt();
        System.out.println("Digite el valor de la hora");
        valorHora=Capturar.nextInt();

        //crear un objeto de la clase persona con argumentos
        Empleado Sofia=new Empleado(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo, cargo, departamento, valorHora, horasTrabajadas);
        
        //invocar método para calcular honorarios
        honorarios=Sofia.calcularHonorarios(valorHora, horasTrabajadas);
        reiteca=honorarios*0.966/100;
        totalPagar=honorarios-reiteca;

        //invocar métodos de la clase persona
        Sofia.mostrarPersona();
        Sofia.calcularImc();
        //invocar método de la subclase
        Sofia.mostrarEmpleado();
        System.out.println("Su pago total de honorarios es "+totalPagar);
        
        //limpiar buffer
        Capturar.close();
    }
}
