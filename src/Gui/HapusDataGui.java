package Gui;
import Controller.AdminController;
import Controller.PendudukController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class HapusDataGui {
    JFrame del = new JFrame();
    JLabel title, idlabel;
    JButton delBtn, back;
    JTextField idtext;

    public HapusDataGui(){
        del.setSize(400,400);
        del.setTitle("Hapus Data Penduduk");
        del.setLayout(null);
        del.getContentPane().setBackground(Color.white);

        title = new JLabel("Hapus Data Sepatu");
        title.setBounds(30,30,350,50);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        del.add(title);

        idlabel = new JLabel("Masukkan Id");
        idlabel.setBounds(30,100,150,30);
        idlabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        del.add(idlabel);

        idtext = new JTextField();
        idtext.setBounds(30,150,200,30);
        del.add(idtext);

        delBtn = new JButton("Delete");
        delBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
        delBtn.setBounds(30,200,150,30);
        delBtn.setBackground(Color.red);
        delBtn.setForeground(Color.white);
        del.add(delBtn);

        back = new JButton("Back");
        back.setBounds(30,300,150,40);
        back.setFont(new Font("Times New Roman", Font.BOLD, 20));
        back.setBackground(Color.red);
        back.setForeground(Color.white);
        del.add(back);

        //end
        del.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        del.setVisible(true);
        del.setLocationRelativeTo(null);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                del.dispose();
                PilihGui main = new PilihGui();
                
            }
        });

        delBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Scanner input = new Scanner (System.in);
                    AdminController gudang = new AdminController();
                    int id = Integer.parseInt(idtext.getText());
                    gudang.deleteData(id);
                    JOptionPane.showMessageDialog(del,"Data Telah Dihapus");
                }catch (Exception exception ){
                    JOptionPane.showMessageDialog(del,"Data Salah");
                    del.dispose();
                    LihatGui LihatGui = new LihatGui();
                }
            }
        });



    }
}
