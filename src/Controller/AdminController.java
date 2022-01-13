package Controller;
import Entity.AdminEntity07295;

public class AdminController extends AllObjectModel{
    
    public void insertData(String nip, String nama, String alamat, String password, String noTelp){
        AdminEntity07295 adminEntities = new AdminEntity07295();
        
        adminEntities.setNip(nip);
        adminEntities.setNama(nama);
        adminEntities.setAlamat(alamat);
        adminEntities.setPassword(password);
        adminEntities.setNoTelp(noTelp);
        AllObjectModel.adminModel.insertData(adminEntities);
//        AllObjectModel.adminModel.insertData(new AdminEntity07295(nip,nama,alamat,password,noTelp));
    }
    
    public void updatePassword(String pass, int id){
        AllObjectModel.adminModel.updatePassword(pass,id);
    }
    
     public void updatenoTelp(String noTelp, int id){
        AllObjectModel.adminModel.updatenoTelp(noTelp,id);
    }
    
    public int login (String nip,String password){
        int log =AllObjectModel.adminModel.cekLogin(nip,password);
        return log;
    }
     
    public void deleteData(int id){
        AllObjectModel.adminModel.deleteData(id);
    }
    

    
}
