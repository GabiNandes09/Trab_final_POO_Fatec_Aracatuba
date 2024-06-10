package trab_catalog_liv;

import ModelDAO.*;
import Models.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public final class FrmMenu extends javax.swing.JFrame {

    LivroDAO livroDAO = new LivroDAO();
    AutorDAO autorDAO = new AutorDAO();
    EditoraDAO editoraDAO = new EditoraDAO();
    GeneroDAO generoDAo = new GeneroDAO();

    public FrmMenu() {
        initComponents();
        setLocationRelativeTo(null);
        atualizar();
    }

    public void atualizar() {
        atualizarListaLivros(livroDAO.listarLivros());
        atualizarListaAutor(autorDAO.listarAutor());
        atualizarListaEditora(editoraDAO.listarEditora());
        atualizarListaGenero(generoDAo.listarGenero());
    }

    public void atualizarListaGenero(ArrayList<Genero> genero) {
        DefaultTableModel model = (DefaultTableModel) tableGenero.getModel();
        model.setRowCount(0);
        for (Genero x : genero) {
            model.addRow(new Object[]{x.getGenero_id(), x.getGenero_nome(), GeneroDAO.contarGenero(x)});
        }
    }

    public void atualizarListaEditora(ArrayList<Editora> editora) {
        DefaultTableModel model = (DefaultTableModel) tableEditora.getModel();
        model.setRowCount(0);
        for (Editora x : editora) {
            model.addRow(new Object[]{x.getEditora_id(), x.getEditora_nome(), EditoraDAO.contarEditora(x)});
        }
    }

    public void atualizarListaAutor(ArrayList<Autor> autor) {
        DefaultTableModel model = (DefaultTableModel) tableAutor.getModel();
        model.setRowCount(0);
        for (Autor x : autor) {
            model.addRow(new Object[]{x.getAutor_id(), x.getAutor_nome(), AutorDAO.contarAutor(x)});
        }
    }

    public void atualizarListaLivros(ArrayList<Livro> livro) {
        DefaultTableModel model = (DefaultTableModel) tableLivros.getModel();
        model.setRowCount(0);
        for (Livro x : livro) {
            String[] resposta = livroDAO.pegarInfoLivros(x);
            model.addRow(new Object[]{x.getLivro_id(), x.getLivro_nome(), resposta[0], resposta[2], resposta[1]});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLivros = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAutor = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableEditora = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableGenero = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnCadLivros3 = new javax.swing.JButton();
        btnCadLivros1 = new javax.swing.JButton();
        btnCadLivros = new javax.swing.JButton();
        btnCadLivros2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnEditarGenero = new javax.swing.JButton();
        btnEditarAutor = new javax.swing.JButton();
        btnEditarLivros = new javax.swing.JButton();
        btnEditarEditora = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnExcluirGenero = new javax.swing.JButton();
        btnExcluirAutor = new javax.swing.JButton();
        btnExcluirLivros = new javax.swing.JButton();
        btnExcluirEditora = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tableLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Autor", "Gênero", "Editora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableLivros.setRowHeight(30);
        jScrollPane1.setViewportView(tableLivros);

        jTabbedPane1.addTab("LIVROS", jScrollPane1);

        tableAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOME", "QTD. LIVROS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableAutor);

        jTabbedPane1.addTab("AUTORES", jScrollPane2);

        tableEditora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOME", "QTD. LIVROS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableEditora);

        jTabbedPane1.addTab("EDITORAS", jScrollPane3);

        tableGenero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOME", "QTD. LIVROS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableGenero);

        jTabbedPane1.addTab("GÊNERO", jScrollPane4);

        btnCadLivros3.setText("CADASTRAR GÊNERO");
        btnCadLivros3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadLivros3ActionPerformed(evt);
            }
        });

        btnCadLivros1.setText("CADASTRAR AUTOR");
        btnCadLivros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadLivros1ActionPerformed(evt);
            }
        });

        btnCadLivros.setText("CADASTRAR LIVROS");
        btnCadLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadLivrosActionPerformed(evt);
            }
        });

        btnCadLivros2.setText("CADASTRAR EDITORA");
        btnCadLivros2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadLivros2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadLivros2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadLivros3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadLivros1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadLivros)
                    .addComponent(btnCadLivros1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadLivros2)
                    .addComponent(btnCadLivros3))
                .addContainerGap())
        );

        jTabbedPane2.addTab("CADASTROS", jPanel1);

        btnEditarGenero.setText("EDITAR GÊNERO");
        btnEditarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarGeneroActionPerformed(evt);
            }
        });

        btnEditarAutor.setText("EDITAR AUTOR");
        btnEditarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAutorActionPerformed(evt);
            }
        });

        btnEditarLivros.setText("EDITAR LIVROS");
        btnEditarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLivrosActionPerformed(evt);
            }
        });

        btnEditarEditora.setText("EDITAR EDITORA");
        btnEditarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEditoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEditarEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEditarLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarLivros)
                    .addComponent(btnEditarAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarEditora)
                    .addComponent(btnEditarGenero))
                .addContainerGap())
        );

        jTabbedPane2.addTab("EDITAR", jPanel2);

        btnExcluirGenero.setText("EXCLUIR GÊNERO");
        btnExcluirGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirGeneroActionPerformed(evt);
            }
        });

        btnExcluirAutor.setText("EXCLUIR AUTOR");
        btnExcluirAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAutorActionPerformed(evt);
            }
        });

        btnExcluirLivros.setText("EXCLUIR LIVROS");
        btnExcluirLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLivrosActionPerformed(evt);
            }
        });

        btnExcluirEditora.setText("EXCLUIR EDITORA");
        btnExcluirEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEditoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnExcluirEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnExcluirLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirLivros)
                    .addComponent(btnExcluirAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirEditora)
                    .addComponent(btnExcluirGenero))
                .addContainerGap())
        );

        jTabbedPane2.addTab("EXCLUIR", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadLivrosActionPerformed
        CadastroLivros cadastroLivro = new CadastroLivros();
        cadastroLivro.setVisible(true);
        cadastroLivro.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                atualizar();
            }
        });
        this.dispose();
    }//GEN-LAST:event_btnCadLivrosActionPerformed

    private void btnCadLivros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadLivros1ActionPerformed
        CadastroAutor x = new CadastroAutor();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadLivros1ActionPerformed

    private void btnCadLivros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadLivros2ActionPerformed
        CadastroEditora x = new CadastroEditora();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadLivros2ActionPerformed

    private void btnCadLivros3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadLivros3ActionPerformed
        CadastroGenero x = new CadastroGenero();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadLivros3ActionPerformed

    private void btnEditarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarGeneroActionPerformed

    private void btnEditarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAutorActionPerformed
        
    }//GEN-LAST:event_btnEditarAutorActionPerformed

    private void btnEditarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLivrosActionPerformed
       
    }//GEN-LAST:event_btnEditarLivrosActionPerformed

    private void btnEditarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarEditoraActionPerformed

    private void btnExcluirGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirGeneroActionPerformed

    private void btnExcluirAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirAutorActionPerformed

    private void btnExcluirLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLivrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirLivrosActionPerformed

    private void btnExcluirEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirEditoraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadLivros;
    private javax.swing.JButton btnCadLivros1;
    private javax.swing.JButton btnCadLivros2;
    private javax.swing.JButton btnCadLivros3;
    private javax.swing.JButton btnEditarAutor;
    private javax.swing.JButton btnEditarEditora;
    private javax.swing.JButton btnEditarGenero;
    private javax.swing.JButton btnEditarLivros;
    private javax.swing.JButton btnExcluirAutor;
    private javax.swing.JButton btnExcluirEditora;
    private javax.swing.JButton btnExcluirGenero;
    private javax.swing.JButton btnExcluirLivros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tableAutor;
    private javax.swing.JTable tableEditora;
    private javax.swing.JTable tableGenero;
    private javax.swing.JTable tableLivros;
    // End of variables declaration//GEN-END:variables
}
