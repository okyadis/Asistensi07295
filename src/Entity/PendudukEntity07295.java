package Entity;

public class PendudukEntity07295 extends UserEntityAbstract07295{
    private String nik,dosis,jns_vaksin;
    
    public PendudukEntity07295(){}
    public PendudukEntity07295(int id,String nik,String nama, String alamat,String noTelp,String dosis, String jns_vaksin){
        super(id,nama,alamat,noTelp);
        this.nik=nik;
        this.dosis=dosis;
        this.jns_vaksin=jns_vaksin;   
    }
    
    public String getNik(){
    return nik;
    }
    public void setNik(String nik){
    this.nik = nik;
    }
    
    public String getDosis(){
    return dosis;
    }
    public void setDosis(String dosis){
    this.dosis = dosis;
    }
    
    public String getJns_vaksin(){
    return jns_vaksin;
    }
    public void setJns_vaksin(String jns_vaksin){
    this.jns_vaksin = jns_vaksin;
    }    
    
    
    
}
