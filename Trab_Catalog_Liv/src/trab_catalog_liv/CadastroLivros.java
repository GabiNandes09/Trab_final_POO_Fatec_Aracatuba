
package trab_catalog_liv;

import Database.Buscar;
import ModelDAO.*;
import Models.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class CadastroLivros extends javax.swing.JFrame {
    
    FrmMenu menu = new FrmMenu();
    AutorDAO autorDAO = new AutorDAO();
    EditoraDAO editoraDAO = new EditoraDAO();
    GeneroDAO generoDAO = new GeneroDAO();
    EditarAutor editarAutor = new EditarAutor();
    

    
    public CadastroLivros() {
        initComponents(); 
        setLocationRelativeTo(null);
        popularAutor(autorDAO.listarAutor());
        popularEditora(editoraDAO.listarEditora());
        popularGenero(generoDAO.listarGenero());
    }
    
    public void popularAutor(ArrayList<Autor> listaAutor){
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for(Autor x : listaAutor){
            model.addElement(x.toString());
        }
        cbxAutor.setModel(model);
    }
    public void popularEditora(ArrayList<Editora> listaEditora){
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for(Editora x : listaEditora){
            model.addElement(x.toString());
        }
        cbxEditora.setModel(model);
    }
    
    public void popularGenero(ArrayList<Genero> listaGenero){
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for(Genero x : listaGenero){
            model.addElement(x.toString());
        }
        cbxGenero.setModel(model);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCadastrarLivro = new javax.swing.JButton();
        txtNomeLivro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxAutor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbxGenero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbxEditora = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnApagar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAddAutor = new javax.swing.JButton();
        btnAddGenero = new javax.swing.JButton();
        btnAddEditora = new javax.swing.JButton();
        btnEditarAutor = new javax.swing.JButton();
        btnEditarGenero = new javax.swing.JButton();
        btnEditarEditora = new javax.swing.JButton();
        btnDeleteGenero = new javax.swing.JButton();
        btnDeleteAutor1 = new javax.swing.JButton();
        btnDeleteEditora = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome:");

        btnCadastrarLivro.setText("CADASTRAR");
        btnCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLivroActionPerformed(evt);
            }
        });

        jLabel2.setText("Autor:");

        cbxAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAutorActionPerformed(evt);
            }
        });

        jLabel3.setText("Gênero:");

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Editora:");

        cbxEditora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("CADASTRO DE LIVROS");

        btnApagar.setText("APAGAR");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAddAutor.setText("+");
        btnAddAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAutorActionPerformed(evt);
            }
        });

        btnAddGenero.setText("+");
        btnAddGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGeneroActionPerformed(evt);
            }
        });

        btnAddEditora.setText("+");
        btnAddEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEditoraActionPerformed(evt);
            }
        });

        btnEditarAutor.setText("editar");
        btnEditarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAutorActionPerformed(evt);
            }
        });

        btnEditarGenero.setText("editar");
        btnEditarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarGeneroActionPerformed(evt);
            }
        });

        btnEditarEditora.setText("editar");
        btnEditarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEditoraActionPerformed(evt);
            }
        });

        btnDeleteGenero.setText("X");
        btnDeleteGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteGeneroActionPerformed(evt);
            }
        });

        btnDeleteAutor1.setText("X");
        btnDeleteAutor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAutor1ActionPerformed(evt);
            }
        });

        btnDeleteEditora.setText("X");
        btnDeleteEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEditoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnCadastrarLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbxEditora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomeLivro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(cbxAutor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAddGenero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddAutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnAddEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEditarGenero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarEditora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeleteGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteAutor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteEditora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddAutor)
                    .addComponent(btnEditarAutor)
                    .addComponent(btnDeleteAutor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddGenero)
                    .addComponent(btnEditarGenero)
                    .addComponent(btnDeleteGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddEditora)
                    .addComponent(btnEditarEditora)
                    .addComponent(btnDeleteEditora))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarLivro)
                    .addComponent(btnApagar)
                    .addComponent(btnCancelar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLivroActionPerformed
       int autorID = Buscar.buscarAutor(autorDAO.listarAutor(), cbxAutor);
       int editoraID = Buscar.buscarEditora(editoraDAO.listarEditora(), cbxEditora);
       int generoID = Buscar.buscarGenero(generoDAO.listarGenero(), cbxGenero);
        Livro livro = new Livro(txtNomeLivro.getText(), generoID, 
                autorID, editoraID);
        LivroDAO livrosDAO = new LivroDAO();
        try {
            livrosDAO.cadastrarLivro(livro);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastroLivros.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnCancelar.doClick();
    }//GEN-LAST:event_btnCadastrarLivroActionPerformed

    
    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAddAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAutorActionPerformed
        CadastroAutor cdAutor = new CadastroAutor();
        cdAutor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddAutorActionPerformed

    private void btnAddGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGeneroActionPerformed
        CadastroGenero x = new CadastroGenero();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddGeneroActionPerformed

    private void btnAddEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEditoraActionPerformed
        CadastroEditora x = new CadastroEditora();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddEditoraActionPerformed

    private void btnEditarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAutorActionPerformed
        EditarAutor  z = new EditarAutor(autorDAO.editarAutor(cbxAutor));
        z.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditarAutorActionPerformed

    private void btnEditarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarGeneroActionPerformed

    private void btnEditarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarEditoraActionPerformed

    private void btnDeleteGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteGeneroActionPerformed

    private void btnDeleteAutor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAutor1ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Você tem certeza"
                + "que deseja deletar: " + cbxAutor.getSelectedItem().toString(), 
                "Confirmação", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            autorDAO.deleteAutor(cbxAutor);
            popularAutor(autorDAO.listarAutor());
        }        
    }//GEN-LAST:event_btnDeleteAutor1ActionPerformed

    private void btnDeleteEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteEditoraActionPerformed

    private void cbxAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAutorActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAutor;
    private javax.swing.JButton btnAddEditora;
    private javax.swing.JButton btnAddGenero;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCadastrarLivro;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeleteAutor1;
    private javax.swing.JButton btnDeleteEditora;
    private javax.swing.JButton btnDeleteGenero;
    private javax.swing.JButton btnEditarAutor;
    private javax.swing.JButton btnEditarEditora;
    private javax.swing.JButton btnEditarGenero;
    private javax.swing.JComboBox<String> cbxAutor;
    private javax.swing.JComboBox<String> cbxEditora;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtNomeLivro;
    // End of variables declaration//GEN-END:variables
}
