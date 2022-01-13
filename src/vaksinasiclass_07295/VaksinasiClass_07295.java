package vaksinasiclass_07295;
import Controller.PendudukController;
import Controller.AdminController;
import Entity.PendudukEntity07295;
import Gui.*;
import java.util.Scanner;


public class VaksinasiClass_07295 {
    public static Scanner input = new Scanner(System.in);
    public static PendudukController mhs = new PendudukController();
    public static AdminController admin = new AdminController();
    
    public static void main(String[] args) {
                int pil;
                LoginRegistrasiGui masuk = new LoginRegistrasiGui();
        do{
            System.out.println("Selmat Datang");
            System.out.println("1. Console");
            System.out.println("2. Gui");
            System.out.println("3. Keluar");
            pil = input.nextInt();
            switch(pil){
                case 1:
                    console();
                    break;
                case 2:
//                    LoginRegistrasiGui masuk = new LoginRegistrasiGui();
                    break;
                case 3:
                    System.out.println("Berhasil Keluar");
                    break;
            }
        }while(pil != 3);
        


    }
    
    public static void console(){
        int pil;
        do{
            System.out.println("Selmat Datang");
            System.out.println("1. Login");
            System.out.println("2. Registrasi");
            System.out.println("3. Keluar");
            pil = input.nextInt();
            switch(pil){
                case 1:
                    login();
                    break;
                case 2:
                    regisData();
                    break;
                case 3:
                    System.out.println("Berhasil Keluar");
                    break;
            }
        }while(pil != 3);
    }
        public static void login(){
            int kode;
        System.out.println("Nip : ");
        String nip = input.next();
        System.out.println("Password : ");
        String password = input.next();
        int cek = admin.login(nip, password);
        
        if(cek != 0){
            System.out.println("Login Berhasil");
            int pil;
            do{
//                showData();
                System.out.println("1. Tambah Data Penduduk");
                System.out.println("2. Lihat Data Penduduk");
                System.out.println("3. Ubah Dosis Penduduk");
                System.out.println("4. Ubah No Telp Penduduk");
                System.out.println("5. Hapus Data Penduduk");
                System.out.println("6. Ubah Password Admin");
                System.out.println("7. Ubah No Telp Admin");
                System.out.println("8. Cari Data Penduduk");
                System.out.println("9. Keluar");
                pil = input.nextInt();
                
                switch(pil){
                    case 1:
                        tambahdata();
                        break;
                    case 2:
                        lihatdata();
                        break;
                    case 3:
                        System.out.println("Masukan Id yang diubah :");
                        kode = input.nextInt();
                        updatedosispenduduk(kode);
                        break;
                    case 4:
                        System.out.println("Masukan Id yang diubah :");
                        kode = input.nextInt();
                        updatenotelppenduduk(kode);
                        break;
                    case 5:
                        hapusData();
                        break;
                    case 6:
                        updatepassadmin(cek);
                        break;
                    case 7:
                        updatenotelpadmin(cek);
                        break;
                    case 8:
                        cekData();
                        break;
                    case 9:
                        System.out.println("Keluar");
                        break;
                    default :
                        System.out.println("INPUTAN SALAH");
                }
            } while (pil <= 8);
        }else{
            System.out.println("GAGAL LOGIN");
        }
    }
        
    static void tambahdata(){
        System.out.println("Nik : ");
        String nik = input.next();
        System.out.println("Nama : ");
        String nama = input.next();
        System.out.println("Alamat : ");
        String alamat = input.next();
        System.out.println("No Telp : ");
        String noTelp = input.next();
        System.out.println("Dosis : ");
        String dosis = input.next();
        System.out.println("Jenis Vaksin : ");
        String jns_vaksin = input.next();
        mhs.insertData(nik, nama, alamat,noTelp, dosis,jns_vaksin);
    }
    
    static void cekData(){
        String cari;
        System.out.println("Nik Data yang dicari : ");
        cari = input.next();
        mhs.data(cari);
    }
    
    static void lihatdata(){
        showData();
    }
    static void regisData(){
//        System.out.println("id : ");
//        String id = input.next();
        System.out.println("Nip : ");
        String nip = input.next();
        System.out.println("Nama : ");
        String nama = input.next();
        System.out.println("Alamat : ");
        String alamat = input.next();
        System.out.println("Password : ");
        String password = input.next();
        System.out.println("No Telp : ");
        String noTelp = input.next();
        
        admin.insertData(nip, nama, alamat, password, noTelp);
    }
    
    static void updatepassadmin(int id){
        System.out.println("Masukkan Password Baru : ");
        String password = input.next();
        admin.updatePassword(password, id);
    }
    
    static void updatenotelpadmin(int id){
        System.out.println("Masukkan No Telp Baru : ");
        String noTelp = input.next();
        admin.updatenoTelp(noTelp, id);
    }
        static void showData(){
        for(PendudukEntity07295 mhsEnt : mhs.getDataPenduduk()){
            System.out.println("Id : " + mhsEnt.getId());
            System.out.println("Nik : " + mhsEnt.getNik());
            System.out.println("Nama : " + mhsEnt.getNama());
            System.out.println("Alamat : " + mhsEnt.getAlamat());
            System.out.println("No Telp : " + mhsEnt.getNoTelp());
            System.out.println("Dosis : " + mhsEnt.getDosis());
            System.out.println("Jenis Vaksin : " + mhsEnt.getJns_vaksin());
        } 
    }
    
    static void showData(int id){
        for(PendudukEntity07295 mhsEnt : mhs.getById(id)){
            System.out.println("Id : " + mhsEnt.getId());
            System.out.println("Nik : " + mhsEnt.getNik());
            System.out.println("Nama : " + mhsEnt.getNama());
            System.out.println("Alamat : " + mhsEnt.getAlamat());
            System.out.println("No Telp : " + mhsEnt.getNoTelp());
            System.out.println("Dosis : " + mhsEnt.getDosis());
            System.out.println("Jenis Vaksin : " + mhsEnt.getJns_vaksin());
        }
    }
    
    static void hapusData(){
        System.out.println("Hapus id : ");
        int id = input.nextInt();
        admin.deleteData(id);
    }
    
    static void updatedosispenduduk(int id){
//                    System.out.print("Input id yang ingin dirubah : ");
//            String id = input.next();
        System.out.println("Masukkan Dosis Baru : ");
        String dosis = input.next();
        mhs.updateDosis(dosis, id);
    }
    
    static void updatenotelppenduduk(int id){
        System.out.println("Masukkan No Telp Baru : ");
        String noTelp = input.next();
        mhs.updateNoTelp(noTelp, id);
    }
    
}
