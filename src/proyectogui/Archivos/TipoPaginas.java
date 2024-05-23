/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogui.Archivos;

/**
 *
 * @author edgar
 */
public abstract class TipoPaginas {
    private int tipo;
    
    public TipoPaginas(){
        this.tipo = 0;
    }
    
    public TipoPaginas(int _tipo){
        this.tipo = _tipo;
    }  

    /**
     * @return the tipo
     */
    public int getTipo() {
        return this.tipo;
    }

    /**
     * @param _tipo the tipo to set
     */
    public void setTipo(int _tipo) {
        this.tipo = _tipo;
    }    
    
    public abstract void accion();
    
}
