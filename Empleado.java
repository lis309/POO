package Salud;

//Heredar la clase Persona3 a la subclase Empleado
public class Empleado extends Persona3{
    //Atributos propios de la clase empleado
    private String cargo;
    private String departamento;
    private int valorHora=0; 
    private int horasTrabajadas=0;

    //método constructor de la subclase y trajimos los atributos de la super clase
    public Empleado(String tipoDoc,int documento, String nombre, String apellido, int peso, double estatura, int edad, String sexo, 
    String cargo, String departamento, int valorHora, int horasTrabajadas) {
        super(tipoDoc,documento,nombre,apellido,peso,estatura,edad,sexo);
        this.cargo=cargo;
        this.departamento=departamento;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;

    }

    //getters y settters de la subclase

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    

    //métodos de la subclase
    public int calcularHonorarios(int valorHora,int horasTrabajadas) {
        int honorarios;
        honorarios=valorHora*horasTrabajadas;
        return honorarios;
    }

    public void mostrarEmpleado() {
        System.out.println("Su cargo es: "+getCargo());
        System.out.println("Sus horas trabajadas fueron: "+getHorasTrabajadas());
        System.out.println("El valor por hora trabjada es: "+getValorHora());
    }

}
