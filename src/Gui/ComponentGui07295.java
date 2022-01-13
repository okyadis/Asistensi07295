package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ComponentGui07295 extends JFrame {

protected JButton btnregister = new JButton ("REGISTRASI");
protected JButton btnnotreg = new JButton ("BELUM REGISTRASI ?");
protected JButton btnlogin = new JButton("LOG IN");
protected JButton btnback = new JButton("<<LOG OUT");
protected JButton btndelete = new JButton("DELETE");
protected JButton btnverif = new JButton("VERIF");

protected JLabel labelregister = new JLabel("REGISTER");
protected JLabel labellogin = new JLabel("LOGIN");
protected JLabel labelid = new JLabel("ID");
protected JLabel labelnik = new JLabel("NIK");
protected JLabel labelnip = new JLabel("NIP");
protected JLabel labelnama = new JLabel("NAMA");
protected JLabel labelalamat = new JLabel("ALAMAT");
protected JLabel labeldosis = new JLabel("DOSIS");
protected JLabel labeljns_vaksin = new JLabel("VAKSIN");
protected JLabel labelnpm = new JLabel("NPM");
protected JLabel labelpassword = new JLabel("PASSWORD");
protected JLabel labelnotelp = new JLabel("NO TELP");

protected JLabel bingkaigambar = new JLabel();

protected JTextField fieldnip  = new JTextField();
protected JTextField fieldnama  = new JTextField();
protected JTextField fieldalamat  = new JTextField();
protected JTextField fieldnik  = new JTextField();
protected JTextField fielddosis  = new JTextField();
protected JTextField fieldjns_vaksin  = new JTextField();
protected JPasswordField fieldpassword  = new JPasswordField();
protected JTextField fieldnotelp  = new JTextField();

protected JButton btnubahnama = new JButton("ubah");
protected JButton btnubahnpm = new JButton("ubah");
protected JButton btnubahpassword = new JButton("ubah");
protected JButton btnubahnotelp = new JButton("ubah");
protected JButton btnubahgambar = new JButton("upload");


BufferedImage bufferedimage = null;
java.awt.Image gambarresize;

void kosong(){
    fieldnip.setText(null);
    fieldnama.setText(null);
    fieldalamat.setText(null);
    fieldpassword.setText(null);
    fieldnotelp.setText(null);
}

}
