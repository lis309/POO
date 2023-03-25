package Figuras_Geometricas;

public class rectangulo extends Figuras{
    //atributos 
    private float base;
    private float altura;

//método constructor
public rectangulo (float base, float altura) {
    this.base=base;
    this.altura=altura;
}

    
//métodos accesores
    public float getBase() {
        return base;
    }


    public void setBase(float base) {
        this.base = base;
    }


    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }

    //método de la subclase
    public void calcularArea() {
        float area=0;
        area=base*altura;
        System.out.println("La base del cuadrado es "+base+" su altura es "+altura+" y su área es "+area);
    }


    
    
}
