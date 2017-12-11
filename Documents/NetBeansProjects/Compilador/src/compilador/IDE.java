/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


 class MyAlteracoes implements DocumentListener{
     public boolean aterado = false;
    @Override
    public void insertUpdate(DocumentEvent e) {
         this.aterado = true;
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
         this.aterado = true;
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        this.aterado = true;
    }

    public boolean isAterado() {
        return aterado;
    }
        
 }
 class MyCustomFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".jp");
        }
        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Text documents (*.jp)";
        }
    } 
/**
 *
 * @author LuciaEmilia
 */
public class IDE extends javax.swing.JFrame {
    public boolean aberto = false;
    public File endereco;
    /**
     * Creates new form IDE
     */
    public IDE() {
        initComponents();
        NumeredBorder borda = new NumeredBorder();
        entrada.setBorder(borda);        
        entrada.getDocument().addDocumentListener(new MyAlteracoes());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        entrada = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        saida = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Abrir = new javax.swing.JMenu();
        SalvarComo = new javax.swing.JMenu();
        Sair = new javax.swing.JMenu();

        fileChooser.setDialogTitle("Caixa de Diálogo Aberta");
        fileChooser.setFileFilter(new MyCustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        entrada.setColumns(20);
        entrada.setRows(5);
        jScrollPane1.setViewportView(entrada);

        jButton1.setText("Compilar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        saida.setEditable(false);
        saida.setColumns(20);
        saida.setRows(5);
        jScrollPane2.setViewportView(saida);

        Menu.setText("File");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        Abrir.setText("Abrir");
        Abrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbrirMouseClicked(evt);
            }
        });
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        Menu.add(Abrir);

        SalvarComo.setText("Salvar");
        SalvarComo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalvarComoMouseClicked(evt);
            }
        });
        Menu.add(SalvarComo);

        Sair.setText("Sair");
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
        });
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Menu.add(Sair);

        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String codigo = entrada.getText();
        Compilador compilador = new Compilador();
        try {
            saida.setText(compilador.Compilador(codigo));
        } catch (IOException ex) {
            Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        if (entrada.getDocument().getLength() == 0){
            System.out.println("Nao foi alterado");
        }
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MenuActionPerformed

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_AbrirActionPerformed

    private void AbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbrirMouseClicked
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
              // What to do with the file, e.g. display it in a TextArea
              entrada.read( new FileReader( file.getAbsolutePath() ), null );
              this.aberto = true;
              this.endereco = fileChooser.getSelectedFile();
            } catch (IOException ex) {
              System.out.println("problem accessing file"+file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_AbrirMouseClicked

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        // TODO add your handling code here:
        if (entrada.getDocument().getLength() == 0){
            System.exit(0);
        }
        else {
            if(aberto){
                int selecionaOpcao = JOptionPane.showConfirmDialog(null,
                   " Deseja salvar alteracoes? ", null,
                    JOptionPane.OK_CANCEL_OPTION);
                if (selecionaOpcao == JOptionPane.OK_OPTION) {
                    FileWriter filewriter;
                    try {
                        filewriter = new FileWriter(endereco + ".jp");
                        PrintWriter pw = new PrintWriter(filewriter);
                        pw.println(entrada.getText());
                        pw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
                    }                            
                }
                else System.exit(0);
                System.exit(0);
            }
            else{
                int selecionaOpcao = JOptionPane.showConfirmDialog(null,
                   " Deseja salvar antes de sair? ", null,
                    JOptionPane.OK_CANCEL_OPTION);
                if (selecionaOpcao == JOptionPane.OK_OPTION) {
                    int resultado = fileChooser.showOpenDialog(this);
                    FileFilter filefilter = new FileNameExtensionFilter("Arquivo jp",".jp");

                    if (resultado == JFileChooser.APPROVE_OPTION) {
                        File arquivo = fileChooser.getSelectedFile();
                        if (arquivo.exists() == true) {
                                int selecionaOpcao1 = JOptionPane.showConfirmDialog(null,
                                                " O arquivo já existe, deseja sobrescreve-lo? ", null,
                                                JOptionPane.OK_CANCEL_OPTION);
                                if (selecionaOpcao1 == JOptionPane.OK_OPTION) {
                                        FileWriter filewriter;
                                    try {
                                        filewriter = new FileWriter(fileChooser.getSelectedFile() + ".jp");
                                        PrintWriter pw = new PrintWriter(filewriter);
                                        pw.println(entrada.getText());
                                        pw.close();
                                    } catch (IOException ex) {
                                        Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                        } else {
                                FileWriter filewriter;
                            try {
                                filewriter = new FileWriter(fileChooser.getSelectedFile() + ".jp");
                                PrintWriter pw = new PrintWriter(filewriter);
                                pw.println(entrada.getText());
                                pw.close();
                            } catch (IOException ex) {
                                Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
                else System.exit(0);
                System.exit(0);
            }
            
        }
    }//GEN-LAST:event_SairMouseClicked

    private void SalvarComoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalvarComoMouseClicked
        // TODO add your handling code here:
        
        
        int resultado = fileChooser.showOpenDialog(this);
        FileFilter filefilter = new FileNameExtensionFilter("Arquivo jp",".jp");
        
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File arquivo = fileChooser.getSelectedFile();
            if (arquivo.exists() == true) {
                    int selecionaOpcao = JOptionPane.showConfirmDialog(null,
                                    " O arquivo já existe, deseja sobrescreve-lo? ", null,
                                    JOptionPane.OK_CANCEL_OPTION);
                    if (selecionaOpcao == JOptionPane.OK_OPTION) {
                            FileWriter filewriter;
                        try {
                            filewriter = new FileWriter(fileChooser.getSelectedFile() + ".jp");
                            PrintWriter pw = new PrintWriter(filewriter);
                            pw.println(entrada.getText());
                            pw.close();
                        } catch (IOException ex) {
                            Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                    }
            } else {
                    FileWriter filewriter;
                try {
                    filewriter = new FileWriter(fileChooser.getSelectedFile() + ".jp");
                    PrintWriter pw = new PrintWriter(filewriter);
                    pw.println(entrada.getText());
                    pw.close();
                } catch (IOException ex) {
                    Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
            }
        }        
    }//GEN-LAST:event_SalvarComoMouseClicked

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
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDE().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Abrir;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenu Sair;
    private javax.swing.JMenu SalvarComo;
    private javax.swing.JTextArea entrada;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea saida;
    // End of variables declaration//GEN-END:variables
}
