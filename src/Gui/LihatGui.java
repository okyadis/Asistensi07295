package Gui;
import Controller.PendudukController;
import Gui.PilihGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class LihatGui {
    static PendudukController gudang = new PendudukController();
    JFrame view = new JFrame();
    JTable tabel = new JTable();
    JScrollPane scrolltabel = new JScrollPane(tabel);
    JLabel title;
    JButton back;

    public LihatGui() {
        view.setSize(600, 400);
        view.setLayout(null);
        Color back = new Color(255, 255, 255);
        view.getContentPane().setBackground(back);

        scrolltabel.setBounds(50, 100, 500, 250);
        tabel.setModel(gudang.daftarPenduduk());
        view.add(scrolltabel);

        title = new JLabel("Data Vaaksin Pendududk");
        title.setBounds(60, 30, 500, 50);
        title.setFont(new Font("Times New Roman", Font.BOLD, 43));
        title.setForeground(Color.black);
        Color label = new Color(169, 255, 226);
        view.add(title);

        view.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(view, "Apakah anda ingin keluar?") == JOptionPane.OK_OPTION) {
                    view.setVisible(false);
                    view.dispose();
                    PilihGui main = new PilihGui();
                }
            }
        });
    }


}
