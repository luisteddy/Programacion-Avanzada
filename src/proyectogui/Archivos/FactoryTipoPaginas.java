/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogui.Archivos;

/**
 *
 * @author edgar
 */
public abstract class FactoryTipoPaginas {
    
    public abstract TipoPaginas crearFinal();
    
    public TipoPaginas crearFinal(int _numero){
        if(_numero == 1){
            return new ConcreteTipoNodo().crearFinal();     
        }else if(_numero == 2){
            return new ConcreteTipoNuevoInicio().crearFinal();  
        }else if(_numero == 3){
            return new ConcreteTipoFinal().crearFinal();
        }
        return null;
    }    
}
