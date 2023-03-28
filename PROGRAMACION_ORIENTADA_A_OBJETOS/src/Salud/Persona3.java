package Salud;

public class Persona3 {
    //atributos de la clase persona
    private int documento=0;
    private int edad=0;
    private String nombre;
    private String sexo;
    private String apellido;
    private String tipoDoc;
    private Double estatura;
    private Double peso;

    //método constructor con parametros
    public Persona3(String tipoDoc,int documento, String nombre, String apellido, double peso, double estatura, int edad, String sexo) {
        this.tipoDoc=tipoDoc;
        this.documento=documento;
        this.nombre=nombre;
        this.apellido=apellido;
        this.peso=peso;
        this.estatura=estatura;
        this.edad=edad;
        this.sexo=sexo;
    }

    //Get siempre genera un valor de retorno del mismo tipo del dato del atributo
    //Set no retorna valores y requiere como parametro el valor del atributo
    //métodos accedores getters y setters

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    //métodos de la clase persona

    public void mostrarPersona3(){
        System.out.println("Su tipo de documento es: "+getTipoDoc());
        System.out.println("Su número de documento es: "+getDocumento());
        System.out.println("Su nombre es: "+getNombre());
        System.out.println("Su apellido es: "+getApellido());
        System.out.println("Su peso es: "+getPeso());
        System.out.println("Su estatura es: "+getEstatura());
        System.out.println("Su edad es: "+getEdad());
        System.out.println("Su sexo es: "+getSexo());
        
    }

    public void calcularImc3() {
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
