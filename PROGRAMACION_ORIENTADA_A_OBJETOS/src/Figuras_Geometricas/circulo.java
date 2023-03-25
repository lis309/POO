package Figuras_Geometricas;

public class circulo extends Figuras{
    //atributos
    private int radio=0;

    //método constructor
    public circulo (int radio) {
        this.radio=radio;
    }

    //métodos accesores
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }


    //método de la subclase
    public void calcularArea() {
        Double area;
        area=Math.PI*(radio*radio);
        System.out.println("El radio del círculo es "+radio+" y su área es "+area);
    }
    
}
