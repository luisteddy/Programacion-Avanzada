/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogui.Archivos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class Persona {
//ATRIBUTOS
    protected String nombre;

//CONSTRUCTOR
    
    Persona(){
    }
    
    Persona(String _nombre){
        this.nombre = _nombre;
    }
    
//SETTER/GETTERS
    /**
     * @return the nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @param _nombre the nombre to set
     */
    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }
    
//METODOS    
  
    public void elegirLibro(ArrayList <AventuraLibro> AventuraLibro){
        int i = 0;
        int bandera = 0;
        int opcion = 0;
        Scanner s1 = new Scanner(System.in);
        AventuraLibro.get(opcion).jugabilidad(1);
        //System.out.println("LibroJuegos para utilizar: ");
        /*
        while(opcion != -1){
            while (i != AventuraLibro.size()){
                System.out.print("["+i+"]"+"--> ["+AventuraLibro.get(i).getTituloAventura()+"] | ");
                if (AventuraLibro.get(i).getEstado()){
                    System.out.print("Completado");
                }else{
                    System.out.print("Incompleto");
                }
                System.out.println("");
                System.out.println(""+AventuraLibro.get(i).getSinopsis());
                i++;
            }
            i=0;
            System.out.println("[-1]Salir");
            opcion = s1.nextInt();
            s1.nextLine();
            if (opcion != -1){
                while(bandera != -1){
                    if (opcion > AventuraLibro.size()-1){
                        System.out.println("Fuera de rango, intente nuevamente");
                        opcion = s1.nextInt();
                        s1.nextLine();
                    }else{
                        bandera = -1;
                    }
                }
                AventuraLibro.get(opcion).jugabilidad(1); 
            }else{
                System.out.println("Cerrando sesion");
            }
        }
        */
    }

    public AventuraLibro crearHistoria(){
        Scanner s1 = new Scanner(System.in);
        AventuraLibro L1 = new AventuraLibro();
        System.out.println("Su nombre:");
        String dato1 = s1.nextLine();
        L1.setAutor(dato1);
        System.out.println("Titulo: ");
        String dato2 = s1.nextLine();
        L1.setTituloAventura(dato2);
        System.out.println("Sinopsis: ");
        String dato3 = s1.nextLine();
        L1.setSinopsis(dato3);
        return L1;
    }
    
    public AventuraLibro crearHistoriaArgumentos(String _nombre, String _titulo, String _sinopsis){
        AventuraLibro Libro = new AventuraLibro();
        Libro.setAutor(_nombre);
        Libro.setTituloAventura(_titulo);
        Libro.setSinopsis(_sinopsis);
        return Libro;
    }
    
    public void agregarPaginaFinales(AventuraLibro Libro, int _num, TipoPaginas _final){
        Scanner s1 = new Scanner(System.in);
        int i=0;
        int bandera = 0;
        
        while(bandera != -1){
            while(i != 50){
                Libro.agregarPagina(new Paginas());
                i++;
            } 
            if (Libro.getPaginas().get(_num).getContenido() != null){
                System.out.println("Esta pagina ya esta creada, ingrese una nueva");
                _num = s1.nextInt();
                s1.nextLine();
            }else{
                if (_final.getTipo() == 1){
                    System.out.println("Agregando pagina de tipo: "+_final.getTipo()+" Nodo");
                    Libro.getPaginas().set(_num, new Paginas(_num,_final));
                    bandera = -1;
                }else if(_final.getTipo() == 2){
                    System.out.println("Agregando pagina de tipo: "+_final.getTipo()+" Nuevo Inicio");
                    Libro.getPaginas().set(_num, new Paginas(_num,_final));
                    bandera = -1;
                }else if(_final.getTipo() == 3){
                    System.out.println("Agregando pagina de tipo: "+_final.getTipo()+" Final");
                    Libro.getPaginas().set(_num, new Paginas(_num,_final));
                    bandera = -1;
                }                
            }
        }
    }
    
    public void agregarPagina(AventuraLibro Libro, int _num, String _contenido, String _op1, String _op2, int _cadena1, int _cadena2, TipoPaginas _final1){
        int i=0;
        int bandera = 0;
        while(bandera != -1){
            while(Libro.getPaginas().size()<=_num){
                Libro.agregarPagina(new Paginas());
                i++;
            }
            if (Libro.getPaginas().get(_num).getNumero() != 0){
                System.out.println("Esta pagina ya esta creada.");
            }else{
                Libro.getPaginas().set(_num, new Paginas(_num,_contenido,_op1,_op2,_cadena1,_cadena2, _final1));
                bandera = -1;
            }            
        }
    }
    
}
