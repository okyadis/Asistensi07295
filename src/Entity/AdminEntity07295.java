package Entity;

public class AdminEntity07295 extends UserEntityAbstract07295 {
    private String nip;
    private String password;
    
    public AdminEntity07295(int id,String nip, String nama, String alamat, String password, String noTelp){
        super(id,nama,alamat,noTelp);
        this.nip=nip;
        this.password=password;
    }
    public AdminEntity07295(String nip, String nama, String alamat, String password, String noTelp){    }

    public AdminEntity07295() {}

    public String getNip(){
    return nip;
    }
    public void setNip(String nip){
    this.nip = nip;
    }
    
    public String getPassword(){
    return password;
    }
    public void setPassword(String password){
    this.password = password;
    }
}
