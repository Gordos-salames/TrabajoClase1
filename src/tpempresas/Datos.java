/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpempresas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Netbook
 */
public class Datos {
    private static ArrayList<Empresa> listaEmpresas = new ArrayList<>();

    public Datos() {        
        
    }
    public void addEmpresa(Empresa e){
        listaEmpresas.add(e);
    }
    
    
    public Empresa buscarEmpresa(String nombre){
        for(Empresa e : listaEmpresas){
            if(e.getRazonSocial().equals(nombre)){
                return e;
            }
        }
        return null;
    }
    public ArrayList<Empresa> allEmpresas(){
        return listaEmpresas;
        
    }
    
    
}
