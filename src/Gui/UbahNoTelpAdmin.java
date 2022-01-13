package Gui;


import Controller.AdminController;
import Controller.PendudukController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class UbahNoTelpAdmin {
    Scanner input = new Scanner(System.in);
    JFrame UbahDosisGui = new JFrame();
    JLabel title,idlabel, notelplabel;
    JTextField idtext,notelptext;
    JButton update, back;

    private AdminController gudang = new AdminController();
    public String id;

    public UbahNoTelpAdmin (){
        try {
            UbahDosisGui.setSize(600,600);
            UbahDosisGui.setLayout(null);
            UbahDosisGui.getContentPane().setBackground(Color.white);

            title = new JLabel("Update No Telp Admin");
            title.setBounds(100,30,450,100);
            title.setFont(new Font("Times New Roman", Font.BOLD, 40));
            UbahDosisGui.add(title);

            idlabel = new JLabel("Id yang diubah");
            idlabel.setBounds(50,130,300,30);
            UbahDosisGui.add(idlabel);

            idtext = new JTextField();
            idtext.setBounds(50,160,300,30);
            UbahDosisGui.add(idtext);

            notelplabel = new JLabel("No telp baru");
            notelplabel.setBounds(50,200,300,30);
            UbahDosisGui.add(notelplabel);

            notelptext = new JTextField();
            notelptext.setBounds(50,230,300,30);
            UbahDosisGui.add(notelptext);

            back = new JButton("Back");
            back.setBounds(50,440,150,40);
            back.setBackground(Color.red);
            back.setForeground(Color.white);
            UbahDosisGui.add(back);

            update = new JButton("Update");
            update.setBounds(250,440,150,40);
            update.setBackground(Color.GREEN);
            UbahDosisGui.add(update);

            //end
            UbahDosisGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            UbahDosisGui.setVisible(true);
            UbahDosisGui.setLocationRelativeTo(null);

            back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    UbahDosisGui.dispose();
                    PilihGui main = new PilihGui();
                    
                }
            });

            update.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int id = Integer.parseInt(idtext.getText());
                    gudang.updatenoTelp(notelptext.getText(), id);
                    kosong();

                    UbahDosisGui.dispose();
                    LihatGui LihatGui = new LihatGui();
                }
            });
        }catch (Exception exception){
            JOptionPane.showMessageDialog(UbahDosisGui, "Wrong");
        }

    }
//
    void kosong(){
        idtext.setText(null);
        notelptext.setText(null);
    }
}