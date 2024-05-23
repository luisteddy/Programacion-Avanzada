/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogui.Archivos;

import java.util.ArrayList;

/**
 *
 * @author edgar
 */
public class IniciarSesionProxy implements IniciarSesion {
//ATRIBUTOS
    IniciarSesionReal sesion;

//METODOS
    @Override
    public void iniciarSesion(ArrayList <AventuraLibro> AventuraLibro, String tipo){
        if (sesion == null){
            sesion = new IniciarSesionReal();
        }
        sesion.iniciarSesion(AventuraLibro, tipo);
    }
    
    @Override
    public void cerrarSesion(){
        if(sesion != null){
            sesion.cerrarSesion();
        }
    }
}
