package com.mycompany.ideunillanos.Vistas;

import com.mycompany.ideunillanos.Controladores.ControladorArchivo;
import com.mycompany.ideunillanos.Controladores.ControladorPlugin;
import com.mycompany.ideunillanos.DTO.ArchivoDTO;
import java.awt.Color;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Start extends javax.swing.JFrame {

    private ArchivoDTO archivoDTO;
    private final ControladorArchivo controladorArchivo = ControladorArchivo.getInstance();
    private final ControladorPlugin controladorPlugin = ControladorPlugin.getInstance();
    private String componenteSeleccionado;

    public Start() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Editor de Texto - Unillanos V1.0");
        setVisible(true);

        StyledDocument doc = PanelTextSalidaMensajes.getStyledDocument();
        PanelTextSalidaMensajes.setBackground(Color.BLACK);
        Style estiloCorrecto = PanelTextSalidaMensajes.addStyle("Correcto", null);
        StyleConstants.setForeground(estiloCorrecto, Color.GREEN);

        Style estiloError = PanelTextSalidaMensajes.addStyle("Error", null);
        StyleConstants.setForeground(estiloError, Color.RED);

        Style estiloAdvertencia = PanelTextSalidaMensajes.addStyle("Advertencia", null);
        StyleConstants.setForeground(estiloAdvertencia, Color.YELLOW);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelArchivoInicial = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelTextArchivoInicial = new javax.swing.JTextPane();
        btnCargarArchivo = new javax.swing.JButton();
        PanelArchivoProcesado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        PanelTextArchivoProcesado = new javax.swing.JEditorPane();
        PanelCargarComponente = new javax.swing.JPanel();
        btnCargarComponente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PanelComponentesCargados = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaComponentes = new javax.swing.JList<>();
        PanelEjecutarComponente = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnEjecutarComponente = new javax.swing.JButton();
        PanelSalidaMensajes = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        PanelTextSalidaMensajes = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setPreferredSize(new java.awt.Dimension(1000, 800));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelArchivoInicial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelArchivoInicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Archivo inicial");
        PanelArchivoInicial.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 20));

        PanelTextArchivoInicial.setEditable(false);
        jScrollPane1.setViewportView(PanelTextArchivoInicial);

        PanelArchivoInicial.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 590, 220));

        btnCargarArchivo.setText("Cargar archivo");
        btnCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarArchivoActionPerformed(evt);
            }
        });
        PanelArchivoInicial.add(btnCargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 130, 30));

        PanelPrincipal.add(PanelArchivoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 610, 280));

        PanelArchivoProcesado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelArchivoProcesado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Archivo procesado");
        PanelArchivoProcesado.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 20));

        PanelTextArchivoProcesado.setEditable(false);
        jScrollPane5.setViewportView(PanelTextArchivoProcesado);

        PanelArchivoProcesado.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 590, 230));

        PanelPrincipal.add(PanelArchivoProcesado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 610, 260));

        PanelCargarComponente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelCargarComponente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCargarComponente.setText("Cargar componente");
        btnCargarComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarComponenteActionPerformed(evt);
            }
        });
        PanelCargarComponente.add(btnCargarComponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 320, 30));

        jLabel3.setText("Cargar componente");
        PanelCargarComponente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        PanelPrincipal.add(PanelCargarComponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 60));

        PanelComponentesCargados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelComponentesCargados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListaComponentes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaComponentesValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(ListaComponentes);

        PanelComponentesCargados.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 360));

        PanelPrincipal.add(PanelComponentesCargados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 340, 380));

        PanelEjecutarComponente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelEjecutarComponente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Ejecutar componente");
        PanelEjecutarComponente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        btnEjecutarComponente.setText("Ejecutar componente");
        btnEjecutarComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarComponenteActionPerformed(evt);
            }
        });
        PanelEjecutarComponente.add(btnEjecutarComponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 320, 30));

        PanelPrincipal.add(PanelEjecutarComponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 340, 60));

        PanelSalidaMensajes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelSalidaMensajes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelTextSalidaMensajes.setEditable(false);
        jScrollPane4.setViewportView(PanelTextSalidaMensajes);

        PanelSalidaMensajes.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 950, 80));

        jLabel5.setText("Salida de mensajes");
        PanelSalidaMensajes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        PanelPrincipal.add(PanelSalidaMensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 970, 110));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarArchivoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos Java", "java"));

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            archivoDTO = new ArchivoDTO(file);
            try {
                controladorArchivo.cargar(archivoDTO);
                String contenido = controladorArchivo.getContenido();
                String mensaje = "Archivo cargado correctamente: " + file.getAbsolutePath();
                mensajesSalida(mensaje, "Correcto");
                PanelTextArchivoInicial.setText(contenido);
            } catch (IOException e) {
                String mensaje = "\nError al cargar el archivo: " + e.getMessage();
                mensajesSalida(mensaje, "Error");
                PanelTextArchivoInicial.setText("");
            }
        } else {
            String mensaje = "\nNo se seleccionó ningún archivo";
            mensajesSalida(mensaje, "Advertencia");
            PanelTextArchivoInicial.setText("");
        }
    }//GEN-LAST:event_btnCargarArchivoActionPerformed

    private void btnCargarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarComponenteActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos JAR", "jar"));

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            archivoDTO = new ArchivoDTO(file);
            try {
                controladorPlugin.cargarPlugin(archivoDTO);
                String mensaje = "\nComponente cargado correctamente:" + file.getAbsolutePath();
                mensajesSalida(mensaje, "Correcto");
                DefaultListModel<String> model = new DefaultListModel<>();
                for (Map.Entry<String, File> entry : controladorPlugin.obtenerPlugins().entrySet()) {
                    model.addElement(entry.getKey());
                }
                ListaComponentes.setModel(model);
            } catch (IOException e) {
                String mensaje = "\nError al cargar el componente: " + e.getMessage();
                mensajesSalida(mensaje, "Error");
            }
        } else {
            String mensaje = "\nNo se seleccionó ningún componente";
            mensajesSalida(mensaje, "Advertencia");
        }
    }//GEN-LAST:event_btnCargarComponenteActionPerformed

    private void btnEjecutarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarComponenteActionPerformed
        PanelTextArchivoProcesado.setText("");
        if (archivoDTO != null) {
            if (componenteSeleccionado != null) {
                String contenido = controladorArchivo.getContenido();
                try {
                    String resultado = controladorPlugin.ejecutarPlugin(componenteSeleccionado, contenido);
                    String contenidoFormateado = "<pre>" + resultado + "</pre>";
                    PanelTextArchivoProcesado.setContentType("text/html");
                    PanelTextArchivoProcesado.setText(contenidoFormateado);
                    String mensaje = "\nComponente: " + componenteSeleccionado + " ejecutado con exito.";
                    mensajesSalida(mensaje, "Correcto");
                } catch (Exception ex) {
                    PanelTextArchivoProcesado.setText("");
                    String mensaje = "\nError al ejecutar el componente: " + ex.getMessage();
                    mensajesSalida(mensaje, "Error");
                }
            } else {
                String mensaje = "\nNo se ha seleccionado ningún componente para ejecutar.";
                mensajesSalida(mensaje, "Advertencia");
            }
        } else {
            String mensaje = "\nNo se ha cargado ningún archivo para procesar.";
            mensajesSalida(mensaje, "Advertencia");
        }
    }//GEN-LAST:event_btnEjecutarComponenteActionPerformed

    private void ListaComponentesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaComponentesValueChanged
        if (!evt.getValueIsAdjusting()) {
            JList<String> listaComponentes = (JList<String>) evt.getSource();
            componenteSeleccionado = ListaComponentes.getSelectedValue();
            String mensaje = "\nComponente seleccionado: " + componenteSeleccionado;
            mensajesSalida(mensaje, "Advertencia");
        }
    }//GEN-LAST:event_ListaComponentesValueChanged

    private void mensajesSalida(String mensaje, String style) {
        StyledDocument doc = PanelTextSalidaMensajes.getStyledDocument();
        Style estilo = null; // Estilo por defecto

        if (style.equals("Correcto")) {
            estilo = PanelTextSalidaMensajes.getStyle("Correcto");
        } else if (style.equals("Error")) {
            estilo = PanelTextSalidaMensajes.getStyle("Error");
        } else if (style.equals("Advertencia")) {
            estilo = PanelTextSalidaMensajes.getStyle("Advertencia");
        }
        try {
            doc.insertString(doc.getLength(), "\n" + mensaje, estilo);
        } catch (BadLocationException ex) {
            System.out.println(ex.toString());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaComponentes;
    private javax.swing.JPanel PanelArchivoInicial;
    private javax.swing.JPanel PanelArchivoProcesado;
    private javax.swing.JPanel PanelCargarComponente;
    private javax.swing.JPanel PanelComponentesCargados;
    private javax.swing.JPanel PanelEjecutarComponente;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelSalidaMensajes;
    private javax.swing.JTextPane PanelTextArchivoInicial;
    private javax.swing.JEditorPane PanelTextArchivoProcesado;
    private javax.swing.JTextPane PanelTextSalidaMensajes;
    private javax.swing.JButton btnCargarArchivo;
    private javax.swing.JButton btnCargarComponente;
    private javax.swing.JButton btnEjecutarComponente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables

}
