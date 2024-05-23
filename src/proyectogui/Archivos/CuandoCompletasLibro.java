/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogui.Archivos;

/**
 *
 * @author edgar
 */
public class CuandoCompletasLibro implements ObservarAventura {
    
    private String imagen;
    private String audio;
    

    public CuandoCompletasLibro(String _imagen, String _audio){
        this.imagen = _imagen;
        this.audio = _audio;
    }

    

    /**
     * @return the imagen
     */
    public String getImagen() {
        return this.imagen;
    }

    /**
     * @param _imagen the imagen to set
     */
    public void setImagen(String _imagen) {
        this.imagen = _imagen;
    }

    /**
     * @return the audio
     */
    public String getAudio() {
        return this.audio;
    }

    /**
     * @param _audio the audio to set
     */
    public void setAudio(String _audio) {
        this.audio = _audio;
    }    

    
    
    @Override
    public void update(AventuraLibro L){
        if (L.getEstado()){
        }
    }
}
