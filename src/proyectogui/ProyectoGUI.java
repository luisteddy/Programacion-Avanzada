import java.util.ArrayList;
import proyectogui.Archivos.Autor;
import proyectogui.Archivos.AventuraLibro;
import proyectogui.Archivos.ConcreteTipoFinal;
import proyectogui.Archivos.FactoryTipoPaginas;
import proyectogui.Archivos.IniciarSesion;
import proyectogui.Archivos.IniciarSesionProxy;
import proyectogui.Archivos.Persona;
import proyectogui.Archivos.TipoPaginas;
import proyectogui.VentanaPrincipal;

/**
 *
 * @author edgar
 */
public class ProyectoGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    Persona A1 = new Autor();
    IniciarSesion Usuario = new IniciarSesionProxy();
    AventuraLibro L1 = new AventuraLibro();
    ArrayList <AventuraLibro> listaLibros = new ArrayList<>();
    TipoPaginas x;
    FactoryTipoPaginas fabrica;
    
    
    
    fabrica = new ConcreteTipoFinal();
    x = fabrica.crearFinal(1);
    //Creacion de la historia
    L1 = A1.crearHistoriaArgumentos("Luis", "Caminos nocturnos bajo el resplandor lunar", "Te aventuras en un bosque nocturno donde\n"
            + "tu vida estara a punto de cambiar para\n"
            + "siempre.");
    
    //Creacion de las paginas
    A1.agregarPagina(L1, 1, "Estas en un bosque durante la media noche, tienes una antorcha que podrias utilizar, pero te gusta sentirte parte "
            + "del bosque. De pronto, gracias a la luna, tu vision mejora levemente y observas a la distancia un camino con un letrero."
            + "¿Hacia donde quieres ir?", "Seguir el letrero", "Dar marcha atras", 2, 3,fabrica.crearFinal(1));

    A1.agregarPagina(L1, 2, "Vas siguiendo el sendero del camino, ves un faro de luz, pero esta al otro lado del cerro, asi que comienzas a "
            + "bajar por el camino, cada vez que avanzas, los arboles se vuelven mas frondosos, pasas por el lado de un antiguo horno de "
            + "carbon del cual solo quedan las ruinas, continuas hasta llegar a un estero con bastante agua, a tu derecha hay otro camino. "
            + "¿Por cual direccion iras?", "Pasar por el estero", "Ir a la derecha", 4, 5,fabrica.crearFinal(1));

    A1.agregarPagina(L1, 4, "Te arremangas lo mas que puedes tus pantalones y cruzas por el estero, delante de ti hay un pequeño muro que "
            + "debes escalar para poder continuar, una vez arriba, ves otro estero, pero este tiene mucha mas agua que el anterior y la "
            + "unica forma de avanzar es cruzando un puente hecho de un arbol, el cual esta en bastantes malas condiciones debido a las "
            + "termitas."
            + "¿Continuaras de todas maneras por el puente?", "Ir por el puente", "Regresar", 8, 9,fabrica.crearFinal(1));    

    A1.agregarPagina(L1, 8, "Te armas de fuerza, y procedes a subirte al tronco, era mas dificil de lo que parecia, esta resbaloso y "
            + "si no mantienes tu equilibrio podrias caer a las tormentosas aguas, continuas con la mayor precaucion posible, hasta "
            + "que de pronto comienza a crujir el tronco, angustiado y desesperado, comienzas a correr, pero el tronco colapsa "
            + "y caes al agua inconciente. Despiertas en una orilla del rio, con tu cuerpo adolorido y lleno de arena.", null, null, 0,
            0,fabrica.crearFinal(3));

    A1.agregarPagina(L1, 9, "Das la media vuelta, te arremangas los pantalones y regresas por el mismo camino, avanzas unos minutos "
            + "y cominzas a escuchar extraños ruidos, mas tarde sientes que te observan. Las esporas de los hongos del bosque estan "
            + "afectando tus sentidos y alucinas, cada vez estas mas debil, tus pies ya no pueden sostenerte asi que caes al suelo y "
            + "comienzas a rodar cuesta abajo, llegas hasta el rio y caes a sus aguas, debido a tu falta de fuerzas te ahogas."
            + "Despiertas, con tu cuerpo todo sudado y tu respiracion agitada... Fue un sueño...", null, null, 0,
            0,fabrica.crearFinal(3));

    A1.agregarPagina(L1, 5, "Decides ir por el camino de la derecha, subes por una colina muy empinada y llegas cansadisimo a la cima "
            + "despues de caminar un poco, las nubes cubren los cielos, por lo que la luz lunar se desvanece, decides encender la antorcha "
            + "y continuar con tu aventura, pero delante de ti ves una cueva con un aspecto muy tenebroso. "
            + "¿Deseas investigarla?", "Investigar cueva", "Seguir sendero",
            10, 11,fabrica.crearFinal(1));

    A1.agregarPagina(L1, 10, "Entras en la cueva, la parte principal era amplia pero cada vez que te adentrabas mas se iba achicando, bajaste "
            + "por lugares muy apretados, en los cuales apenas podias pasar arrastrandote como gusano, despues de un tiempo investigando y "
            + "sin haber encontrado nada interesante, decides regresar, el regreso era como un laberinto con la cantidad de tuneles que "
            + "tenia la cueva, pero podias lograrlo. Comienzas tu salida pero te atascas con la parte superior e inferior de la cueva "
            + "realizas todo tipo de movimientos para poder safarte, pero es en vano, no puedes salir. "
            + "Los dias pasan y tu sigues atorado en esa cueva hasta que mueres.", null, null, 0, 0,fabrica.crearFinal(3));


    A1.agregarPagina(L1, 11, "Decides omitir la cueva y sigues por el camino, comienzas a subir el cerro y llegas hasta lo mas alto, ahi "
            + "ves el faro que lograste ver en el comienzo y el cual era tu objetivo. Te vas acercando y ves que estaba rodeado de "
            + "personas celebrando, era tu familia esperandote, te dan una medalla dorada por haber superado todas las pruebas "
            + "y regresas a casa junto a tu familia. ", null, null, 0, 0,fabrica.crearFinal(3));

    A1.agregarPagina(L1, 3, "Das la vuelta y a los pocos metros divisas unos cuantos pares de ojos plateados a la distancia, asi que decides "
            + "adentrarte por el bosque. A los pocos minutos la luz se va y quedas junto a un arbol, tus sentidos son agudos, asi que puedes "
            + "escuchar y tener una ubicacion aproximada de los seres. "
            + "¿Que quieres hacer?", "Subir el arbol", "Prender la antorcha", 6, 7,fabrica.crearFinal(1));


    A1.agregarPagina(L1, 6, "Subes por el arbol lo mas silencioso que puedes, cuando vas aproximadamente por la mitad, de entre las "
            + "nubes comienza a salir la luna nuevamente, al mirar hacia abajo, ves a las extrañas entidades rastreandote, con una "
            + "estructura fisiologica muy singular, piel escamosa y ojos que reflejan un brillo plateado. De pronto comienzan a subir "
            + "por tu arbol, junto a ti hay otro arbol... "
            + "¿Que decicion tomaras?", "Saltar al otro arbol", "Usar la antorcha", 12, 13,fabrica.crearFinal(1));

    A1.agregarPagina(L1, 7, "Enciendes la antorcha, pero no ilumina demasiado, tu miedo incrementa mas debido a que no puedes ver lo que "
            + "esta delante de ti, continuas caminando por el bosque, escuchando extraños ruidos y con la sensacion de que te estan "
            + "observando... Los cielos se despejan y llegas hasta una cabaña en medio del bosque, parece abandonada ya que las ventanas "
            + "estan rotas y la puerta esta abierta, llamandote a entrar. "
            + "¿Quieres investigarla?", "Entrar en la cabaña", "Ir por el bosque", 14, 15,fabrica.crearFinal(1));

    A1.agregarPagina(L1, 14, "Subes las escaleras y te encuentras frente a la puerta, no logras ver muy bien el estado que tiene asi "
            + "que te adentras. Caminas por las habitaciones, el piso, que esta construido de tablas, rechina con cada paso que das. "
            + "Subes por las escaleras que dan al segundo piso, por el pasillo ves un altar encendido, con unas velas tamaños,  "
            + "ademas hay 4 cuadros con fotografias de personas que no conoces, menos 1 que te parece muy familiar, la "
            + "tomas para observarla mejor y te das cuenta que eres tu!. Asustado, comienzas a correr para salir de la casa, pero "
            + "una de las tablas del piso colapsa y caes por un agujero. Cuando recobras conocimiento, te das cuenta de que estas "
            + "en una cueva, aparentemente sin salida a la superficie...",null, null, 0, 0,fabrica.crearFinal(3));

    A1.agregarPagina(L1, 15, "Pasas caminando por el lado de la casa y continuas mirando a los alrededores. Comienzas a cansarte "
            + "de caminar y sientes que no puedes mas, asi que te sientas para descansar unos minutos, cuando esta todo tranquilo "
            + "la luz de tu antorcha comienza a reflejarse en unos ojos delante de ti, asustado, corres por tu vida entre los arboles "
            + "hasta que llegas a un claro, pasas corriendo por el centro y caes en una trampa!, tu antorcha sale volando y caes "
            + "en un pozo, desde aqui, no puedes ver nada, solo las estrellas, las cuales desaparecen pronto ya que la criatura "
            + "bajando obstruye tu vision. Sin poder hacer nada, cierras tus ojos y comienzas a rezar con todas tus fuerzas, cuando "
            + "los abres, estas de regreso al inicio de la aventura...","Continuar", null, 1, 2,fabrica.crearFinal(2));

    A1.agregarPagina(L1, 12, "Consigues la fuerza para realizar el salto que necesitas y llegar al otro arbol, pero cuando "
            + "aterrizas en las ramas, estas comienzan a crujir y posteriormente colapsar. Estas en caida libre hacia el suelo, "
            + "impactas contra la tierra y quedas sin respiracion e inconciente por unos instantes, recuperas la respiracion despues "
            + "de unos segundos, tratas de moverte pero no puedes, te das cuenta que las criaturas estan sobre ti comiendo tu cuerpo..."
            ,null,null,0,0,fabrica.crearFinal(3));        

    A1.agregarPagina(L1, 13, "Mientras las criatura sube, sacas la antorcha de tu mochila y tratas de encenderla, pero no lo logras "
            + "continuas tratando de encenderla hasta que lo logras, para entonces, la criatura ya estan a 20 centimetros de ti... "
            + "Agarras tu antorcha con fuerzas, mientras te afirmas del arbol con la otra mano y comienzas a azotar con fuerza "
            + "al ente, en uno de esos golpes, logras golpearle sus ojos y este comienza a gritar muy fuerte y salta hasta el suelo. "
            + "Ves como el ser se va corriendo y chocando contra los demas arboles, bajas con tu antorcha flameando de un azul intenso "
            + "debido al cloruro de cobre de la sangre de la criatura y te vas corriendo para salir del bosque."
            + "",null,null,0,0,fabrica.crearFinal(3));


    //AGREGANDO IMAGEN/SONIDOS POR NUMERO DE PAGINA
    //Portada
    L1.setImagen("Imagenes/Portada.png");
    
    //PAG1
    L1.getPaginas().get(1).setImagen("Imagenes/pag1.jpg");
    L1.getPaginas().get(1).setSonidoOp1("/proyectogui/Musica/pasos.wav");
    L1.getPaginas().get(1).setSonidoOp2("/proyectogui/Musica/pasos.wav");        
    //PAG2
    L1.getPaginas().get(2).setImagen("Imagenes/pag2.png"); 
    L1.getPaginas().get(2).setSonidoOp1("/proyectogui/Musica/rioConPasos-1.wav");
    L1.getPaginas().get(2).setSonidoOp2("/proyectogui/Musica/pasos.wav");           
    //PAG3
    L1.getPaginas().get(3).setImagen("Imagenes/pag3.png"); 
    L1.getPaginas().get(3).setSonidoOp1("/proyectogui/Musica/pasos.wav");
    L1.getPaginas().get(3).setSonidoOp2("/proyectogui/Musica/antorchaExtend.wav");           
     //PAG4
    L1.getPaginas().get(4).setImagen("Imagenes/pag4.png");
    L1.getPaginas().get(4).setSonidoOp1("/proyectogui/Musica/caidaAgua.wav");
    L1.getPaginas().get(4).setSonidoOp2("/proyectogui/Musica/pasos.wav");        
    //PAG5
    L1.getPaginas().get(5).setImagen("Imagenes/pag5.png"); 
    L1.getPaginas().get(5).setSonidoOp1("/proyectogui/Musica/cueva+antorchaExtend.wav");
    L1.getPaginas().get(5).setSonidoOp2("/proyectogui/Musica/salidaAplausos.wav");
    //PAG6
    L1.getPaginas().get(6).setImagen("Imagenes/pag6.jpg");
    L1.getPaginas().get(6).setSonidoOp1("/proyectogui/Musica/pasos.wav");
    L1.getPaginas().get(6).setSonidoOp2("/proyectogui/Musica/pelearAntorcha.wav");   

    //PAG7
    L1.getPaginas().get(7).setImagen("Imagenes/pag7.png");
    L1.getPaginas().get(7).setSonidoOp1("/proyectogui/Musica/pasos.wav");
    L1.getPaginas().get(7).setSonidoOp2("/proyectogui/Musica/pasos.wav");        
    //PAG8
    L1.getPaginas().get(8).setImagen("Imagenes/pag8.png"); 
    L1.getPaginas().get(8).setSonidoOp1("/proyectogui/Musica/pasos.wav");
    L1.getPaginas().get(8).setSonidoOp2("/proyectogui/Musica/pasos.wav");           
    //PAG9
    L1.getPaginas().get(9).setImagen("Imagenes/pag9.png"); 
    L1.getPaginas().get(9).setSonidoOp1("/proyectogui/Musica/pasos.wav");
    L1.getPaginas().get(9).setSonidoOp2("/proyectogui/Musica/pasos.wav");           
     //PAG10
    L1.getPaginas().get(10).setImagen("Imagenes/pag10.png");
    L1.getPaginas().get(10).setSonidoOp1("null");
    L1.getPaginas().get(10).setSonidoOp2("null");        
    //PAG11
    L1.getPaginas().get(11).setImagen("Imagenes/pag11.png");
    L1.getPaginas().get(11).setSonidoOp1("null");
    L1.getPaginas().get(11).setSonidoOp2("null");           
    //PAG12
    L1.getPaginas().get(12).setImagen("Imagenes/pag12.png");
    L1.getPaginas().get(12).setSonidoOp1("/proyectogui/Musica/pasos.wav");
    L1.getPaginas().get(12).setSonidoOp2("/proyectogui/Musica/pasos.wav");         
     //PAG13
    L1.getPaginas().get(13).setImagen("Imagenes/pag13.png");
    L1.getPaginas().get(13).setSonidoOp1("/proyectogui/Musica/pasos.wav");
    L1.getPaginas().get(13).setSonidoOp2("/proyectogui/Musica/pasos.wav");        
    //PAG14
    L1.getPaginas().get(14).setImagen("Imagenes/pag14.png");
    L1.getPaginas().get(14).setSonidoOp1("/proyectogui/Musica/pasos.wav");
    L1.getPaginas().get(14).setSonidoOp2("/proyectogui/Musica/pasos.wav");           
    //PAG15
    L1.getPaginas().get(15).setImagen("Imagenes/pag15.png"); 
    L1.getPaginas().get(15).setSonidoOp1("/proyectogui/Musica/pasos.wav");
    L1.getPaginas().get(15).setSonidoOp2("/proyectogui/Musica/pasos.wav");           

    listaLibros.add(L1);

    VentanaPrincipal ventana = new VentanaPrincipal(listaLibros);  
    ventana.setResizable(false);
    ventana.setVisible(true);
    }
    
}
