
package Gui;
import Controller.AdminController;
import Controller.AllObjectModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegistrasiAdminGui extends ComponentGui07295 {
    AdminController admin= new AdminController();
    public RegistrasiAdminGui(){
        initComponent();
    }
    void initComponent(){
        setTitle("Register Akun");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        labelregister.setBounds(120, 50, 70, 25);
        add(labelregister);
        
        labelnip.setBounds(35, 95, 40, 25);
        add(labelnip);
        fieldnip.setBounds(130, 95, 130, 25);
        add(fieldnip);
        
        labelnama.setBounds(35, 140, 80, 25);
        add(labelnama);
        fieldnama.setBounds(130, 140, 130, 25);
        add(fieldnama);
        
        labelalamat.setBounds(35, 185, 80, 25);
        add(labelalamat);
        fieldalamat.setBounds(130, 185, 130, 25);
        add(fieldalamat);
        
        labelpassword.setBounds(35, 230, 80, 25);
        add(labelpassword);
        fieldpassword.setBounds(130, 230, 130, 25);
        add(fieldpassword);
        
        labelnotelp.setBounds(35, 275, 80, 25);
        add(labelnotelp);
        fieldnotelp.setBounds(130, 275, 130, 25);
        add(fieldnotelp);
        
        btnregister.setBounds(80, 320, 140, 25);
        btnregister.setBorder(null);
        btnregister.setBackground(Color.black);
        btnregister.setForeground(Color.white);
        btnregister.setFocusPainted(false);
        add(btnregister);
        
        btnregister.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnregister.setForeground(Color.black);
                btnregister.setBackground(Color.green);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btnregister.setForeground(Color.white);
                btnregister.setBackground(Color.black);
            }
        });
        
        btnregister.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nip = fieldnip.getText();
                String nama = fieldnama.getText();
                String alamat = fieldalamat.getText();
                String password = fieldpassword.getText();
                String noTelp = fieldnotelp.getText();
                if(nip.length() != 0 && nama.length() != 0 && alamat.length() != 0 && password.length() != 0 && noTelp.length() != 0){
                    admin.insertData(nip,nama, alamat, password, noTelp);
                    JOptionPane.showMessageDialog(null, "Silahkan Login Kembali");
                    dispose();
                    new LoginRegistrasiGui().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                    kosong();
                }
            }
        });
    }}