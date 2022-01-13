package Entity;

/**
 *
 * @author okky
 */
public abstract class UserEntityAbstract07295 {
    protected int id;
    protected String nama,alamat,noTelp;
    
    
    public UserEntityAbstract07295(){}
    public UserEntityAbstract07295(int id,String nama, String alamat,String noTelp){
        this.id= id;
        this.nama=nama;
        this.alamat=alamat;
        this.noTelp=noTelp;   
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNoTelp(){
        return noTelp;
    }
    public void setNoTelp(String noTelp){
    this.noTelp=noTelp;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    
}
