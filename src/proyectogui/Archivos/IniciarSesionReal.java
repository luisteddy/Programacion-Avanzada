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
public class IniciarSesionReal implements IniciarSesion{
//ATRIBUTOS
    private String nombreUsuario;
    private String contrasena;

//METODOS
    @Override
    public void iniciarSesion(ArrayList <AventuraLibro> listaLibros, String tipo){
        String user, contra;
        int accion = 0,op1=0;
        Scanner s1 = new Scanner(System.in);
        
        //System.out.println("Ingrese nombre de usuario:");
        //user = s1.nextLine();
        //System.out.println("Ingrese contraseña:");
        //contra = s1.nextLine();
        while(accion != -1){
            if (tipo.equals("Autor")){
                //this.nombreUsuario = user;
                //this.contrasena = contra;
                System.out.println("Inicio como Autor");
                System.out.println("");
                Persona _autor = new Persona(nombreUsuario);
                System.out.println("[1]Crear nueva aventura");
                System.out.println("[2]Agregar paginas a libros existentes");
                System.out.println("[-1]Salir");
                accion = s1.nextInt();
                if(accion == 1){
                    ObservarAventura observador = new CuandoCompletasLibro("Imagenes/observer.jpg","/proyectogui/Musica/observer.wav");
                    AventuraLibro L = new AventuraLibro();
                    L = _autor.crearHistoria();                    
                    listaLibros.add(L);         
                    L.addObservador(observador);
                }else if(accion == 2){
                    System.out.println("Selecciona el libro");
                    int i=0,x=0,y=0;
                    while (i != listaLibros.size()){
                        System.out.println("["+i+"]"+"--> ["+listaLibros.get(i).getTituloAventura()+"] : "
                                +listaLibros.get(i).getSinopsis());
                        i++;
                    }
                    x = s1.nextInt();
                    s1.nextLine();
                    System.out.println("N° de pagina:");
                    y = s1.nextInt();
                    s1.nextLine();
                    System.out.println("Seleccione tipo de pagina");
                    System.out.println("[1]Pagina nodo");
                    System.out.println("[2]Pagina nuevo inicio");
                    System.out.println("[3]Pagina final");
                    op1 = s1.nextInt();
                    s1.nextLine();
                    TipoPaginas tipoPag;
                    FactoryTipoPaginas fabrica;
                    fabrica = new ConcreteTipoNuevoInicio();
                    tipoPag = fabrica.crearFinal(op1);
                    _autor.agregarPaginaFinales(listaLibros.get(x), y, tipoPag);  
                    tipoPag.accion();
                }else if(accion != -1){
                    System.out.println("Opcion no valida");
                }
            }else{
                //this.nombreUsuario = user;
                this.contrasena = null;
                Persona _lector = new Persona(nombreUsuario);
                //Lector _lector = new Lector(nombreUsuario);
                System.out.println("Iniciado como Lector");
                int j=0;
                while(j != -1){
                    _lector.elegirLibro(listaLibros);
                    j = -1;
                    accion = -1;
                }              
            }
        }
    }
    
    @Override
    public void cerrarSesion(){
        this.nombreUsuario = null;
        System.out.println("Sesion cerrada");
    }
}
