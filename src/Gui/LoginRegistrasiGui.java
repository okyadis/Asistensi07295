package Gui;
import Controller.AllObjectModel;
import javax.swing.*;
import java.awt.*; 
import java.awt.event. ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent; 
import java.io.File; 
import java.io.IOException; 
import java.util.logging. Level;
 import java.util.logging. Logger;
import javax.imageio.ImageIO;

public class LoginRegistrasiGui extends ComponentGui07295{
JButton btnregistrasi = new JButton("REGISTRASI");
String pathicon;

public LoginRegistrasiGui(){
initComponent();
}

void initComponent() {
setTitle("Login Admin");

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setSize(320,480); 
    setLocationRelativeTo(null); 
    getContentPane().setBackground(Color.white);
    setLayout(null); 
    setVisible(true);

    labelnip.setBounds (35,250,40,25); 
    add(labelnip); 
    fieldnip.setBounds(130,250,130,25);
    add(fieldnip);

    labelpassword.setBounds (35, 290,80, 25);
    add(labelpassword); 
    fieldpassword.setBounds (130, 290, 130,25); 
    add(fieldpassword);
    
    btnlogin.setBounds (110,350,100,25);
    btnlogin.setBackground (Color.black);
    btnlogin.setForeground (Color.white);
    btnlogin.setBorder(null); 
    add(btnlogin);

    btnregistrasi.setBounds(70,400,180,25);
    btnregistrasi.setBorder(null);

    btnregistrasi.setBackground (Color.white);
    add(btnregistrasi);
    bingkaigambar.setBounds (80,70,150, 150);
    add(bingkaigambar);
    pathicon = "./src/image/admin.png";
    try {
        
    bufferedimage = ImageIO.read(new File(pathicon));
    } catch (IOException ex) {
    Logger.getLogger(LoginRegistrasiGui.class.getName()).log(Level.SEVERE, null, ex);
}
    gambarresize = bufferedimage.getScaledInstance(150, 150, Image.SCALE_SMOOTH);


    bingkaigambar.setIcon(new ImageIcon(gambarresize));
    btnregistrasi.addMouseListener(new MouseAdapter() {

    @Override
    public void mouseEntered(MouseEvent e) {
    btnregistrasi. setForeground (Color.blue);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    btnregistrasi.setForeground (Color.black);
    }
    });

    btnregistrasi.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e){
        dispose();
        RegistrasiAdminGui main = new RegistrasiAdminGui();
    }
});

    btnlogin.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed (ActionEvent e) {
    String nip = fieldnip.getText();
    String password = fieldpassword.getText();
    int cek = AllObjectModel.adminModel.cekLogin(nip, password); 
    if (cek>0){
    dispose();
    PilihGui main = new PilihGui();

        }else {
    JOptionPane.showMessageDialog(null, "GAGAL LOGIN");
    kosong();
        }
}
   });
    
}
}

