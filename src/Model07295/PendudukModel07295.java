
package Model07295;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Entity.PendudukEntity07295;
import helper.KoneksiDb07295;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class PendudukModel07295 {
    private String sql;
    public Connection conn= KoneksiDb07295.getconnection();
    
    
        public ArrayList<PendudukEntity07295> getPenduduk(){
        ArrayList<PendudukEntity07295> arrListMhs = new ArrayList<>();
        try{
            Statement stat = conn.createStatement();
            sql = "SELECT *FROM penduduk";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                PendudukEntity07295 mhs = new PendudukEntity07295();
                mhs.setId(rs.getInt("id"));
                mhs.setNik(rs.getString("nik"));
                mhs.setNama(rs.getString("nama"));
                mhs.setAlamat(rs.getString("alamat"));
                mhs.setNoTelp(rs.getString("notelp"));
                mhs.setDosis(rs.getString("dosis"));
                mhs.setJns_vaksin(rs.getString("jns_vaksin"));
                arrListMhs.add(mhs);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return arrListMhs;
        }
        
        public ArrayList<PendudukEntity07295> getPenduduk(int id){
        ArrayList<PendudukEntity07295> arraylistMahasiswa= new ArrayList<>();
        try{
            Statement stat=conn.createStatement();
            sql="SELECT*FROM penduduk";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                PendudukEntity07295 mahasiswaentity=new PendudukEntity07295();
                mahasiswaentity.setId(rs.getInt("id"));
                mahasiswaentity.setNik(rs.getString("nik"));
                mahasiswaentity.setNama(rs.getString("nama"));
                mahasiswaentity.setAlamat(rs.getString("alamat"));
                mahasiswaentity.setDosis(rs.getString("dosis"));
                mahasiswaentity.setJns_vaksin(rs.getString("jns_vaksin"));
                arraylistMahasiswa.add(mahasiswaentity);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return arraylistMahasiswa;
    }
    
    public void insertData(PendudukEntity07295 mhsEntity){
        try{
            sql = "INSERT INTO penduduk (nik, nama, alamat,noTelp, dosis, jns_vaksin) Values(?,?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, mhsEntity.getNik());
            stat.setString(2, mhsEntity.getNama());
            stat.setString(3, mhsEntity.getAlamat());
            stat.setString(4, mhsEntity.getNoTelp());
            stat.setString(5, mhsEntity.getDosis());
            stat.setString(6, mhsEntity.getJns_vaksin());
            
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) update!");
        }catch (SQLException e){
            System.out.println("GAGAL INPUT DATA");
        }
    }
    
        public int updateNoTelp(String noTelp, int id){
        int nol=0;
        try{
            sql = "update penduduk SET noTelp =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, noTelp);
            stat.setInt(2, id);
            stat.executeUpdate();
        }catch (SQLException e){
            System.out.println("GAGAL INPUT !!!");
            System.out.println(e);
        }
        return nol;
    }
        
        public void updateDosis(String dosis, int id){
        try{
            sql = "update penduduk SET dosis =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, dosis);
            stat.setInt(2, id);
            stat.executeUpdate();
        }catch (SQLException e){
            System.out.println("GAGAL UBAH NAMA !!!");
            e.printStackTrace();
        }
    }
    
    public int cekData(String nik){
        int cek = 0;
        try{
            sql ="SELECT * FROM penduduk WHERE nik = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nik);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                cek = rs.getInt("id");
                String nama = rs.getString("nama");
                System.out.println("Selmaat Datang " + nama);
//                JOptionPane.showMessageDialog("Selamat Datang");
            }else {
                cek = 0;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return cek;
    }
    

    public String cekDataGui(String nik){
        int cek = 0;
        String nama = null;
        try{
            sql ="SELECT * FROM penduduk WHERE nik = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nik);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                cek = rs.getInt("id");
                nama = rs.getString("nama");
                System.out.println("Selmaat Datang " + nama);
//                JOptionPane.showMessageDialog("Selamat Datang");
            }else {
                cek = 0;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("nama : "+nama);
        return nama;
    }
}
