/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting.management;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class Startelection extends javax.swing.JFrame {
// JDBC URL, username, and password for PostgreSQL database


    public Startelection() throws SQLException {
        initComponents();
        loadTeacherData();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Election");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voting/management/ic_fingerprint_white_24dp.png"))); // NOI18N

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voting/management/back.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 57, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 510));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher Id", "Teacher Name", "Faculty", "Vote"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 450, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        vote a=new vote();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // 加载教师数据
private void loadTeacherData() throws SQLException {
        try{ 
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123");
            Statement stmt = con.createStatement(); 

            String query = "SELECT teacher_id, teacher_name, faculty FROM teacherlist";
            ResultSet rs = stmt.executeQuery(query);

            // Create the table's default model
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            // Clear existing rows
            model.setRowCount(0);

            // Add rows from the result set to the table model
            while (rs.next()) {
                Object[] rowData = {
                    rs.getString("teacher_id"),
                    rs.getString("teacher_name"),
                    rs.getString("faculty"),
                    "Vote" // Vote button label
                };

                model.addRow(rowData);
            }

            // Add button renderer and editor for the "Vote" column
            TableColumn voteColumn = jTable1.getColumnModel().getColumn(3);
            voteColumn.setCellRenderer(new ButtonRenderer());
            voteColumn.setCellEditor(new ButtonEditor(new JCheckBox()));

        } catch (SQLException e) {
            // Display error message for loading teacher data
            JOptionPane.showMessageDialog(this, "Error loading teacher data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText("Vote");
            return this;
        }
    }

    private class ButtonEditor extends DefaultCellEditor {
        private JButton button;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton("Vote");
            button.setOpaque(true);

            // Add action listener for button click
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Get the current row index
                    int row = jTable1.getSelectedRow();

                    // Handle vote button click
                    onVoteButtonClicked(row);

                    // Notify editor that the operation is complete
                    fireEditingStopped();
                }
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            button.setText("Vote");
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            return "Vote";
        }
    }

private void onVoteButtonClicked(int row) {
    // Get teacher information from the selected row in the table
    String teacherIdStr = (String) jTable1.getValueAt(row, 0);
    String teacherName = (String) jTable1.getValueAt(row, 1);
    String faculty = (String) jTable1.getValueAt(row, 2);

    // Check if teacher_id is null or empty
    if (teacherIdStr == null || teacherIdStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Teacher ID is empty or null!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Parse teacher_id from string to integer
    int teacherId;
    try {
        teacherId = Integer.parseInt(teacherIdStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid Teacher ID format: " + teacherIdStr, "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123");
        // Check if there exists the same combination of teacher_id, teacher_name, and faculty in the result5 table
        String checkQuery = "SELECT count FROM result5 WHERE teacher_id = ? AND teacher_name = ? AND faculty = ?";
        try (PreparedStatement checkStmt = con.prepareStatement(checkQuery)) {
            checkStmt.setInt(1, teacherId);
            checkStmt.setString(2, teacherName);
            checkStmt.setString(3, faculty);
            ResultSet checkRs = checkStmt.executeQuery();

            if (checkRs.next()) {
                // If the same combination of teacher_id, teacher_name, and faculty exists in the result5 table, update count
                int currentCount = checkRs.getInt("count");
                int newCount = currentCount + 1;

                // Update count
                String updateQuery = "UPDATE result5 SET count = ? WHERE teacher_id = ? AND teacher_name = ? AND faculty = ?";
                try (PreparedStatement updateStmt = con.prepareStatement(updateQuery)) {
                    updateStmt.setInt(1, newCount);
                    updateStmt.setInt(2, teacherId);
                    updateStmt.setString(3, teacherName);
                    updateStmt.setString(4, faculty);
                    updateStmt.executeUpdate();
                }
            } else {
                // If the same combination of teacher_id, teacher_name, and faculty does not exist in the result5 table, insert a new record
                String insertQuery = "INSERT INTO result5 (teacher_id, teacher_name, faculty, count) VALUES (?, ?, ?, ?)";
                try (PreparedStatement insertStmt = con.prepareStatement(insertQuery)) {
                    insertStmt.setInt(1, teacherId);
                    insertStmt.setString(2, teacherName);
                    insertStmt.setString(3, faculty);
                    insertStmt.setInt(4, 1);
                    insertStmt.executeUpdate();
                }
            }

            // Close the result set
            checkRs.close();
        }

        // Display success message
        JOptionPane.showMessageDialog(this, "Vote recorded successfully!");

    } catch (SQLException ex) {
        if (ex.getMessage().contains("duplicate key value violates unique constraint")) {
            // Handle duplicate key error
            JOptionPane.showMessageDialog(this, "Error: This teacher's vote has already been recorded.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Logger.getLogger(Startelection.class.getName()).log(Level.SEVERE, "Database error", ex);
            // Display error message for handling vote
            JOptionPane.showMessageDialog(this, "Error handling vote: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Startelection().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Startelection.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
