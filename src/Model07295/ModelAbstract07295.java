package Model07295;

import helper.KoneksiDb07295;
import java.sql.*;
public abstract class ModelAbstract07295 {
    public Connection conn= KoneksiDb07295.getconnection();
    
    public abstract int updatenoTelp(String noTelp, int id);
    
}
