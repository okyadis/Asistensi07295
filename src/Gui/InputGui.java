
package Gui;
import Controller.PendudukController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InputGui extends ComponentGui07295 {
    PendudukController penduduk = new PendudukController();

    public InputGui(){
        InputGui();
    }
    
    void InputGui(){
        setTitle("Tambah Data");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 550);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        labelregister.setBounds(120, 50, 70, 25);
        add(labelregister);
        
        labelnik.setBounds(35, 95, 40, 25);
        add(labelnik);
        fieldnik.setBounds(130, 95, 130, 25);
        add(fieldnik);
        
        labelnama.setBounds(35, 140, 80, 25);
        add(labelnama);
        fieldnama.setBounds(130, 140, 130, 25);
        add(fieldnama);
        
        labelalamat.setBounds(35, 185, 80, 25);
        add(labelalamat);
        fieldalamat.setBounds(130, 185, 130, 25);
        add(fieldalamat);
        
        labelnotelp.setBounds(35, 230, 80, 25);
        add(labelnotelp);
        fieldnotelp.setBounds(130, 230, 130, 25);
        add(fieldnotelp);
        
        labeldosis.setBounds(35, 275, 80, 25);
        add(labeldosis);
        fielddosis.setBounds(130, 275, 130, 25);
        add(fielddosis);
        
        labeljns_vaksin.setBounds(35, 320, 80, 25);
        add(labeljns_vaksin);
        fieldjns_vaksin.setBounds(130, 320, 130, 25);
        add(fieldjns_vaksin);
        
        btnregister.setBounds(80, 400, 140, 25);
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
                String nik = fieldnik.getText();
                String nama = fieldnama.getText();
                String alamat = fieldalamat.getText();
                String noTelp = fieldnotelp.getText();
                String dosis = fielddosis.getText();
                String jns_vaksin = fieldjns_vaksin.getText();
                if(nik.length() != 0 && nama.length() != 0 && alamat.length() != 0 && noTelp.length() != 0 && dosis.length() != 0 && jns_vaksin.length() != 0 ){
                    penduduk.insertData(nik,nama, alamat, noTelp, dosis,jns_vaksin);
                    JOptionPane.showMessageDialog(null, "Input Data Berhasil");
                    dispose();
                    PilihGui main = new PilihGui();
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                    kosong();
                }
            }
        });
    }}