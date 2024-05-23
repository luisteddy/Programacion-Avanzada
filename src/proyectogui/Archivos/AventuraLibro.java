/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogui.Archivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author edgar
 */
public class AventuraLibro {
//Atributos
    
    private String autor;
    private String lector;
    private String tituloAventura;
    private List <Paginas> paginas;
    private String sinopsis;
    private Boolean estado = false;
    private String imagen;
    private List <ObservarAventura> observadores = new ArrayList<>();
    
//Constructores
    
    public AventuraLibro(){
       this.paginas = new ArrayList();
    }    
    
    public AventuraLibro(String _tituloAventura, String _categoria, String _lector, String _autor, String _sinopsis){
       this.tituloAventura = _tituloAventura;
       this.paginas = new ArrayList();
       this.autor = _autor;
       this.lector = _lector;
       this.sinopsis = _sinopsis;
    }
    
//Setters/Getters

    /**
     * @return the tituloAventura
     */
    public String getTituloAventura() {
        return this.tituloAventura;
    }

    /**
     * @param _tituloAventura the tituloAventura to set
     */
    public void setTituloAventura(String _tituloAventura){
        this.tituloAventura = _tituloAventura;
    }
    
    /**
     * @return the autor
     */
    public String getAutor() {
        return this.autor;
    }

    /**
     * @param _autor the autor to set
     */
    public void setAutor(String _autor) {
        this.autor = _autor;
    }

    /**
     * @return the lector
     */
    public String getLector() {
        return this.lector;
    }

    /**
     * @param _lector the lector to set
     */
    public void setLector(String _lector) {
        this.lector = _lector;
    }
  
    /**
     * @return the sinopsis
     */
    public String getSinopsis() {
        return this.sinopsis;
    }

    /**
     * @param _sinopsis the sinopsis to set
     */
    public void setSinopsis(String _sinopsis) {
        this.sinopsis = _sinopsis;
    }

    /**
     * @return the paginas
     */
    public List <Paginas> getPaginas() {
        return this.paginas;
    }

    /**
     * @param _paginas the paginas to set
     */
    public void setPaginas(List <Paginas> _paginas) {
        this.paginas = _paginas;
    }
    
    /**
     * @return the estado
     */
    public Boolean getEstado() {
        return this.estado;
    }

    /**
     * @param the estado to set
     */
    public void setEstado() {
        this.estado = true;
        notificarObservadores();
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

    
    
//Metodos    

    public void addObservador(ObservarAventura observador){
        observadores.add(observador);
    }

    public void removeObservador(ObservarAventura observador){
        observadores.remove(observador);
    }
    
    public void notificarObservadores(){
        int i=0;
        while(i < observadores.size()){
            ObservarAventura observador = observadores.get(i);
            observador.update(this);
            i++;
        }
    }
    
    public void agregarPagina(Paginas _pagina){
        getPaginas().add(_pagina);
    }

    public void jugabilidad(int _num){
        Scanner s1 = new Scanner(System.in);
        int opcion=0,i=0,j=1;
        if (this.paginas.get(_num).getTipopaginas().getTipo() == 3){
            System.out.println("["+this.tituloAventura+"]");
            System.out.println("Numero Pagina: "+this.getPaginas().get(_num).getNumero());
            System.out.println("Contenido: "+this.getPaginas().get(_num).getContenido());
            setEstado();
        }else{
            while(i != -1){
                if(this.paginas.get(_num).getTipopaginas().getTipo() == 1){
                    if(j == 2){
                        System.out.println("Pagina: "+this.getPaginas().get(_num).getNumero());
                        System.out.println("- "+this.getPaginas().get(_num).getContenido());
                        System.out.println(""+this.getPaginas().get(_num).getOp1());
                        System.out.println("");
                        System.out.print("Eliges: ");
                        opcion = s1.nextInt();
                        s1.nextLine();
                        while(opcion != this.getPaginas().get(_num).getNodo1()){
                            System.out.println("Pagina deshabilitada, intenta nuevamente");
                            opcion = s1.nextInt();
                        }
                        System.out.println("");    
                        _num = opcion; 
                        j=1;
                    }else{
                        System.out.println("Pagina: "+this.getPaginas().get(_num).getNumero());
                        System.out.println("- "+this.getPaginas().get(_num).getContenido());
                        System.out.println(""+this.getPaginas().get(_num).getOp1());
                        System.out.println(""+this.getPaginas().get(_num).getOp2());
                        System.out.println("");
                        System.out.print("Eliges: ");
                        opcion = s1.nextInt();
                        s1.nextLine();
                        while(this.getPaginas().get(_num).getNodo1() != opcion && this.getPaginas().get(_num).getNodo2() != opcion){
                            System.out.println("Pagina incorrecta, intenta nuevamente");
                            opcion = s1.nextInt();
                        }
                        System.out.println("");    
                        _num = opcion;                      
                    }
                }else if(this.paginas.get(_num).getTipopaginas().getTipo() == 2){
                    System.out.println("Pagina: "+this.getPaginas().get(_num).getNumero());
                    System.out.println("- "+this.getPaginas().get(_num).getContenido());
                    System.out.println(" Reiniciando aventura ");
                    System.out.println("");
                    _num = 1;
                    j++;
                }else if(this.paginas.get(_num).getTipopaginas().getTipo() == 3){
                    System.out.println("Pagina: "+this.getPaginas().get(_num).getNumero());
                    System.out.println("- "+this.getPaginas().get(_num).getContenido());
                    setEstado();
                    System.out.println("[-1]Salir");
                    opcion = s1.nextInt();
                    s1.nextLine();
                    _num = opcion;
                    System.out.println("");               
                    i = -1;
                }else if(this.paginas.get(_num).getContenido() == null){
                    System.out.println("Esta pagina no esta creada");
                    i = -1;                    
                }
            }
        }
    }
    
    public void jugabilidadGUI(int _num){
        
    }

}
