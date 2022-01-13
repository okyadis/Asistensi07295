package Gui;
package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author okky
 */
public class PilihGui {
    private Scanner input;
    
    public PilihGui(){

        JFrame gui = new JFrame();
        JLabel title;
        JButton input, lihat, updatedosis,updatenotelp, delete,updatepwadmin,updatentadmin,caridata;
        
        gui.setSize(600, 400);
        gui.setLayout(null);
        Color back = new Color(255, 255, 255);
        gui.getContentPane().setBackground(back);

        title = new JLabel("DATA PENDUDUK VAKSINASI");
        title.setBounds(60, 30, 500, 50);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        title.setForeground(Color.black);
        Color label = new Color(169, 255, 226);
        gui.add(title);

        input = new JButton("Input");
        input.setBounds(50, 100, 170, 30);
        input.setFont(new Font("Times New Roman", Font.BOLD, 15));
        input.setHorizontalAlignment(SwingConstants.LEFT);
        input.setBackground(label);
        gui.add(input);

        lihat = new JButton("Lihat");
        lihat.setBounds(50, 150, 170, 30);
        lihat.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lihat.setHorizontalAlignment(SwingConstants.LEFT);
        lihat.setBackground(label);
        gui.add(lihat);

        updatedosis = new JButton("Update Dosis");
        updatedosis.setBounds(50, 200, 170, 30);
        updatedosis.setFont(new Font("Times New Roman", Font.BOLD, 15));
        updatedosis.setHorizontalAlignment(SwingConstants.LEFT);
        updatedosis.setBackground(label);
        gui.add(updatedosis);

        updatenotelp = new JButton("Update NoTelp");
        updatenotelp.setBounds(50, 250, 170, 30);
        updatenotelp.setFont(new Font("Times New Roman", Font.BOLD, 15));
        updatenotelp.setHorizontalAlignment(SwingConstants.LEFT);
        updatenotelp.setBackground(label);
        gui.add(updatenotelp);
        
        delete = new JButton("Hapus Data");
        delete.setBounds(300, 100, 170, 30);
        delete.setFont(new Font("Times New Roman", Font.BOLD, 15));
        delete.setHorizontalAlignment(SwingConstants.LEFT);
        delete.setBackground(label);
        gui.add(delete);
        
        updatepwadmin = new JButton("Update Pass Adm");
        updatepwadmin.setBounds(300, 150, 170, 30);
        updatepwadmin.setFont(new Font("Times New Roman", Font.BOLD, 15));
        updatepwadmin.setHorizontalAlignment(SwingConstants.LEFT);
        updatepwadmin.setBackground(label);
        gui.add(updatepwadmin);
        
        updatentadmin = new JButton("Update NoTelp Adm");
        updatentadmin.setBounds(300, 200, 170, 30);
        updatentadmin.setFont(new Font("Times New Roman", Font.BOLD, 15));
        updatentadmin.setHorizontalAlignment(SwingConstants.LEFT);
        updatentadmin.setBackground(label);
        gui.add(updatentadmin);
        
        caridata = new JButton("Cari Data");
        caridata.setBounds(300, 250, 170, 30);
        caridata.setFont(new Font("Times New Roman", Font.BOLD, 15));
        caridata.setHorizontalAlignment(SwingConstants.LEFT);
        caridata.setBackground(label);
        gui.add(caridata);
        
        gui.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
        gui.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                if(JOptionPane.showConfirmDialog(gui, "Apakah anda ingin keluar?") == JOptionPane.OK_OPTION){
                    gui.setVisible(false);
                    gui.dispose();
                }
            }
        });

        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputGui inputgui = new InputGui();
                gui.dispose();
            }
        });

        lihat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LihatGui viewGUI = new LihatGui();
                gui.dispose();
            }
        });

        updatedosis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UbahDosisGui UbahDosisGui = new UbahDosisGui();
                gui.dispose();
            }
        });
        
        updatenotelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UbahNoTelp UbahNoTelp = new UbahNoTelp();
                gui.dispose();
            }
        });
        
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HapusDataGui deleteGUI = new HapusDataGui();
                gui.dispose();
            }
        });
        
        updatepwadmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UbahPasswordAdmin UbahPasswordAdmin = new UbahPasswordAdmin();
                gui.dispose();
            }
        });
        
        updatentadmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UbahNoTelpAdmin UbahNoTelpAdmin = new UbahNoTelpAdmin();
                gui.dispose();
            }
        });
        
        caridata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CekData cekcek = new CekData();
                gui.dispose();
            }
        });
        
        
    }

}
