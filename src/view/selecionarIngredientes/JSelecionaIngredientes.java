/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.selecionarIngredientes;

import java.util.List;
import model.comum.ingredientes.Ingrediente;

/**
 *
 * @author Ale
 */
public class JSelecionaIngredientes extends javax.swing.JFrame {

    /**
     * Creates new form JSelecionaIngredientes
     */
    private List<Ingrediente> ingrediente;
    private JModelTableIngredientes modelTableIngrediente;
    
    public JSelecionaIngredientes(List<Ingrediente> ingrediente) {
        initComponents();
        this.ingrediente = ingrediente;
        modelTableIngrediente = new JModelTableIngredientes(this.ingrediente);
        tblIngredientes.setModel(modelTableIngrediente);
        
        tblIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tblIngredientes.rowAtPoint(evt.getPoint());
                
                modelTableIngrediente.getIngredienteAt(row).setRemovidaDaPizza();
                modelTableIngrediente.update();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngredientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblIngredientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblIngredientes;
    // End of variables declaration//GEN-END:variables
}
