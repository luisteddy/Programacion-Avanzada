/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogui.Archivos;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class Paginas {
//Atributos
    
    private int numero;
    private String contenido;
    private String op1;
    private String op2;
    private String sonidoOp1;
    private String sonidoOp2;
    private int nodo1,nodo2;
    private TipoPaginas tipopaginas;
    private String imagen;
    
//Constructores
    
    public Paginas(){
        this.contenido = null;
        this.op1 = null;
        this.op2 = null;
    }

    public Paginas(int _num){
        this.contenido = null;
        this.op1 = null;
        this.op2 = null;
        this.numero = _num;
    }
  

    public Paginas(TipoPaginas _final){
        this.tipopaginas = _final;
    }    

    
    public Paginas(int _num, TipoPaginas _final){
        Scanner s1 = new Scanner(System.in);
        String _contenido;
        String _op1,_op2;
        int _cadena1,_cadena2;
        this.numero = _num;
        System.out.println("Contenido: ");
        _contenido = s1.nextLine();
        this.contenido = _contenido;
        if (_final.getTipo() == 1){
            System.out.println("Opcion 1: ");
            _op1 = s1.nextLine();
            this.op1 = _op1;
            System.out.println("Opcion 1 lleva a la pagina ---> ");
            _cadena1 = s1.nextInt();
            s1.nextLine();
            this.nodo1 = _cadena1;
            System.out.println("Opcion 2: ");
            _op2 = s1.nextLine();
            this.op2 = _op2;
            System.out.println("Opcion 2 lleva a la pagina ---> ");
            _cadena2 = s1.nextInt();
            s1.nextLine();
            this.nodo2 = _cadena2;
            this.tipopaginas = _final;             
        }else if(_final.getTipo() == 2){
            System.out.println("El lector sera enviado a la pagina 1");
            this.nodo1 = 1;
            this.nodo2 = -1;
            this.tipopaginas = _final;             
        }else{
            System.out.println("La aventura terminara en esta pagina");
            this.tipopaginas = _final;
            this.nodo1 = -1;
        }
    }
    
    public Paginas(int _num, String _contenido, String _op1,String _op2,int _cadena1, int _cadena2, TipoPaginas _fin1){
        this.numero = _num;
        this.contenido = _contenido;
        this.op1 = _op1;
        this.nodo1 = _cadena1;
        this.op2 = _op2;
        this.nodo2 = _cadena2;
        this.tipopaginas = _fin1;
    }


//Setters/Getters
    
    /**
     * @return the numero
     */
    public int getNumero() {
        return this.numero;
    }

    /**
     * @param _numero
     */
    public void setNumero(int _numero) {
        this.numero = _numero;
    }

    /**
     * @return the contenido
     */
    public String getContenido() {
        return this.contenido;
    }

    /**
     * @param _contenido
     */
    public void setContenido(String _contenido) {
        this.contenido = _contenido;
    } 
 
    /**
     * @return the op1
     */
    public String getOp1() {
        return this.op1;
    }

    /**
     * @param _op1 the op1 to set
     */
    public void setOp1(String _op1) {
        this.op1 = _op1;
    }

    /**
     * @return the op2
     */
    public String getOp2() {
        return this.op2;
    }

    /**
     * @param _op2 the op2 to set
     */
    public void setOp2(String _op2) {
        this.op2 = _op2;
    }

    /**
     * @return the nodo1
     */
    public int getNodo1() {
        return this.nodo1;
    }

    /**
     * @param _nodo1 the nodo1 to set
     */
    public void setNodo1(int _nodo1) {
        this.nodo1 = _nodo1;
    }

    /**
     * @return the nodo2
     */
    public int getNodo2() {
        return this.nodo2;
    }

    /**
     * @param _nodo2 the nodo2 to set
     */
    public void setNodo2(int _nodo2) {
        this.nodo2 = _nodo2;
    }    

    /**
     * @return the tipopaginas
     */
    public TipoPaginas getTipopaginas() {
        return this.tipopaginas;
    }

    /**
     * @param _tipopaginas the tipopaginas to set
     */
    public void setTipopaginas(TipoPaginas _tipopaginas) {
        this.tipopaginas = _tipopaginas;
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
     * @return the sonidoOp1
     */
    public String getSonidoOp1() {
        return this.sonidoOp1;
    }

    /**
     * @param _sonidoOp1 the sonidoOp1 to set
     */
    public void setSonidoOp1(String _sonidoOp1) {
        this.sonidoOp1 = _sonidoOp1;
    }

    /**
     * @return the sonidoOp2
     */
    public String getSonidoOp2() {
        return this.sonidoOp2;
    }

    /**
     * @param _sonidoOp2 the sonidoOp2 to set
     */
    public void setSonidoOp2(String _sonidoOp2) {
        this.sonidoOp2 = _sonidoOp2;
    }
    
//Metodos    



}
