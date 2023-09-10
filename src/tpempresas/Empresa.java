package tpempresas;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;

public class Empresa {
    private String razonSocial;
    private String cuit;
    private ArrayList<Empleado> empleados;

    public Empresa(String razonSocial, String cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        empleados=new ArrayList<>();
        
    }
    
    
    public void agregarEmpleado(Empleado e){
        this.empleados.add(e);
    }


    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
        public void mostrarEmpleado(){
        for (Empleado e: empleados) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "Empresa{" + "razonSocial=" + razonSocial + '}';
    }
}
