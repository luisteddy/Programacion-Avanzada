/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectogui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import proyectogui.Archivos.AventuraLibro;
import proyectogui.Archivos.CuandoCompletasLibro;

/**
 *
 * @author edgar
 */
public class VentanaPaginas extends javax.swing.JFrame {
    AventuraLibro libro1 = new AventuraLibro();
    private Reproductor R1 = new Reproductor();
    private Reproductor Base = new Reproductor();
    private Reproductor especial = new Reproductor();
    private int pagActual;
    private int nodo1;
    private int nodo2;
    private boolean nuevo = false;
    private JFrame lector;
    private JPanel panelFondo;
    private int indice;
    CuandoCompletasLibro observador = new CuandoCompletasLibro("Imagenes/observer.jpg","/proyectogui/Musica/observer.wav");
    
    /**
     * Creates new form Libro
     * @param _libro
     * @param _inicio
     * @param _reproductor1
     * @param _ventana
     * @param _indice
     */
    public VentanaPaginas(AventuraLibro _libro, int _inicio, Reproductor _reproductor1, VentanaLector _ventana, int _indice) {
        libro1 = _libro;
        Base = _reproductor1;
        lector = _ventana;
        indice = _indice;
        nodo1 = libro1.getPaginas().get(_inicio).getNodo1();
        nodo2 = libro1.getPaginas().get(_inicio).getNodo2();
        pagActual = _inicio;
        setTitle(libro1.getTituloAventura());
        libro1.addObservador(observador);
        crearPanel();
        initComponents();
        iniciar(libro1);
        btnSalir.setEnabled(false);
    }


    public void crearPanel(){
        panelFondo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                String rutaRelativa = libro1.getPaginas().get(pagActual).getImagen();
                ImageIcon icon = new ImageIcon(getClass().getResource(rutaRelativa));
                Image imagen = icon.getImage();
                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), null);
            }
        };
        panelFondo.setLayout(null);
        setContentPane(panelFondo);
    }
    

    public void cambiarFondo(int pagina){
        pagActual = pagina;
        panelFondo.repaint();
   
    }
    

    public void actualizarContenido(AventuraLibro Libro1){
        int a = Libro1.getPaginas().get(pagActual).getNumero();
        lblNumPag.setText(Integer.toString(a));
        if(indice == 0){
            String textoConSaltosHTML = convertir(Libro1.getPaginas().get(pagActual).getContenido());
            lblContenido.setText("<html>"+textoConSaltosHTML+"</html>"); 
        }else{
            lblContenido.setText(Libro1.getPaginas().get(pagActual).getContenido());
        }
    }
    
    public void iniciar(AventuraLibro Libro1){
        lblNumPag.setText(Integer.toString(pagActual));
        btnop1.setText(Libro1.getPaginas().get(pagActual).getOp1());
        btnop2.setText(Libro1.getPaginas().get(pagActual).getOp2());
        if(indice == 0){
            String textoConSaltosHTML = convertir(Libro1.getPaginas().get(pagActual).getContenido());
            lblContenido.setText("<html>"+textoConSaltosHTML+"</html>");
        }else{
            lblContenido.setText(Libro1.getPaginas().get(pagActual).getContenido());
        }
    }

    public String convertir(String texto) {
        return texto.replaceAll("\n", "<br>");
    }

    public void actualizarComponentes(AventuraLibro Libro1){
        actualizarContenido(Libro1);
        if (Libro1.getPaginas().get(pagActual).getTipopaginas().getTipo() == 1){
            btnop1.setText(Libro1.getPaginas().get(pagActual).getOp1());
            if(nuevo == true){
                nuevo = false;
            }else{
                btnop2.setText(Libro1.getPaginas().get(pagActual).getOp2());  
            }          
        }else if(Libro1.getPaginas().get(pagActual).getTipopaginas().getTipo() == 2){
            btnop1.setText(Libro1.getPaginas().get(pagActual).getOp1());
            btnop2.setText(""); 
            btnop2.setEnabled(false);
            nuevo = true;
        }else if (Libro1.getPaginas().get(pagActual).getTipopaginas().getTipo() == 3){
            btnSalir.setEnabled(true);
            btnop1.setText("");
            btnop2.setText("");            
            btnop1.setEnabled(false);
            btnop2.setEnabled(false);
        }
        
        if (Libro1.getPaginas().get(pagActual).getNumero() == 10){
            Base.detener();
        }else if(Libro1.getPaginas().get(pagActual).getNumero() == 1){
            especial.detener();
        }
    }
    
    public void actualizarNodos(AventuraLibro Libro1){
        nodo1 = Libro1.getPaginas().get(pagActual).getNodo1();
        nodo2 = Libro1.getPaginas().get(pagActual).getNodo2();
    }
    
    public void regresar(JFrame _ventana){
        setVisible(false);
        _ventana.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumPag = new javax.swing.JLabel();
        lblContenido = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnop1 = new javax.swing.JButton();
        btnop2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 700));

        lblNumPag.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumPag.setForeground(new java.awt.Color(255, 255, 255));

        lblContenido.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        lblContenido.setForeground(new java.awt.Color(255, 255, 255));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.setEnabled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnop1.setBackground(new java.awt.Color(0, 0, 0));
        btnop1.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        btnop1.setForeground(new java.awt.Color(255, 255, 255));
        btnop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnop1ActionPerformed(evt);
            }
        });

        btnop2.setBackground(new java.awt.Color(0, 0, 0));
        btnop2.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        btnop2.setForeground(new java.awt.Color(255, 255, 255));
        btnop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnop2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumPag, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnop1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btnop2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblNumPag, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(lblContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnop1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnop2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnop1ActionPerformed
        R1.detener();
        R1.reproducir(libro1.getPaginas().get(pagActual).getSonidoOp1(),0.95f);
        pagActual = nodo1;
        cambiarFondo(pagActual);
        if(pagActual != 1 && btnop2.getText().equals("")){
            btnop2.setEnabled(true);
        }
        actualizarComponentes(libro1);
        actualizarNodos(libro1);
    }//GEN-LAST:event_btnop1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        libro1.setEstado();
        R1.detener();
        Base.detener();
        especial.detener();
        VentanaObserver Vobserver = new VentanaObserver(observador.getImagen(),observador.getAudio(),lector);
        this.setVisible(false);
        Vobserver.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnop2ActionPerformed
        R1.detener();
        if(pagActual == 3){
            especial.reproducir(libro1.getPaginas().get(pagActual).getSonidoOp2(),0.95f);
        }else{
            R1.reproducir(libro1.getPaginas().get(pagActual).getSonidoOp2(),0.95f);
        }
        pagActual = nodo2;
        cambiarFondo(pagActual);
        actualizarComponentes(libro1);
        actualizarNodos(libro1);
    }//GEN-LAST:event_btnop2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnop1;
    private javax.swing.JButton btnop2;
    private javax.swing.JLabel lblContenido;
    private javax.swing.JLabel lblNumPag;
    // End of variables declaration//GEN-END:variables
}
