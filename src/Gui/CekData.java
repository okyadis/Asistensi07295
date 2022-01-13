package Gui;

import Entity.PendudukEntity07295;
import Model07295.PendudukModel07295;
import Controller.PendudukController;
import static helper.KoneksiDb07295.rs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class CekData {
    Scanner input = new Scanner(System.in);
    JFrame CekData = new JFrame();
    JLabel title,niklabel;
    JTextField niktext;
    JButton cekdata, back;

    private PendudukController gudang = new PendudukController();
    private PendudukModel07295 model = new PendudukModel07295();
    public String id;

    public CekData (){
        try {
            CekData.setSize(600,600);
            CekData.setLayout(null);
            CekData.getContentPane().setBackground(Color.white);

            title = new JLabel("Cek Data Penduduk");
            title.setBounds(100,30,450,100);
            title.setFont(new Font("Times New Roman", Font.BOLD, 40));
            CekData.add(title);

            niklabel = new JLabel("NIK yang dicari");
            niklabel.setBounds(50,130,300,30);
            CekData.add(niklabel);

            niktext = new JTextField();
            niktext.setBounds(50,160,300,30);
            CekData.add(niktext);

            back = new JButton("Back");
            back.setBounds(50,440,150,40);
            back.setBackground(Color.red);
            back.setForeground(Color.white);
            CekData.add(back);

            cekdata = new JButton("cekdata");
            cekdata.setBounds(250,440,150,40);
            cekdata.setBackground(Color.GREEN);
            CekData.add(cekdata);

            //end
            CekData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            CekData.setVisible(true);
            CekData.setLocationRelativeTo(null);

            back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    CekData.dispose();
                    PilihGui main = new PilihGui();
                    
                }
            });

            cekdata.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    JOptionPane.showMessageDialog(CekData, "Data Ditemukan Dengan Nama : "+gudang.datagui(niktext.getText()));


                    CekData.dispose();
                    LihatGui LihatGui = new LihatGui();
                }
            });
        }catch (Exception exception){
            JOptionPane.showMessageDialog(CekData, "Wrong");
        }

    }
//
    void kosong(){
        niktext.setText(null);
    }
}