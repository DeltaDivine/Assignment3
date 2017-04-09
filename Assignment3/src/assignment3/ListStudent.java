/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.DAO;

/**
 *
 * @author User
 */
public class ListStudent extends JFrame {

    private JButton add;
    private JTable table;
    private DefaultTableModel tblModel;
    private JScrollPane scrollPane;

    public ListStudent() {

        setTitle("Student List");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.add = new JButton();
        this.add.setBounds(600, 400, 70, 50);
        this.add.setText("Add");

        this.table = new JTable();
        this.tblModel = new DefaultTableModel();
        this.tblModel.addColumn("Student ID");
        this.tblModel.addColumn("Full name");
        this.tblModel.addColumn("Password");

        try {
            Connection conn = DAO.connectNow();
            Statement stt = conn.createStatement();
            ResultSet rs = stt.executeQuery("select * from students");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                Object[] values = {id, name, password};
                this.tblModel.addRow(values);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Can not receive data.");
        }

        this.table.setModel(this.tblModel);

        this.scrollPane = new JScrollPane(this.table);

        this.scrollPane.setBounds(20, 20, 600, 200);
        add(this.scrollPane);
        add(add);
        setLayout(null);
    }

    private void addActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        Register rg = new Register();
        rg.setVisible(true);
    }
}
