package Figuras_Geometricas;

public class cuadrado extends Figuras{
//atributos 
    private float lado;

//método constructor
    public cuadrado(float lado) {
        this.lado=lado;
    }

    
//métodos accesores
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    //método de la subclase
    public void calcularArea() {
        float area=0;
        area=lado*lado;
        System.out.println("El lado del cuadrado es "+lado+" y su área es "+area);
    }
    
}
