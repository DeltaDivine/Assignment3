/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Register extends JFrame{
    
    private JLabel lblId;
    private JLabel lblName;
    private JLabel lblPassword;
    private JLabel lblEmail;
    
    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtEmail;
    private JPasswordField txtPassword;
    
    private JButton btnSubmit;
    private JButton btnReset;

    public Register(){
        setTitle("Register Form");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        this.lblId = new JLabel();
        this.lblId.setText("Id");
        this.lblId.setBounds(20, 20, 80, 30);
        this.lblName = new JLabel();
        this.lblName.setText("Name");
        this.lblName.setBounds(20, 55, 80, 30);
        this.lblPassword = new JLabel();
        this.lblPassword.setText("Password");
        this.lblPassword.setBounds(20, 90, 80, 30);
        this.lblEmail = new JLabel();
        this.lblEmail.setText("Email");
        this.lblEmail.setBounds(20, 125, 80, 30);
        
        this.txtId = new JTextField();  
        this.txtId.setBounds(110, 20, 140, 30);
        this.txtName = new JTextField();  
        this.txtName.setBounds(110, 55, 140, 30);
        this.txtPassword = new JPasswordField();  
        this.txtPassword.setBounds(110, 90, 140, 30);
        this.txtEmail = new JTextField();  
        this.txtEmail.setBounds(110, 125, 140, 30);
        
        this.btnSubmit = new JButton();
        this.btnSubmit.setText("Submit");
        this.btnSubmit.setBounds(110, 160, 60, 30);
        
//        this.btnSubmit.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                changeForm(ae);
//            }
//        });
        
        this.btnReset = new JButton();
        this.btnReset.setText("Reset");
        this.btnReset.setBounds(180, 160, 60, 30);
        
        add(this.lblId);
        add(this.lblName);
        add(this.lblPassword);
        add(this.lblEmail);
        add(this.txtId);
        add(this.txtName);
        add(this.txtPassword);
        add(this.txtEmail);
        add(this.btnSubmit);
        add(this.btnReset);
        setLayout(null);        
    }
    
//    public void changeForm(ActionEvent ae){
//        this.dispose();
//        UserList userList = new UserList();
//        userList.setVisible(true);
//    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblName() {
        return lblName;
    }

    public void setLblName(JLabel lblName) {
        this.lblName = lblName;
    }

    public JLabel getLblPassword() {
        return lblPassword;
    }

    public void setLblPassword(JLabel lblPassword) {
        this.lblPassword = lblPassword;
    }

    public JLabel getLblEmail() {
        return lblEmail;
    }

    public void setLblEmail(JLabel lblEmail) {
        this.lblEmail = lblEmail;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public void setTxtName(JTextField txtName) {
        this.txtName = txtName;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JPasswordField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JButton getBtnSubmit() {
        return btnSubmit;
    }

    public void setBtnSubmit(JButton btnSubmit) {
        this.btnSubmit = btnSubmit;
    }

    public JButton getBtnReset() {
        return btnReset;
    }

    public void setBtnReset(JButton btnReset) {
        this.btnReset = btnReset;
    }
}
