/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogui.Archivos;

/**
 *
 * @author edgar
 */
public class ConcreteTipoFinal extends FactoryTipoPaginas {
    
    public TipoPaginas crearFinal(){
        return new TipoFinal();
    }
}
