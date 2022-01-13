package Controller;
import Entity.PendudukEntity07295;
import Model07295.PendudukModel07295;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PendudukController extends AllObjectModel{
    
    public PendudukModel07295 GudangModel = new PendudukModel07295();
    public void insertData(String nik, String nama, String alamat, String noTelp ,String dosis, String jns_vaksin){
        PendudukEntity07295 pendudukEntities = new PendudukEntity07295();
        
        pendudukEntities.setNik(nik);
        pendudukEntities.setNama(nama);
        pendudukEntities.setAlamat(alamat);
        pendudukEntities.setNoTelp(noTelp);
        pendudukEntities.setDosis(dosis);
        pendudukEntities.setJns_vaksin(jns_vaksin);
        AllObjectModel.pendudukModel.insertData(pendudukEntities);
    }
    
    public void updateDosis(String dosis, int id){
    AllObjectModel.pendudukModel.updateDosis(dosis,id);
    }
    
    public void updateNoTelp(String noTelp, int id){
    AllObjectModel.pendudukModel.updateNoTelp(noTelp,id);
    }
    
    public DefaultTableModel daftarPenduduk(){

    DefaultTableModel dataDaftarMahasiswa = new DefaultTableModel();
    Object[] kolom = {"id","nik","nama","alamat","noTelp","dosis","Jenis Vaksin"};

    dataDaftarMahasiswa.setColumnIdentifiers(kolom);
    int size=getDataPenduduk().size();
    for(int i = 0; i< size ;i++){
        Object []data=new Object[7];

        data[0]=GudangModel.getPenduduk().get(i).getId();
        data[1]=GudangModel.getPenduduk().get(i).getNik();
        data[2]=GudangModel.getPenduduk().get(i).getNama();
        data[3]=GudangModel.getPenduduk().get(i).getAlamat();
        data[4]=GudangModel.getPenduduk().get(i).getNoTelp();
        data[5]=GudangModel.getPenduduk().get(i).getDosis();
        data[6]=GudangModel.getPenduduk().get(i).getJns_vaksin();

        dataDaftarMahasiswa.addRow(data);

    }
    return dataDaftarMahasiswa;

}

    public ArrayList<PendudukEntity07295> getDataPenduduk(){
        return  AllObjectModel.pendudukModel.getPenduduk();
    }
    
    public int data(String nik){
        int cek = AllObjectModel.pendudukModel.cekData(nik);
        return cek;
    }
    
        public String datagui(String nik){
        String nama = AllObjectModel.pendudukModel.cekDataGui(nik);
        return nama;
    }
    
    public ArrayList<PendudukEntity07295> getById(int cekData){
        return  AllObjectModel.pendudukModel.getPenduduk(cekData);
    }
    

    
}
