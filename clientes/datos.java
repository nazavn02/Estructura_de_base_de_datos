package clientes;

public class datos {
    //todos los datos que son nesesarios convertidos en variables privadas para registar datos de los clientes mas adelante
    //con sus respectivos encapsuladores 
    private String nombre,apellido1,apellido2,correo;
    private int identificacion,telefono;
    
    public datos(String nombre,String apellido1,String apellido2,String correo,int identificacion,int telefono){
       this.nombre=nombre;
       this.apellido1=apellido1;
       this.apellido2=apellido2;
       this.correo=correo;
       this.identificacion=identificacion;
       this.telefono=telefono;
    }
    
    public datos(){
       this.nombre="";
       this.apellido1="";
       this.apellido2="";
       this.correo="";
       this.identificacion=0;
       this.telefono=0;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return "datos{" + "los datos del cliente "+nombre+" "+apellido1+" "+apellido2+
                " con identificacion "+identificacion+
                " son:\ncorreo: " + correo + "\ntelefono: " + telefono + '}';
    }
    
}
