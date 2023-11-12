
package Vista;

import Controlador.Manejador_productos;
import Bitacora.*;


public class Votaciones extends javax.swing.JFrame {
    private Manejador_productos listado = null;
    private Asignar_Productos asigna;
    private Barras_grafica g_barras;
    private Pastel_grafica g_pastel;
    private Registro bitacora = new Registro();

    /**
     * Creates new form
     */
    
    public Votaciones() {
        this.setName("Votaciones");
        bitacora.Escribir(this.getName(), "inicio sin productos");
        initComponents();
        setLocationRelativeTo(this);
    }
    
    public Votaciones(Manejador_productos productos) {
        this.setName("Votaciones");
        listado = productos;
        bitacora.Escribir(this.getName(), "inicio con productos");
        initComponents();
        setLocationRelativeTo(this);
        if(hay_Productos()){
            habilitar();
            modelar_productos();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jOptionPane1 = new javax.swing.JOptionPane();
        jFileChooser1 = new javax.swing.JFileChooser();
        jDialog4 = new javax.swing.JDialog();
        Titulo = new javax.swing.JLabel();
        Pregunta = new javax.swing.JLabel();
        producto_1_text = new javax.swing.JLabel();
        producto_2_text = new javax.swing.JLabel();
        producto_3_text = new javax.swing.JLabel();
        B_voto_1 = new javax.swing.JButton();
        B_voto_2 = new javax.swing.JButton();
        B_voto_3 = new javax.swing.JButton();
        cont_votos_2 = new javax.swing.JLabel();
        cont_votos_1 = new javax.swing.JLabel();
        cont_votos_3 = new javax.swing.JLabel();
        B_graficas = new javax.swing.JButton();
        B_cambiar_productos = new javax.swing.JButton();
        B_refrescar = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Votaciones de productos!");

        Titulo.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        Titulo.setText("Bienvenido a las votaciones del momento!");
        Titulo.setToolTipText("");

        Pregunta.setFont(new java.awt.Font("Microsoft YaHei", 2, 18)); // NOI18N
        Pregunta.setText("Cual es tu producto favorito?");

        producto_1_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        producto_1_text.setText("Producto_1");

        producto_2_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        producto_2_text.setText("Producto_2");

        producto_3_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        producto_3_text.setText("Producto_3");

        B_voto_1.setText("Votar!");
        B_voto_1.setEnabled(false);
        B_voto_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_voto_1ActionPerformed(evt);
            }
        });

        B_voto_2.setText("Votar!");
        B_voto_2.setEnabled(false);
        B_voto_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_voto_2ActionPerformed(evt);
            }
        });

        B_voto_3.setText("Votar!");
        B_voto_3.setEnabled(false);
        B_voto_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_voto_3ActionPerformed(evt);
            }
        });

        cont_votos_2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cont_votos_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cont_votos_2.setText("0");
        cont_votos_2.setToolTipText("");

        cont_votos_1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cont_votos_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cont_votos_1.setText("0");
        cont_votos_1.setToolTipText("");

        cont_votos_3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cont_votos_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cont_votos_3.setText("0");
        cont_votos_3.setToolTipText("");

        B_graficas.setText("Ver Graficas");
        B_graficas.setEnabled(false);
        B_graficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_graficasActionPerformed(evt);
            }
        });

        B_cambiar_productos.setText("Cambiar Productos");
        B_cambiar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_cambiar_productosActionPerformed(evt);
            }
        });

        B_refrescar.setText("R");
        B_refrescar.setEnabled(false);
        B_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_refrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B_voto_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(producto_1_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(cont_votos_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(B_voto_2)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cont_votos_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(producto_2_text, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(B_voto_3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cont_votos_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)))
                    .addComponent(producto_3_text, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Titulo)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(B_graficas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_cambiar_productos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B_refrescar)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pregunta)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_3_text)
                    .addComponent(producto_2_text)
                    .addComponent(producto_1_text))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cont_votos_2)
                    .addComponent(cont_votos_1)
                    .addComponent(cont_votos_3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_voto_1)
                    .addComponent(B_voto_2)
                    .addComponent(B_voto_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_graficas)
                    .addComponent(B_cambiar_productos)
                    .addComponent(B_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_voto_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_voto_1ActionPerformed
        escribirEnBitacora(this.getName(), "Se presiono voto a producto " + listado.Producto_1().getNombre());
        listado.Producto_1().agregar_voto();
        Enviar_a_graficas();
        cont_votos_1.setText("" + listado.Producto_1().getVotos());
    }//GEN-LAST:event_B_voto_1ActionPerformed

    private void B_voto_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_voto_2ActionPerformed
        escribirEnBitacora(this.getName(), "Se preciono voto a producto " + listado.Producto_2().getNombre());
        listado.Producto_2().agregar_voto();
        Enviar_a_graficas();
        cont_votos_2.setText("" + listado.Producto_2().getVotos());
    }//GEN-LAST:event_B_voto_2ActionPerformed

    private void B_voto_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_voto_3ActionPerformed
        escribirEnBitacora(this.getName(), "Se preciono voto a producto " + listado.Producto_3().getNombre());
        listado.Producto_3().agregar_voto();
        Enviar_a_graficas();
        cont_votos_3.setText("" + listado.Producto_3().getVotos());

    }//GEN-LAST:event_B_voto_3ActionPerformed

    private void B_cambiar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_cambiar_productosActionPerformed
        if(asigna != null){
            bitacora.Escribir(this.getName(), "Se puso visible la ventana de asignacion");
            asigna.setVisible(true);
        }else{
            bitacora.Escribir(this.getName(), "Se creo y se puso visible la ventana de asignacion");
            asigna = new Asignar_Productos(listado);
            asigna.setVisible(true);
        }
        B_refrescar.setEnabled(rootPaneCheckingEnabled);
        bitacora.Escribir(this.getName(), "Se habilito el boton refrescar");
    }//GEN-LAST:event_B_cambiar_productosActionPerformed

    private void B_graficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_graficasActionPerformed
        if(g_barras != null && g_pastel != null){
            bitacora.Escribir(this.getName(), "Ambas graficas se pusieron visibles");
            g_barras.setVisible(true);
            g_pastel.setVisible(true);
        }else{
            bitacora.Escribir(this.getName(), "Se crearon ambas graficas y se pusieron visibles");
            g_barras = new Barras_grafica(listado);
            g_barras.setVisible(true);
            g_pastel = new Pastel_grafica(listado);
            g_pastel.setVisible(true);
        }
    }//GEN-LAST:event_B_graficasActionPerformed

    private void B_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_refrescarActionPerformed
        bitacora.Escribir(this.getName(), "Se obtienen los nuevos productos");
        listado = asigna.obtener_productos();
        if(hay_Productos()){
            bitacora.Escribir(this.getName(), "Se hailitan los demas botones y se muestran los datos obtenidos de los productos otorgados");
            habilitar();
            modelar_productos();
        }
    }//GEN-LAST:event_B_refrescarActionPerformed
private void escribirEnBitacora(String nombreProducto, String descripcion){
    bitacora.Escribir(nombreProducto, descripcion);
}

    private void modelar_productos() { // vista orquesta
        bitacora.Escribir(this.getName(), "Modelado de nombres y cantidad de votos");
        escribir_nombres();
        escribir_votos();
    }

    private void escribir_nombres() { // vista, reescribe el nombre de los productos
        producto_1_text.setText(listado.Producto_1().getNombre());
        producto_2_text.setText(listado.Producto_2().getNombre());
        producto_3_text.setText(listado.Producto_3().getNombre());
    }

    private void escribir_votos() { // vista, escribe los votos de los productos
       cont_votos_1.setText("" + listado.Producto_1().getVotos());
       cont_votos_2.setText("" + listado.Producto_2().getVotos());
       cont_votos_3.setText("" + listado.Producto_3().getVotos());
    }

    private boolean hay_Productos() { // a controlador, validacion
        return listado != null;
    }

    private void habilitar() { // vista, habilita botones
        B_voto_1.setEnabled(rootPaneCheckingEnabled);
        B_voto_2.setEnabled(rootPaneCheckingEnabled);
        B_voto_3.setEnabled(rootPaneCheckingEnabled);
        B_graficas.setEnabled(rootPaneCheckingEnabled);
    }

    private void Enviar_a_graficas() { // vista, solo envia datos a otra ventana
        if(g_barras != null && g_pastel != null){
            g_barras = new Barras_grafica(listado);
            g_pastel = new Pastel_grafica(listado);
        }else{
            g_barras = new Barras_grafica(listado);
            g_pastel = new Pastel_grafica(listado);
        }
        g_barras.Repaint();
        g_pastel.Repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_cambiar_productos;
    private javax.swing.JButton B_graficas;
    private javax.swing.JButton B_refrescar;
    private javax.swing.JButton B_voto_1;
    private javax.swing.JButton B_voto_2;
    private javax.swing.JButton B_voto_3;
    private javax.swing.JLabel Pregunta;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel cont_votos_1;
    private javax.swing.JLabel cont_votos_2;
    private javax.swing.JLabel cont_votos_3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JLabel producto_1_text;
    private javax.swing.JLabel producto_2_text;
    private javax.swing.JLabel producto_3_text;
    // End of variables declaration//GEN-END:variables

}
