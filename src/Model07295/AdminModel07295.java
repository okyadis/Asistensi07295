
package Model07295;
import Entity.AdminEntity07295;
import java.sql.*;


public class AdminModel07295 extends ModelAbstract07295{
    private String sql;
    
    
    public void insertData(AdminEntity07295 adminEntity){
        try{
            sql = "INSERT INTO admin (nip, nama,alamat, password, noTelp)Values(?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
//            stat.setInt(1, adminEntity.getId());
            stat.setString(1, adminEntity.getNip());
            stat.setString(2, adminEntity.getNama());
            stat.setString(3, adminEntity.getAlamat());
            stat.setString(4, adminEntity.getPassword());
            stat.setString(5, adminEntity.getNoTelp());
            stat.executeUpdate();
        }catch (SQLException e){
            System.out.println("GAGAL INPUT !!!");
            System.out.println(e);
        }
    }
        
    public void updatePassword(String password, int id){
            try{
            sql = "update admin SET password =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, password);
            stat.setInt(2, id);
            stat.executeUpdate();
        }catch (SQLException e){
            System.out.println("GAGAL INPUT !!!");
            System.out.println(e);
        }
    }
    
    public int updatenoTelp(String noTelp, int id){
        int nol=0;
        try{
            sql = "update admin SET noTelp =? WHERE id =?";
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
    
    public int cekLogin (String nip,String password){
        int cek = 0;
        try {
            sql = "SELECT * FROM admin where nip = ? and password = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nip);
            stat.setString(2, password);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                cek = rs.getInt("id");
            }else{
                cek = 0;
            }
        }catch(Exception e){
            e.printStackTrace();
        }return cek;
    }
    
    public void deleteData (int id){
         try{
            sql = "DELETE FROM penduduk WHERE id = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            stat.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
