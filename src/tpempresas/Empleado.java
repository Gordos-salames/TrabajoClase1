package tpempresas;
public class Empleado {
    private int dni;
    String nombreApellido;
    String categoria;
    double sueldo;
    Empresa empresa;
    
    public Empleado(int dni, String nombreApellido, String categoria, double sueldo, Empresa empresa){
        this.dni=dni;
        this.nombreApellido=nombreApellido;
        this.categoria=categoria;
        this.sueldo=sueldo;
        this.empresa=empresa;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    }
