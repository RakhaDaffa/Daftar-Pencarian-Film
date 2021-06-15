// NAMA	: Rakha Daffa Pratama
// NIM	: H1051201092

package packagetest;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class PencarianFilm extends javax.swing.JFrame {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		ArrayList<Film> listfilm;
		String header[] = new String[]{"Judul Film", "Harga Film","Genre Film"};
		DefaultTableModel dtm;
		int row,col;
    
    public PencarianFilm() {
    	getContentPane().setBackground(new Color(102, 102, 255));
        initComponents();
        listfilm = new ArrayList<>();
        dtm = new DefaultTableModel(header,0);
        jTable.setModel(dtm);
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(Color.DARK_GRAY);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jLabel1.setForeground(Color.WHITE);
        jTextJudulFilm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jLabel2.setForeground(Color.WHITE);
        jTextHargaFilm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jLabel3.setForeground(Color.WHITE);
        jCBGenre = new javax.swing.JComboBox<>();
        jCBGenre.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jScrollPanel3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daftar Pencarian Film");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Judul Film");

        jLabel2.setText("Harga Film");

        jLabel3.setText("Genre Film");

        jCBGenre.setModel(new DefaultComboBoxModel<String>(new String[] { "Action", "Comedy", "Drama", "Horror", "Romance", "Crime", "Adventure", "Animation", "Fantasy", "Mystery", "Sci-Fi", "Thriller" }));
        jCBGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
        jButton1 = new javax.swing.JButton();
        
                jButton1.setText("Tambah Film");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });
        jButton2 = new javax.swing.JButton();
        
                jButton2.setText("Hapus Film");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                    }
                });
        jButton3 = new javax.swing.JButton();
                
                jButton3.setText("Ubah Film");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                    }
                });
        jButton4 = new javax.swing.JButton();
        
                jButton4.setText("Cari Film");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton4ActionPerformed(evt);
                    }
                });
        
        JLabel JLabel4 = new JLabel("DAFTAR PENCARIAN FILM");
        JLabel4.setForeground(new Color(255, 215, 0));
        JLabel4.setFont(new Font("Noto Serif", Font.BOLD, 28));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(168)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
        			.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
        			.addGap(187))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel3)
        				.addComponent(jLabel2)
        				.addComponent(jLabel1))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextHargaFilm, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jCBGenre, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
        							.addGap(42))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jButton2)
        							.addGap(68))))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jTextJudulFilm, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(207, Short.MAX_VALUE)
        			.addComponent(JLabel4)
        			.addGap(196))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(JLabel4, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextJudulFilm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTextHargaFilm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2))
        					.addGap(21)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jCBGenre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel3))
        					.addGap(18))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jButton3)
        					.addGap(18)
        					.addComponent(jButton2)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton4)
        				.addComponent(jButton1))
        			.addGap(19))
        );
        jPanel1.setLayout(jPanel1Layout);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
               
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPanel3.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jScrollPanel3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(19, Short.MAX_VALUE)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jScrollPanel3, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String namafilm = jTextJudulFilm.getText();
        int hargafilm = (int) Double.parseDouble(jTextHargaFilm.getText());
        String genrefilm = jCBGenre.getSelectedItem().toString();
        listfilm.add(new Film(namafilm,genrefilm,hargafilm));
        dtm.setRowCount(0);
        for (int i = 0; i < listfilm.size(); i++) {
            Object[] objs = {listfilm.get(i).namafilm,listfilm.get(i).hargafilm,listfilm.get(i).genrefilm};
            dtm.addRow(objs);
        }
  
        clearField();
    }

    private void clearField(){
        jTextJudulFilm.requestFocus();
        jTextJudulFilm.setText("");
        jTextHargaFilm.setText("");
        jCBGenre.setSelectedIndex(0);
    }
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {
        row = jTable.getSelectedRow();
        col = jTable.getColumnCount();
        System.out.println(row+","+col);
        jTextJudulFilm.setText(dtm.getValueAt(row, 0).toString());
        jTextHargaFilm.setText(dtm.getValueAt(row, 1).toString());
        String genre = dtm.getValueAt(row, 2).toString();
        for (int i = 0; i<(jCBGenre.getItemCount());i++){
            if (jCBGenre.getItemAt(i).equalsIgnoreCase(genre)){
                jCBGenre.setSelectedIndex(i);
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {  
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "HAPUS DATA FILM INI", "HAPUS", dialogButton);
        if(dialogResult == 0) {
            dtm.removeRow(row);
            listfilm.remove(row);
            dtm.setRowCount(0);
            for (int i = 0; i < listfilm.size(); i++) {
                Object[] objs = {listfilm.get(i).namafilm,listfilm.get(i).hargafilm,listfilm.get(i).genrefilm};
                dtm.addRow(objs);
            }
            clearField();
        } else {
            
        }   
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {       
        String updatednamafilm = jTextJudulFilm.getText();
        double updatedhargafilm = Double.parseDouble(jTextHargaFilm.getText());
        String updatedgenrefilm = jCBGenre.getSelectedItem().toString();
        listfilm.get(row).namafilm = updatednamafilm;
        listfilm.get(row).hargafilm = (int) updatedhargafilm;
        listfilm.get(row).genrefilm = updatedgenrefilm;
        dtm.setRowCount(0);
        for (int i = 0; i < listfilm.size(); i++) {
            Object[] objs = {listfilm.get(i).namafilm,listfilm.get(i).hargafilm,listfilm.get(i).genrefilm};
            dtm.addRow(objs);
        }
    }
// Bisa mencari film dengan mengunakan Judul Film dengan cara,
// mengganti "genrefilm" menjadi "namafilm" dibagian "if (listfilm.get(i).genrefilm.equalsIgnoreCase(input)){"
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // 
        String input = JOptionPane.showInputDialog(this,"CARI FILM (dengan memasukkan Genre Film) :");
        for (int i = 0; i < listfilm.size(); i++) {
            if (listfilm.get(i).genrefilm.equalsIgnoreCase(input)){
                JOptionPane.showMessageDialog(jButton4, "Film Ditemukan, klik OK untuk menampilkan hasilnya","CARI FILM",2);
                jTextJudulFilm.setText(listfilm.get(i).namafilm);
                jTextHargaFilm.setText(String.valueOf(listfilm.get(i).hargafilm));
                String genre = listfilm.get(i).genrefilm;
                 for (int j = 0; j<(jCBGenre.getItemCount());j++){
                    if (jCBGenre.getItemAt(i).equalsIgnoreCase(genre)){
                        jCBGenre.setSelectedIndex(i);
                   }
                }
                 return;
            }
        }
        JOptionPane.showMessageDialog(jButton4, "Film Tidak Ditemukan","CARI FILM",2);

    }

    /**
     *
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PencarianFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PencarianFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PencarianFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PencarianFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PencarianFilm().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCBGenre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPanel3;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextJudulFilm;
    private javax.swing.JTextField jTextHargaFilm;
}