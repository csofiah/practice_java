package mitocode.java.se.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    protected Connection conexion;

    //JDBC driveer y base de datos
    private final String JDBC_DRIVER = "org.postgre.Driver";
    private final String DB_URL = "jdbc:postgresql://localhost:5432/ejemplo";

    //base datos credenciales
    private final String USER = "postgres";
    private final String PASS = "123";

    public void conectar() throws Exception{
        try{
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
        }catch(Exception e){
            throw e;
        }
    }

    public void cerrar() throws SQLException{
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }



}
